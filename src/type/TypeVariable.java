package type;

import classes.ExceptionType;
import lexicalStructure.TypeIdentifier;

/*
 * TypeVariable:
 * 		{Annotation} TypeIndetifier
 */
public class TypeVariable implements ReferenceType,ExceptionType{
	TypeIdentifier typeIdentifier;

	public TypeVariable(TypeIdentifier typeIdentifier) {
		super();
		this.typeIdentifier = typeIdentifier;
	}
	
	public String toString() {
		return this.typeIdentifier.toString();
	}
	
}
