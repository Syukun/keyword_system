package keywordSystem;

import java.util.Vector;

public class IntGenerator extends Generator {
	Vector<Expression> allIntExpressionWithTypeT = new Vector<Expression>();
	static Vector<Expression> allIntExpression = new Vector<Expression>();
	@Override
	void addGenerator(Type t, Vector<Generator> allGeneratorWithTypeT) {
		if(t.equals(new Type("Integer"))) {
			allIntExpressionWithTypeT.addAll(this.getAllIntExpression());
		}
		allGeneratorWithTypeT.add(this);
	}
	public static void addToAllExpression(String num) {
		if(!allIntExpression.contains(new Int(num))) {
			allIntExpression.add(new Int(num));
		}
	}

	void generateWithSubExps(Expression[] subExps, Vector<Expression> result) {

		result.addAll(allIntExpressionWithTypeT);

	}


	private Vector<Expression> getAllIntExpression() {
		Vector<Expression> allIntExpression = new Vector<Expression>();
		allIntExpression.addAll(IntGenerator.allIntExpression);
		return allIntExpression;
	}



	@Override
	Type[] types() {
		// TODO Auto-generated method stub
		return new Type[] {};
	}


}

