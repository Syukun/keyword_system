package expression;

public class StringLiteral extends Expression {
	String s;
	
	public StringLiteral(String s) {
		this.s = s;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return s;
	}

}
