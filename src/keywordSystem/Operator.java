package keywordSystem;

import java.util.List;
import java.util.Vector;
import keywordSystem.Expression;

public class Operator {

	String operator;
	Type[] types;

	public Operator(String operator, Type[] types) {
		this.operator = operator;
		this.types = types;
	}

	public static Vector<Operator> allOperator() {
		Vector<Operator> allOperator = new Vector<Operator>();
//		allOperator.add(new Operator("+", new Type[] { new Type("Integer"), new Type("Integer") }));
//		allOperator.add(new Operator("+", new Type[] { new Type("String"), new Type("String") }));
		return allOperator;
	}

	public String toString() {
		return operator;
	}

	public float getScore(List<String> keywords) {
		float score = Expression.DEFSCORE;
		if (keywords.contains(this.operator)) {
			score = Expression.addPrecise(score, Expression.WIK);
			keywords.remove(this.operator);

		} else {
			score = Expression.addPrecise(score, -Expression.WNIK);
		}

		return score;
	}

}