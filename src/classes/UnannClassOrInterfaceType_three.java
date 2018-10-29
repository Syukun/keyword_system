package classes;

import lexicalStructure.TypeIdentifier;
import names.PackageName;
import type.TypeArguments;

/*
 * UnannClassOrInterfaceType_three:
 * 		UnannClassOrInterfaceType . {Annotation} TypeIdentifier [TypeArguments]
 */
public class UnannClassOrInterfaceType_three extends UnannClassOrInterfaceType {

	UnannClassOrInterfaceType unannClassOrInterfaceType;
	TypeIdentifier typeIdentifier;
	TypeArguments typeArguments;
	
	
	
	


	public UnannClassOrInterfaceType_three(UnannClassOrInterfaceType unannClassOrInterfaceType,
			TypeIdentifier typeIdentifier, TypeArguments typeArguments) {
		super();
		this.unannClassOrInterfaceType = unannClassOrInterfaceType;
		this.typeIdentifier = typeIdentifier;
		this.typeArguments = typeArguments;
	}






	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(unannClassOrInterfaceType.toString()+".");
		result.append(typeIdentifier.toString());
		if(typeArguments!=null) {
			result.append(typeArguments.toString());
		}
		return result.toString();
	}


}
