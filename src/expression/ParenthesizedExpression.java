package expression;

public class ParenthesizedExpression extends Expression {

	private Expression exp;
	
	public ParenthesizedExpression(Expression exp) {
		this.exp = exp;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + exp.toString() + ")";
	}

	public Expression getExp() {
		return exp;
	}

	public void setExp(Expression exp) {
		this.exp = exp;
	}

}
