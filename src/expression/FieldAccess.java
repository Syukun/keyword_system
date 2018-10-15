package expression;

public class FieldAccess extends Expression{
	Expression exp;
	SimpleName id;
	
	public FieldAccess(Expression exp, SimpleName id) {
		this.exp = exp;
		this.id = id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return exp.toString() + "." + id.toString();
	}

}
