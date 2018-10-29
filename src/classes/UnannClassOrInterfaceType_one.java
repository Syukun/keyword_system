package classes;

import lexicalStructure.TypeIdentifier;
import type.TypeArguments;

/*UnannClassOrInterfaceType_one:
 * 		TypeIdentifier [TypeArguments]
 */
public class UnannClassOrInterfaceType_one extends UnannReferenceType{

	TypeIdentifier typeIdentifier;
	TypeArguments typeArguments;
	
	
	public UnannClassOrInterfaceType_one(TypeIdentifier typeIdentifier, TypeArguments typeArguments) {
		super();
		this.typeIdentifier = typeIdentifier;
		this.typeArguments = typeArguments;
	}


	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(typeIdentifier.toString());
		if(typeArguments!=null) {
			result.append(typeArguments.toString());
		}
		return result.toString();
	}

}
