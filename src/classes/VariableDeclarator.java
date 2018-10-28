package classes;
/*
 * VariableDeclarator:
 * 		VariableDeclaratorId [= VariableInitializer]
 * 
 */
public class VariableDeclarator {
	VariableDeclaratorId variableDeclaratorId;
	VariableInitializer variableInitializer;
	
	public VariableDeclarator(VariableDeclaratorId variableDeclaratorId, VariableInitializer variableInitializer) {
		super();
		this.variableDeclaratorId = variableDeclaratorId;
		this.variableInitializer = variableInitializer;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(variableDeclaratorId.toString());
		if(variableInitializer != null) {
			result.append("="+variableInitializer.toString());
		}
		return result.toString();
	}
	
}
