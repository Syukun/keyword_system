package type;
/*
 * extends ClassOrInterfaceType {AdditionBound}
 */
public class TypeBound_two extends TypeBound{

	ClassOrInterfaceType classOrInterfaceType;
	AdditionBound additionBound;
	
	
	public TypeBound_two(ClassOrInterfaceType classOrInterfaceType, AdditionBound additionBound) {
		super();
		this.classOrInterfaceType = classOrInterfaceType;
		this.additionBound = additionBound;
	}


	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("extends "+classOrInterfaceType.toString());
		if(additionBound != null) {
			result.append(additionBound.toString());
		}
		return result.toString();
	}

}
