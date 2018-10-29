package classes;

import lexicalStructure.TypeIdentifier;

/*
 * EnumDeclaration:
	{ClassModifier} enum TypeIdentifier [SuperInterfaces] EnumBody
 */
public class EnumDeclaration extends ClassDeclaration {

	ClassModifier classModifier;
	TypeIdentifier typeIdentifier;
	SuperInterfaces superInterfaces;
	EnumBody enumbody;
	
	
	public EnumDeclaration(ClassModifier classModifier, TypeIdentifier typeIdentifier,
			classes.SuperInterfaces superInterfaces, EnumBody enumbody) {
		super();
		this.classModifier = classModifier;
		this.typeIdentifier = typeIdentifier;
		superInterfaces = superInterfaces;
		this.enumbody = enumbody;
	}


	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		if(classModifier != null) {
			result.append(classModifier.toString() + " ");
		}
		result.append("enum " + typeIdentifier.toString()+ " ");
		if(superInterfaces != null) {
			result.append(superInterfaces.toString());
		}
		result.append(enumbody.toString());
		return result.toString();
	}

}
