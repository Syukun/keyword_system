package classes;
/*
 * FormalParameter_one:
 * 		{VariableModifier} UnannType VariableDeclaratorId 
 */
public class FormalParameter_one extends FormalParameter {

	VariableModifier variableModifier;
	UnannType unannType;
	VariableDeclaratorId variableDeclaratorId;
	
	
	public FormalParameter_one(VariableModifier variableModifier, UnannType unannType,
			VariableDeclaratorId variableDeclaratorId) {
		super();
		this.variableModifier = variableModifier;
		this.unannType = unannType;
		this.variableDeclaratorId = variableDeclaratorId;
	}


	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		if(variableModifier != null) {
			result.append(variableModifier.toString() +" ");
		}
		result.append(unannType.toString() + " " + variableDeclaratorId.toString());
		return result.toString();
	}

}
