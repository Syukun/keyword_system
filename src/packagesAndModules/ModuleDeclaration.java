package packagesAndModules;

import java.util.List;

import org.eclipse.jdt.core.dom.ModuleDirective;

import lexicalStructure.Identifier;
import names.ModuleName;

/*
 * ModuleDeclaration :
 * 		{Annotation}[open] module Identifier{.Identifier} '( {ModuleDirective} '}
 */
public class ModuleDeclaration {
	List<Annotation> annotations;
	static int OPEN=0;
	ModuleName moduleName;
	List<ModuleDirective> moduleDirectives;
	
	public ModuleDeclaration(List<Annotation> annotations, int oPEN, ModuleName moduleName,
			List<ModuleDirective> moduleDirectives) {
		super();
		this.annotations = annotations;
		OPEN = oPEN;
		this.moduleName = moduleName;
		this.moduleDirectives = moduleDirectives;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		if(annotions != null) {
			for(Annotation annotation : annotations) {
				result.append(annotation.toString() + "/n");
			}
		}
		if(OPEN == 1) {
			result.append("open ");
		}
		result.append("module "+moduleName.toString()+"{");
		if(moduleDirectives!=null) {
			for(ModuleDirective moduleDirective : moduleDirectives) {
				result.append(moduleDirective.toString() + "\n");
			}
		}
		result.append("}");
		return result.toString();
		
	}
	
	
	
}
