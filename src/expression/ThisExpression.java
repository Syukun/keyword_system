package expression;

public class ThisExpression extends Expression {
	Name className;
	public ThisExpression() {
		
	}
	public ThisExpression(Name qualifier) {
		this.className = qualifier;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return className==null?"this":className.toString()+".this";
	}

}
