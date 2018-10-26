package packagesAndModules;

import java.util.List;

import lexicalStructure.Identifier;

/*
 * PackageDeclaration :
 * 		{PackageModifier} package Identifier{.Identifier};
 * 
 * PackageModifier:
 * 		Annotation
 */
public class PackageDeclaration {
//	List<Annotation> packageModifiers;
	List<Identifier> names;
		
	
	public PackageDeclaration(List<Identifier> names) {
		super();
		this.names = names;
	}



//	public PackageDeclaration(List<Annotation> packageModifiers, List<Identifier> names) {
//		super();
//		this.packageModifiers = packageModifiers;
//		this.names = names;
//	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
//		if(packageModifiers != null) {
//			for(Anotation packageModifier : packageModifiers) {
//				result.append(packageModifier.toString() + "\n");
//			}
//		}
		result.append("package ");
		for(Identifier name:names) {
			result.append(name.toString());
		}
		result.append(";");
		return result.toString();
	}
}
