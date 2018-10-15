package expression;

public class PrefixExpression extends Expression {
	Expression operand;
	PrefixOperator operator;
	
	public PrefixExpression(Expression exp,PrefixOperator operator) {
		this.operand = exp;
		this.operator = operator;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return operator.toString() + operand.toString();
	}

}
