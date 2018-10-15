package expression;

public class BooleanLiteral extends Expression{
	boolean b;
	public BooleanLiteral(boolean b) {
		this.b = b;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(b);
	}
	
	
}
