package classes;

import java.util.List;

/*
 * EnumBody:
	'{ [EnumConstantList] [,] [EnumBodyDeclarations] '}
	
	EnumConstantList:
		EnumConstant {, EnumConstant}
		
	EnumBodyDeclarations:
		; {ClassBodyDeclaration}
		
 */
public class EnumBody {
	List<EnumConstant> enumConstants;
	boolean comma;
	List<ClassBodyDeclaration> enumBodyDeclarations;
	
	
	public EnumBody(List<EnumConstant> enumConstants, boolean comma, List<ClassBodyDeclaration> enumBodyDeclarations) {
		super();
		this.enumConstants = enumConstants;
		this.comma = comma;
		this.enumBodyDeclarations = enumBodyDeclarations;
	}


	public String toString() {
		StringBuffer result = new StringBuffer();
		if(enumConstants != null) {
			String seperator = "";
			for(EnumConstant enumConstant : enumConstants) {
				result.append(seperator + enumConstant.toString());
				seperator = ",";
			}
		}
		if(comma) {
			result.append(",");
		}
		if(enumBodyDeclarations != null) {
			result.append(";");
			for(ClassBodyDeclaration enumBodyDeclaration : enumBodyDeclarations) {
				result.append(enumBodyDeclaration.toString());
			}
		}
		return result.toString();
	}
}
