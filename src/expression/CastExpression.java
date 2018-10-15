package expression;

import org.eclipse.jdt.core.dom.Type;

public class CastExpression extends Expression{
	Type t;
	Expression exp;
	public CastExpression(Type t,Expression exp) {
		this.t = t;
		this.exp = exp;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + t.toString() + ")" + exp.toString();
	}
	
}
