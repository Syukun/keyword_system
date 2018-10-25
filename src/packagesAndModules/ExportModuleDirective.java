package packagesAndModules;

import java.util.List;

import names.ModuleDirective;
import names.ModuleName;
import names.PackageName;
/*
 * ExportModuleDirective:
 * 		exports PackageName [to ModuleName {,ModuleName}];
 * 
 * e.g. exports com.example.foo.internal to com.example.foo.probe;
 */
public class ExportModuleDirective extends ModuleDirective{

	PackageName packageName;
	List<ModuleName> moduleNames;

	public ExportModuleDirective(PackageName packageName, List<ModuleName> moduleNames) {
		super();
		this.packageName = packageName;
		this.moduleNames = moduleNames;
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("exports " + packageName.toString());
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
