package type;

import lexicalStructure.TypeIdentifier;

/*
 * TypeParameter:
 * 		{TypeParameterModifier} TypeIdentifier [TypeBound]
 * 
 * TypeParameterModifier:
 * 		Annotation
 */
public class TypeParameter {
	TypeIdentifier typeIdentifier;
	TypeBound typeBound;
	
	public TypeParameter(TypeIdentifier typeIdentifier, TypeBound typeBound) {
		super();
		this.typeIdentifier = typeIdentifier;
		this.typeBound = typeBound;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(typeIdentifier.toString());
		
		if(typeBound!=null) {
			result.append(typeBound.toString());
		}
		
		return result.toString();
	}
	
}
