package expression;

import java.util.List;

public class MemberValuePair {
	SimpleName name;
	Expression value;
	
	public MemberValuePair(SimpleName name, Expression exp) {
		this.name = name;
		this.value = exp;
	}
	
	public String toString() {
		return name.toString() + "=" + value.toString();
	}
	
//	public float getScore(List<String> keywords) {
//		float score = Expression.DEFSCORE;
//		score += name.getScore()+value.getScore();
//		return score;
//	}
}
