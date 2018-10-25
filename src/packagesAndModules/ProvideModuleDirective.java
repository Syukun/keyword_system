package packagesAndModules;

import java.util.List;

import names.ModuleDirective;
import names.TypeName;
/*
 * ProvideModuleDirective:
 * 		provides TypeName with TypeName {,TypeName};
 * 
 * e.g. provides com.example.foo.spi.intf with com.example.foo.impl;
 */
public class ProvideModuleDirective extends ModuleDirective {

	TypeName provideTypeName;
	List<TypeName> withTypeNames;
	
	
	public ProvideModuleDirective(TypeName provideTypeName, List<TypeName> withTypeNames) {
		super();
		this.provideTypeName = provideTypeName;
		this.withTypeNames = withTypeNames;
	}


	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("provides "+provideTypeName.toString()+" with");
		String seperator = "";
		for(TypeName withTypeName : withTypeNames) {
			result.append(seperator + withTypeName.toString());
			seperator = ",";
		}
		result.append(";");
		return result.toString();
	}

}
