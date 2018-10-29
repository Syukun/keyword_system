package classes;

import lexicalStructure.Identifier;

/*
 * VariableArityParameter:
	{VariableModifier} UnannType {Annotation} ... Identifier
 */
public class VariableArityParameter extends FormalParameter {

	VariableModifier variableModifier;
	UnannType unannType;
	Identifier identifier;
	
	
	public VariableArityParameter(VariableModifier variableModifier, UnannType unannType, Identifier identifier) {
		super();
		this.variableModifier = variableModifier;
		this.unannType = unannType;
		this.identifier = identifier;
	}


	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		if(this.variableModifier != null) {
			result.append(variableModifier.toString()+" ");
		}
		
		result.append(unannType.toString()+" ");
		result.append(" ... ");
		result.append(identifier.toString());
		return result.toString();
	}

}
