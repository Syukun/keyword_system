package packagesAndModules;

import names.TypeName;

/*
 * StaticImportOnDemondDeclaration:
 * 		import static TypeName.*;
 */
public class StaticImportOnDemondDeclaration extends ImportDeclaration {

	TypeName typeName;
	
	
	public StaticImportOnDemondDeclaration(TypeName typeName) {
		super();
		this.typeName = typeName;
	}


	@Override
	public String toString() {
		
		return "import static "+typeName.toString()+".*;";
	}

}
