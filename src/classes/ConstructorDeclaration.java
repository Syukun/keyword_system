package classes;
/*
 * ConstructorDeclaration:
 * 		{ConstructorModifier} ConstructorDeclarator [Throws] ConstructorBody
 */
public class ConstructorDeclaration extends ClassBodyDeclaration{

	ConstructorModifier constructorModifier;
	ConstructorDeclarator constructorDeclarator;
	Throws throwsExp;
	ConstructorBody constructorBody;
	
	
	public ConstructorDeclaration(ConstructorModifier constructorModifier, ConstructorDeclarator constructorDeclarator,
			Throws throwsExp, ConstructorBody constructorBody) {
		super();
		this.constructorModifier = constructorModifier;
		this.constructorDeclarator = constructorDeclarator;
		this.throwsExp = throwsExp;
		this.constructorBody = constructorBody;
	}


	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		if(constructorModifier!=null) {
			result.append(constructorModifier.toString() + " ");
		}
		result.append(constructorDeclarator.toString()+ " ");
		if(throwsExp != null) {
			result.append(throwExp.toString);
		}
		result.append(constructorBody.toString());
		return result.toString();
	}

}
