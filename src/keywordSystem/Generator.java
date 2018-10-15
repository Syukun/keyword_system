package keywordSystem;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Vector;
import keywordSystem.Type;

public abstract class Generator {
	/*
	 * the problem is maxExpression_BeamWidth just represent current 
	 * max Expressions therefore it is hard to 
	 */
	/*
	 * the constant using in beam search.
	 */
	public static int BEAMWIDTH = 6;
	
	public static void setBeamWidth(int i) {
		Generator.BEAMWIDTH=i;
	}
	
	
//	/*
//	 * store first BEAMWIDTH-th expressions with max score in each depth and each types.
//	 */
//	public static Vector<MaxExpression> allMaxExpression;
//	/*
//	 * store first BEAMWIDTH-th expressions with max score in each types.
//	 */
////	public static Map<Type,Vector<Expression>> maxExpressions_BeamWidth = new HashMap<>();
//	
//	public static LinkedList<Map<Type,Vector<Expression>>> maxExps_BeamWidth = new LinkedList<Map<Type,Vector<Expression>>>();
	
	// 记录每层最大beamWidth个式子
	static Vector<Map<Type,Vector<Expression>>> maxBeamWidthExpressionsAtExactDepth = new Vector<Map<Type,Vector<Expression>>>();
	// 小于等于depth下beamWidth个式子
	static Vector<Map<Type,Vector<Expression>>> maxBeamWidthExpressionsLeqDepth = new Vector<Map<Type,Vector<Expression>>>();
	/*
	 * return the type array of each parameter.
	 */
	abstract Type[] types();
	/*
	 * Add all generators which extends Class Generator
	 */
	abstract void addGenerator(Type t, Vector<Generator> allGeneratorWithTypeT);
	
	/*
	 * most important function in this class. 
	 * generate first BEAMWIDTH-th expressions with max score using beam search.
	 * which means is not the optimal solution.
	 */
	public static Vector<Expression> generateExact(int depth,String keywords){
		Vector<Expression> result = new Vector<Expression>();
		// could delete later
		Type.initAllType();
		fillTwoTable(depth, keywords);
		for(Vector<Expression> exps :  Generator.maxBeamWidthExpressionsLeqDepth.get(depth).values()) {
			result.addAll(exps);
		}
		Generator.selectMaxExpressions(result, keywords);
		return result;		
	}
	private static void fillTwoTable(int depth,String keywords) {
		initialization();
		for(int d = 1; d <= depth ; d++) {
			Generator.generateExpressions(d,keywords);
		}
	}

	/*
 * 	initialization
 */
	private static void initialization() {
		Map<Type,Vector<Expression>> initElement = new HashMap<Type,Vector<Expression>>();
		for(Type t:Type.allType) {
			initElement.put(t, new Vector<Expression>());
		}
		Generator.maxBeamWidthExpressionsAtExactDepth.add(initElement);
		Generator.maxBeamWidthExpressionsLeqDepth.add(initElement);
	}
	private static void generateExpressions(int depth,String keywords) {
		Map<Type,Vector<Expression>> maxExpsWithTypeT_Map = new HashMap<Type,Vector<Expression>>();
		Map<Type,Vector<Expression>> maxExpsWithTypeTLeqDepth_Map = new HashMap<Type,Vector<Expression>>();
		for(Type t: Type.allType) {
			Vector<Expression> maxExpsWithTypeT = new Vector<Expression>();
			for(Generator g: Generator.allExpressionGeneratorsWithTypeT(t)) {
				g.generateExactAtDepth(depth, maxExpsWithTypeT,keywords);
			}
			if(depth>1) {
				selectMaxExpressions(maxExpsWithTypeT,keywords);
			}
			maxExpsWithTypeT_Map.put(t, maxExpsWithTypeT);
			
			if(depth < 2) {
				maxExpsWithTypeTLeqDepth_Map.put(t, maxExpsWithTypeT);
			}else {	
				Vector<Expression> maxExpressionLeqDepth = new Vector<Expression>();
				maxExpressionLeqDepth.addAll(maxExpsWithTypeT);
				maxExpressionLeqDepth.addAll(maxBeamWidthExpressionsLeqDepth.get(depth-1).get(t));
				selectMaxExpressions(maxExpressionLeqDepth,keywords);
				maxExpsWithTypeTLeqDepth_Map.put(t, maxExpressionLeqDepth);
			}
		}
		Generator.maxBeamWidthExpressionsAtExactDepth.add(maxExpsWithTypeT_Map);
		Generator.maxBeamWidthExpressionsLeqDepth.add(maxExpsWithTypeTLeqDepth_Map);
	}

