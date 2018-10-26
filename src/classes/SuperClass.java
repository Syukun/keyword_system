package classes;

import type.ClassType;

/*
 * SuperClass :
 * 		extends ClassType
 */
public class SuperClass {
	ClassType classType;

	public SuperClass(ClassType classType) {
		super();
		this.classType = classType;
	}
	
	public String toString() {
		return "extends" + this.classType.toString();
	}
	
}
