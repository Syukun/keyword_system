package classes;

import lexicalStructure.Identifier;

/*
 * ReceiverParameter:
 * 		{Annotation} UnannType [Identifier.]this 
 */
public class ReceiverParameter {
	UnannType unannType;
	Identifier identifier;
	
	public ReceiverParameter(UnannType unannType, Identifier identifier) {
		super();
		this.unannType = unannType;
		this.identifier = identifier;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(unannType.toString()+" ");
		if(this.identifier!=null) {
			result.append(identifier.toString() + ".");
		}
		result.append("this");
		return result.toString();
	}
	
}
