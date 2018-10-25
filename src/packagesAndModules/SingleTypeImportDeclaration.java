package packagesAndModules;

import names.TypeName;

/*
 * SingleTypeImportDeclaration :
 * 		import TypeName;
 * 
 * e.g. import java.util.Vector
 */
public class SingleTypeImportDeclaration extends ImportDeclaration {
	
	TypeName name;
	public SingleTypeImportDeclaration(TypeName name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "import "+name.toString() +";";
	}

}
