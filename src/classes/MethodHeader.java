package classes;

import java.util.List;

import type.TypeParameter;

/*
 * MethodHeader:
		Result MethodDeclarator [Throws] 
		TypeParameters {Annotation} Result MethodDeclarator [Throws]
 */
public class MethodHeader {
	List<TypeParameter> typeParameters;
	Result result;
	MethodDeclarator methodDeclarator;
	Throws throwsexp;
	
	public MethodHeader(List<TypeParameter> typeParameters, Result result, MethodDeclarator methodDeclarator,
			Throws throwsexp) {
		super();
		this.typeParameters = typeParameters;
		this.result = result;
		this.methodDeclarator = methodDeclarator;
		this.throwsexp = throwsexp;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		if(this.typeParameters!=null) {
			result.append("<");
			String seperator="";
			for(TypeParameter typeParameter:typeParameters) {
				result.append(seperator + typeParameter.toString());
				seperator=",";
			}
			result.append("> ");
		}
		result.append(result.toString() + " " + methodDeclarator.toString());
		if(throwsexp != null) {
			result.append(" " + throwsexp.toString());
		}
		return result.toString();
	}
	
}
