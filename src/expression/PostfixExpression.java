package expression;

public class PostfixExpression extends Expression{
	Expression operand;
	PostfixOperator operator;
	
	public PostfixExpression(Expression exp,PostfixOperator op) {
		this.operand = exp;
		this.operator = op;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return operand.toString()+operator.toString();
	}
	
	
}
