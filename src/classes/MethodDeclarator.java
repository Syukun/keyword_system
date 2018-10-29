package classes;

import java.util.List;

import lexicalStructure.Identifier;
import type.Dims;

/*
 * MethodDeclarator:
		Identifier ( [ReceiverParameter ,] [FormalParameterList] ) [Dims]
 */
public class MethodDeclarator {
	Identifier identifier;
	ReceiverParameter receiverParameter;
	List<FormalParameter> formalParameters;
	Dims dims;
	
	public MethodDeclarator(Identifier identifier, ReceiverParameter receiverParameter,
			List<FormalParameter> formalParameters, Dims dims) {
		super();
		this.identifier = identifier;
		this.receiverParameter = receiverParameter;
		this.formalParameters = formalParameters;
		this.dims = dims;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(identifier.toString()+"(");
		if(receiverParameter != null) {
			result.append(receiverParameter.toString()+",");
		}
		if(formalParameters!=null) {
			String seperator = "";
			for(FormalParameter formalParameter:formalParameters) {
				result.append(seperator + formalParameter.toString());
				seperator=",";
			}
		}
		result.append(")");
		if(dims != null) {
			result.append(dims.toString());
		}
		return result.toString();
	}
	
}
