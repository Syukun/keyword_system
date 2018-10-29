package classes;

import java.util.List;

import type.TypeArgument;

/*
 * ExplicitConstructorInvocation_one:
 * 		[TypeArguments] this ( [ArgumentList] ) ; 
 */
public class ExplicitConstructorInvocation_one implements ExplicitConstructorInvocation {
	List<TypeArgument> typeArguments;
	List<Expression> arguments;
	
	public ExplicitConstructorInvocation_one(List<TypeArgument> typeArguments, List<Expression> arguments) {
		super();
		this.typeArguments = typeArguments;
		this.arguments = arguments;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		if(typeArguments != null) {
			String seperator = "";
			for(TypeArgument typeArgument:typeArguments) {
				result.append(seperator + typeArgument.toString());
				seperator = ",";
			}
			result.append(" ");
		}
		result.append("this(");
		if(arguments != null) {
			String seperator = "";
			for(Expression argument : arguments) {
				result.append(seperator + argument.toString());
				seperator = ",";
			}
		}
		result.append(");");
		return result.toString();
		
	}
}