	// record the number of expressions in each depth ;; modified later
	// or this should use set instead of vector
	private static Vector<Expression> getMaxExpressionsExactAtDepth(int depth, Type type) {
		
		return Generator.maxBeamWidthExpressionsAtExactDepth.get(depth).get(type);

	}


	private Vector<Expression> getMaxExpressionsLeqDepth(int depth, Type type) {
		
		return Generator.maxBeamWidthExpressionsLeqDepth.get(depth).get(type);
	}

	// generate expressions at depth
	protected void generateExactAtDepth(int depth, Vector<Expression> result,String keywords) {
		if (this.types().length == 0 && depth == 1) {
			generateWithSubExps(new Expression[0], result);
		} else if(depth > 1){
			generateWithArityExpression(depth,result);
		}
	}

	private void generateWithArityExpression(int depth, Vector<Expression> result) {
		int arity = this.types().length;
		for (int exactFlags = 1; exactFlags <= (1 << arity) - 1; exactFlags++) {
			Expression[] subExps = new Expression[arity];
			generateWithSubExpsExactAtDepth(depth, exactFlags, arity, subExps, result);
		}
	}

	private void generateWithSubExpsExactAtDepth(int depth, int exactFlags, int rank, Expression[] subExps,
			Vector<Expression> result) {
		if (rank == 0) {
			// all generated, use subExps
			generateWithSubExps(subExps, result);
		} else {
			Vector<Expression> candidates = isBitOn(exactFlags, rank - 1) ?
			/*
			 * exactFlag = 1 , 2 , 3 の場合 つまり depth = 2; exactFlag rank-1 01 10 ==> 00 ==>
			 * false 01 01 ==> 01 ==> true 10 10 ==> 10 ==> true 10 01 ==> 00 ==> false 11
			 * 10 ==> 10 ==> true 11 01 ==> 01 ==> true
			 */

					getMaxExpressionsExactAtDepth(depth - 1,this.types()[rank-1])
					: getMaxExpressionsLeqDepth(depth - 2, this.types()[rank-1]);

			// generate subexpression at rank
			for (Expression e : candidates) {
				subExps[rank - 1] = e;
				generateWithSubExpsExactAtDepth(depth, exactFlags, rank - 1, subExps, result);

			}

		}
	}

	private boolean isBitOn(int x, int i) {
		return (x & (1 << i)) != 0;
	}
	abstract void generateWithSubExps(Expression[] subExps, Vector<Expression> result);
/*
 * 引数を加えて、型ごとに違うのgenerator集合を返す。
 */
	private static Vector<Generator> allExpressionGeneratorsWithTypeT(Type t) {
		Vector<Generator> allGenerator_typeT = new Vector<Generator>();
		for(Generator g:Generator.allExpressionGenerator()) {
			g.addGenerator(t,allGenerator_typeT);
		}
		return allGenerator_typeT;
	}
	
	private static Generator[] allExpressionGenerator(){
		return new Generator[] {
				new IntGenerator(),new VarGenerator(),
				new BinaryOpGenerator(),
				new MethodInvocationGenerator()
		};
	}

	public static void selectMaxExpressions(Vector<Expression> result, String keywords) {
		Collections.sort(result,new Comparator<Expression>() {
			@Override
			public int compare(Expression e1, Expression e2) {
				// TODO Auto-generated method stub
				if(e1.getScore(keywords)>e2.getScore(keywords)) {
					return -1;
				}else if(e1.getScore(keywords) == e2.getScore(keywords)) {
					return 0;
				}else {
					return 1;
				}
			}
			
		});
		Vector<Expression> temp = new Vector<Expression>();
		int count = 0;
		while(count < BEAMWIDTH) {
			if(count < result.size()) {
				temp.add(result.get(count));
			}else {
				break;
			}
			count ++;
		}
		result.clear();
		result.addAll(temp);

	}

}
