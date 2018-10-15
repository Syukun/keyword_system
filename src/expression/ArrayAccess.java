package expression;

public class ArrayAccess extends Expression{
	Expression arrayExp;
	Expression indexExp;
	
	public ArrayAccess(Expression exp1,Expression exp2) {
		this.arrayExp = exp1;
		this.indexExp = exp2;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return arrayExp.toString() + "[" + indexExp.toString() + "]";
	}

	
}
