package expression;

public class Assignment extends Expression{
	Expression leftExp;
	Expression rightExp;
	AssignmentOperator operator;
	
	public Assignment(Expression leftExp,AssignmentOperator operator,Expression rightExp) {
		this.leftExp = leftExp;
		this.operator = operator;
		this.rightExp = rightExp;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return leftExp.toString() + operator.toString() + rightExp.toString();
	}
	
	
}
