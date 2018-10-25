package packagesAndModules;

import java.util.List;

/*
 * ModularCompilationUnit :
 * 		{ImportDeclaration} ModuleDeclaration
 */
public class ModularCompilationUnit extends CompilationUnit {
	
	List<ImportDeclaration> importDeclarationList;
	ModuleDeclaration moduleDeclaration;
	
	

	public ModularCompilationUnit(List<ImportDeclaration> importDeclarationList, ModuleDeclaration moduleDeclaration) {
		super();
		this.importDeclarationList = importDeclarationList;
		this.moduleDeclaration = moduleDeclaration;
	}


	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		for(ImportDeclaration importDeclaration:importDeclarationList) {
			result.append(importDeclaration.toString() + "\n");
		}
		result.append(moduleDeclaration.toString());
		return result.toString();
	}

}
