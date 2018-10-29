package classes;

import java.util.List;

import lexicalStructure.TypeIdentifier;
import type.TypeParameter;

/*
 * NormalClassDeclaration:
 * 		{ClassModifier} class TypeIdentifier [TypeParameters][SuperClass][Superinterfaces] ClassBody
 */
public class NormalClassDeclaration extends ClassDeclaration{


	List<ClassModifierBesidesAnnotation> classModfifiers;
	TypeIdentifier typeIdentifier;
	List<TypeParameter> typeParameters;
	SuperClass superClass;
	SuperInterfaces superInterfaces;
	ClassBody classBody;
	


	public NormalClassDeclaration(List<ClassModifierBesidesAnnotation> classModfifiers,
			TypeIdentifier typeIdentifier, List<TypeParameter> typeParameters, SuperClass superClass,
			SuperInterfaces superInterfaces, ClassBody classBody) {
		super();
		this.classModfifiers = classModfifiers;
		this.typeIdentifier = typeIdentifier;
		this.typeParameters = typeParameters;
		this.superClass = superClass;
		this.superInterfaces = superInterfaces;
		this.classBody = classBody;
	}



	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		if(this.classModfifiers!=null) {
			for(ClassModifierBesidesAnnotation classModifier:classModfifiers) {
				result.append(classModfifiers.toString()+" ");
			}
		}
		result.append("class "+this.typeIdentifier.toString()+" ");
		if(this.typeParameters!=null) {
			result.append("<");
			String seperator="";
			for(TypeParameter typeParameter:typeParameters) {
				result.append(seperator + typeParameter.toString());
				seperator=",";
			}
			result.append("> ");
		}
		if(this.superClass!=null) {
			result.append(this.superClass.toString()+" ");
		}
		if(this.superInterfaces != null) {
			result.append(this.superInterfaces+" ");
		}
		result.append(this.classBody.toString());
		return result.toString();
	}
	
}
