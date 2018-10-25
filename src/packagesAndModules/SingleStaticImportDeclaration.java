package packagesAndModules;

import lexicalStructure.Identifier;
import names.TypeName;

/*
 * SingleStaticImportDeclaration:
 * 		import static TypeName.Identifier;
 */
public class SingleStaticImportDeclaration extends ImportDeclaration {

	TypeName typeName;
	Identifier id;
	
	
	public SingleStaticImportDeclaration(TypeName typeName, Identifier id) {
		super();
		this.typeName = typeName;
		this.id = id;
	}


	@Override
	public String toString() {
		
		return "import static "+typeName.toString()+"."+id.toString()+";";
	}

}
