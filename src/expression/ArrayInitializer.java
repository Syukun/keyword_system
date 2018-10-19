package expression;

import java.util.List;
/*
 * ASTNode : 
 * ArrayInitializer:
 * 	'{[Expression{,Expression} [,]]'}
 * 
 * Syntax:
 * ArrayInitializer:
 * '{[VariableInitializerList][,]}
 *
 * in this generate system, we omit the comma cause it won't have any change.
 */
public class ArrayInitializer extends Expression{
	List<Expression> expressions;
	
	public ArrayInitializer() {
		
	}
	public ArrayInitializer(List<Expression> expressions) {
		this.expressions = expressions;
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer("{");
		if(expressions != null) {
			String seperator ="";
			for(Expression exp : expressions) {
				result.append(seperator + exp.toString());
				seperator = ",";
			}
		}
		result.append("}");
		return result.toString();
	}
	
	
}
