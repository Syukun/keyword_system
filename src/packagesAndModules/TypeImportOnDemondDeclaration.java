package packagesAndModules;

import names.Name;

/*
 * TypeImportOnDemondDeclaration:
 * 		import PackageOrTypeName.*;
 * 
 * e.g. import java.util.*;
 */
public class TypeImportOnDemondDeclaration extends ImportDeclaration {

	Name packageOrTypeName;
	
	
	public TypeImportOnDemondDeclaration(Name packageOrTypeName) {
		super();
		this.packageOrTypeName = packageOrTypeName;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "import " + packageOrTypeName.toString() + ".*;";
	}

}
