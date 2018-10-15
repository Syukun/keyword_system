package expression;

import org.eclipse.jdt.core.dom.Type;

public class InstanceOfExpression extends Expression {
	Expression exp;
	Type t;
	
	public InstanceOfExpression(Expression exp, Type t) {
		this.exp = exp;
		this.t = t;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return exp.toString() + "instanceOf" + t.toString();
	}

}
