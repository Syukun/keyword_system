package classes;

import lexicalStructure.TypeIdentifier;
import names.PackageName;
import type.TypeArguments;

/*
 * UnannClassOrInterfaceType_two:
 * 		PackageName . {Annotation} TypeIdentifier [TypeArguments] 
 */
public class UnannClassOrInterfaceType_two extends UnannClassOrInterfaceType{

	PackageName packageName;
	TypeIdentifier typeIdentifier;
	TypeArguments typeArguments;
	
	
	
	public UnannClassOrInterfaceType_two(PackageName packageName, TypeIdentifier typeIdentifier,
			TypeArguments typeArguments) {
		super();
		this.packageName = packageName;
		this.typeIdentifier = typeIdentifier;
		this.typeArguments = typeArguments;
	}



	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(packageName+".");
		result.append(typeIdentifier.toString());
		if(typeArguments!=null) {
			result.append(typeArguments.toString());
		}
		return result.toString();
	}

}
