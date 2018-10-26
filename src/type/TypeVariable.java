package type;

import lexicalStructure.TypeIdentifier;

/*
 * TypeVariable:
 * 		{Annotation} TypeIndetifier
 */
public class TypeVariable implements ReferenceType{
	TypeIdentifier typeIdentifier;

	public TypeVariable(TypeIdentifier typeIdentifier) {
		super();
		this.typeIdentifier = typeIdentifier;
	}
	
	public String toString() {
		return this.typeIdentifier.toString();
	}
	
}
