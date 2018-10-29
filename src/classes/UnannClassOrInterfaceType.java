package classes;
/*
 * UnannClassOrInterfaceType:
		UnannClassType 
		UnannInterfaceType
   
   UnannClassType:
		TypeIdentifier [TypeArguments] 
		PackageName . {Annotation} TypeIdentifier [TypeArguments] 
		UnannClassOrInterfaceType . {Annotation} TypeIdentifier [TypeArguments]

   UnannInterfaceType:
		UnannClassType
 */
public abstract class UnannClassOrInterfaceType implements UnannReferenceType{
	public abstract String toString();
}
