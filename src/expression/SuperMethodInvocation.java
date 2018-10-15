package expression;

import java.util.Vector;

public class SuperMethodInvocation extends Expression {

	Name className;
	/*
	 * omit types right now
	 * @see codeCompletionExample.Expression#toString()
	 */
	SimpleName identifier;
	Vector<Expression> arguments;
	
	public SuperMethodInvocation(SimpleName identifier, Vector<Expression> args) {
		this.identifier =identifier;
		this.arguments = args;
	}
	public SuperMethodInvocation(Name className,SimpleName identifier,Vector<Expression> args) {
		this.className = className;
		this.identifier = identifier;
		this.arguments = args;
	}
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("super."+identifier.toString()+"(");
		String separator = "";
		for(Expression arg:arguments) {
			result.append(separator + arg.toString());
			separator = ",";
		}
		result.append(")");
		return className==null?
				result.toString()
				:className.toString()+"."+result.toString();
	}

}
