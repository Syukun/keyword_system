package classes;

import names.ExpressionName;

/*
 * ExplicitConstructorInvocation_four:
 * 		Primary . [TypeArguments] super ( [ArgumentList] ) ;
 */
public class ExplicitConstructorInvocation_four implements ExplicitConstructorInvocation {
	Primary primary;
	ExplicitConstructorInvocation_two explicitConstructorInvocation;
	

	
	public ExplicitConstructorInvocation_four(Primary primary,
			ExplicitConstructorInvocation_two explicitConstructorInvocation) {
		super();
		this.primary = primary;
		this.explicitConstructorInvocation = explicitConstructorInvocation;
	}



	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(primary.toString() + "." 
		+ explicitConstructorInvocation.toString() + ";");
		return result.toString();
	}
}
