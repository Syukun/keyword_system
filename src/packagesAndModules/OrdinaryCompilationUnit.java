package packagesAndModules;

import java.util.List;

/*
 * OrdinaryCompilationUnit:
 * 		[PackageDeclaration]{ImportDeclaration}{TypeDeclaration}
 */

public class OrdinaryCompilationUnit extends CompilationUnit {
	PackageDeclaration packageDeclaration;
	List<ImportDeclaration> importDeclarationList;
	List<TypeDeclaration> typeDeclarationList;
	
	public OrdinaryCompilationUnit(List<ImportDeclaration> importDeclarationList,List<TypeDeclaration> typeDeclarationList) {
		this.importDeclarationList = importDeclarationList;
		this.typeDeclarationList = typeDeclarationList;
	}
	
	public OrdinaryCompilationUnit(PackageDeclaration packageDeclaration,List<ImportDeclaration> importDeclarationList,List<TypeDeclaration> typeDeclarationList) {
		this.packageDeclaration = packageDeclaration;
		this.importDeclarationList = importDeclarationList;
		this.typeDeclarationList = typeDeclarationList; 
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		if(this.packageDeclaration!=null) {
			result.append(packageDeclaration.toString());
		}
		result.append("\n");
		for(ImportDeclaration importDeclaration : importDeclarationList) {
			result.append(importDeclaration.toString()+"\n");
		}
		result.append("\n");
		for(TypeDeclaration typeDeclaration : typeDeclarationList) {
			result.append(typeDeclaration.toString()+"\n");
		}
		return result.toString();
	}

}
