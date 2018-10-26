package type;

/*
 * ClassOrInterfaceType.ClassType_one
 */
public class ClassType_three extends ClassType {

	ClassOrInterfaceType classOrInterfaceType;
	ClassType_one classType;
	
	
	
	public ClassType_three(ClassOrInterfaceType classOrInterfaceType, ClassType_one classType) {
		super();
		this.classOrInterfaceType = classOrInterfaceType;
		this.classType = classType;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return classOrInterfaceType.toString() + "." + classType.toString();
	}

}
