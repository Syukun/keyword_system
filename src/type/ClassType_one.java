package type;

import lexicalStructure.TypeIdentifier;

/*
 * {Annotation} TypeIdentifier [TypeArguments]
 */
public class ClassType_one extends ClassType{

	TypeIdentifier typeIdentifier;
	TypeArguments typeArguments;
	
	
	public ClassType_one(TypeIdentifier typeIdentifier, TypeArguments typeArguments) {
		super();
		this.typeIdentifier = typeIdentifier;
		this.typeArguments = typeArguments;
	}


	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(this.typeIdentifier.toString());
		if(this.typeArguments!=null) {
			result.append(this.typeArguments.toString());
		}
		return result.toString();
	}

}
