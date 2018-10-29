package classes;

import names.ExpressionName;

/*
 * ExplicitConstructorInvocation_three:
 * 		ExpressionName . [TypeArguments] super ( [ArgumentList] ) ;
 */
public class ExplicitConstructorInvocation_three implements ExplicitConstructorInvocation {
	ExpressionName expressionName;
	ExplicitConstructorInvocation_two explicitConstructorInvocation;
	
	public ExplicitConstructorInvocation_three(ExpressionName expressionName,
			ExplicitConstructorInvocation_two explicitConstructorInvocation) {
		super();
		this.expressionName = expressionName;
		this.explicitConstructorInvocation = explicitConstructorInvocation;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(expressionName.toString() + "." 
		+ explicitConstructorInvocation.toString() + ";");
		return result.toString();
	}
	
}
