package classes;

import java.util.List;

/*
 * FieldDeclaration:
 * 		{FiledModifier} UnannType VariableDeclaratorList
 */
public class FieldDeclaration extends ClassMemberDeclaration {

	FieldModifier fieldModifier;
	UnannType unannType;
	List<VariableDeclarator> variableDeclarators;
	
	
	public FieldDeclaration(FieldModifier fieldModifier, UnannType unannType,
			List<VariableDeclarator> variableDeclarators) {
		super();
		this.fieldModifier = fieldModifier;
		this.unannType = unannType;
		this.variableDeclarators = variableDeclarators;
	}


	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		if(fieldModifier!=null) {
			result.append(fieldModifier.toString() + " ");
		}
		result.append(unannType.toString());
		String seperator = "";
		for(VariableDeclarator variableDeclarator : variableDeclarators) {
			result.append(seperator + variableDeclarator.toString());
			seperator = ";\n";
		}
		return result.toString();
	}

}
