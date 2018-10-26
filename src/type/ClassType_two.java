package type;

import names.PackageName;

/*
 * PackageName.ClassType_one
 */
public class ClassType_two extends ClassType {

	PackageName packageName;
	ClassType_one classType;
	
	
	public ClassType_two(PackageName packageName, ClassType_one classType) {
		super();
		this.packageName = packageName;
		this.classType = classType;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return packageName.toString()+"."+classType.toString();
	}

}
