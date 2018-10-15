package expression;

public class SuperFieldAccess extends Expression {
	/*
	 * omit the className first
	 * @see codeCompletionExample.Expression#toString()
	 */
	Name className;
	SimpleName identifier;
	public SuperFieldAccess(SimpleName id) {
		this.identifier = id;
	}
	public SuperFieldAccess(Name className,SimpleName id) {
		this.className = className;
		this.identifier = id;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return className == null?
				"super."+this.identifier.toString():
					className.toString() + ".super." + this.identifier.toString();
	}

}
