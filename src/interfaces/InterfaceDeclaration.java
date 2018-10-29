package interfaces;

import classes.ClassMemberDeclaration;

/*
 * InterfaceDeclaration:
 * 		NormalInterfaceDeclaration
 * 		AnnotationTypeDeclaration
 */
public abstract class InterfaceDeclaration extends ClassMemberDeclaration {

	public abstract String toString();

}
