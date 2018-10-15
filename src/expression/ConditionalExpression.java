package expression;

public class ConditionalExpression extends Expression{
	Expression conditionExpression;
	Expression thenExpression;
	Expression elseExpression;
	
	public ConditionalExpression(Expression exp1,Expression exp2,Expression exp3) {
		this.conditionExpression = exp1;
		this.thenExpression = exp2;
		this.elseExpression = exp3;
	}
	
	public String toString() {
		return conditionExpression.toString() + "?" + thenExpression.toString() + ":" + elseExpression.toString();
	}
	
}
