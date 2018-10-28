package classes;
/*
 * MethodDeclaration:
 * 		{MethodModifier} MethodHeader MethodBody
 */
public class MethodDeclaration extends ClassMemberDeclaration {
	MethodModifier methodModifier;
	MethodHeader methodHeader;
	MethodBody methodBody;
	
	
	public MethodDeclaration(MethodModifier methodModifier, MethodHeader methodHeader, MethodBody methodBody) {
		super();
		this.methodModifier = methodModifier;
		this.methodHeader = methodHeader;
		this.methodBody = methodBody;
	}


	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		if(methodModifier!=null) {
			result.append(methodModifier.toString()+" ");
		}
		result.append(methodHeader.toString());
		result.append(methodBody.toString());
		return result.toString();
	}

}
