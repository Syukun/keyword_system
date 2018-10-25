package packagesAndModules;

import java.util.List;

import names.ModuleDirective;
import names.ModuleName;
import names.PackageName;

/*
 * OpenModuleDirective:
 *		 opens PackageName [to ModuleName {,ModuleName}];
 * 
 * e.g. opens com.example.foo.internal to com.example.foo.network,
 * 						com.exmaple.foo.probe;
 */
public class OpenModuleDirective extends ModuleDirective {

	PackageName packageName;
	List<ModuleName> moduleNames;
	
	
	
	public OpenModuleDirective(PackageName packageName, List<ModuleName> moduleNames) {
		super();
		this.packageName = packageName;
		this.moduleNames = moduleNames;
	}



	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("opens " + packageName.toString());
		if(moduleNames!=null) {
			result.append("to");
			String seperator="";
			for(ModuleName moduleName : moduleNames) {
				result.append(seperator+moduleName.toString());
				seperator = ",";
			}
		}
		result.append(";");
		return result.toString();
	}

}
