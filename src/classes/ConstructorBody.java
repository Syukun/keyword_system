package classes;
/*
 * ConstructorBody:
     '{ [ExplicitConstructorInvocation] [BlockStatements] '}
 */
public class ConstructorBody {
	ExplicitConstructorInvocation explicitConstructorInvocation;
	BlockStatements blockStatements;
	
	public ConstructorBody(ExplicitConstructorInvocation explicitConstructorInvocation,
			BlockStatements blockStatements) {
		super();
		this.explicitConstructorInvocation = explicitConstructorInvocation;
		this.blockStatements = blockStatements;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("{");
		if(explicitConstructorInvocation != null) {
			result.append(explicitConstructorInvocation.toString());
		}
		if(blockStatements != null) {
			result.append(blockStatements.toString());
		}
		result.append("}");
		return result.toString();
	}
	
}
