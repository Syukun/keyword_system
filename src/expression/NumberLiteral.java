package expression;

public class NumberLiteral extends Expression {
	private int i;
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(i);
	}
	
	public NumberLiteral(int i) {
		this.i = i;
	}


	public String getToken() {
		return String.valueOf(i);
	}


	public void setI(int i) {
		this.i = i;
	}

}
