package classes;

import java.util.List;

import lexicalStructure.TypeIdentifier;
import type.TypeParameter;

/*
 * ConstructorDeclarator:
	[TypeParameters] SimpleTypeName ( [ReceiverParameter ,] [FormalParameterList] )
	
	SimpleTypeName:
		TypeIdentifier
 */
public class ConstructorDeclarator {
	List<TypeParameter> typeParameters;
	TypeIdentifier simpleTypeName;
	ReceiverParameter receiverParameter;
	List<FormalParameter> formalParameters;
	
	public ConstructorDeclarator(List<TypeParameter> typeParameters, TypeIdentifier simpleTypeName,
			ReceiverParameter receiverParameter, List<FormalParameter> formalParameters) {
		super();
		this.typeParameters = typeParameters;
		this.simpleTypeName = simpleTypeName;
		this.receiverParameter = receiverParameter;
		this.formalParameters = formalParameters;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		if(typeParameters!=null) {
			result.append("<");
			String seperator = "";
			for(TypeParameter typeParameter: typeParameters) {
				result.append(seperator + typeParameter.toString());
				seperator = ",";
			}
			result.append("> ");
		}
		result.append(simpleTypeName.toString()+"(");
		if(receiverParameter != null) {
			result.append(receiverParameter.toString()+",");
		}
		if(formalParameters != null) {
			String seperator = "";
			for(FormalParameter formalParameter:formalParameters) {
				result.append(seperator + formalParameter.toString());
				seperator = ",";
			}
		}
		result.append(")");
		return result.toString();
	}
	
}
