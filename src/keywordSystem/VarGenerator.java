package keywordSystem;

import java.util.Vector;

public class VarGenerator extends Generator {

	// add Var Expression function could be added later
	
	Vector<Expression> allVarExpressionWithTypeT = new Vector<Expression>();
	static Vector<Expression> allVarExpression = new Vector<Expression>();
	/*
	 * given Type and keyword , return all expressions with type belong Type 
	 * and has the bigest score according to keywords
	 */
	@Override
	void generateWithSubExps(Expression[] subExps, Vector<Expression> result) {
		result.addAll(allVarExpressionWithTypeT);
	}

	@Override
	void addGenerator(Type t, Vector<Generator> allGeneratorWithTypeT) {
		for(Expression varExpression:this.getAllVarExpression()) {
			if(varExpression.getType().equals(t)) {
				this.allVarExpressionWithTypeT.add(varExpression);
			}
		}
		allGeneratorWithTypeT.add(this);
	}
	
	

	private Vector<Expression> getAllVarExpression() {
		Vector<Expression> allVarExpression = new Vector<Expression>();
		allVarExpression.addAll(VarGenerator.allVarExpression);
		return allVarExpression;
	}

	public static void addToAllVarExpression(String typeName,String variableName) {
		Var v = new Var(variableName,new Type(typeName));
		if(!allVarExpression.contains(v)) {
			allVarExpression.add(v);	
		}
	}


	@Override
	Type[] types() {
		return new Type[] {};
	}


}
