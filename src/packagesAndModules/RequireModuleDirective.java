package packagesAndModules;

import java.util.List;

import names.ModuleDirective;
import names.ModuleName;

/*
 * RequireModuleDirective:
 * 		requires {RequiresModifier} ModuleName;
 * 
 * e.g. requires transitive com.example.foo.network;
 */
public class RequireModuleDirective extends ModuleDirective{

	List<RequiresModifier> requiresModifiers;
	ModuleName name;
	
	
	public RequireModuleDirective(List<RequiresModifier> requiresModifiers, ModuleName name) {
		super();
		this.requiresModifiers = requiresModifiers;
		this.name = name;
	}


	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("requires ");
		if(this.requiresModifiers!=null) {
			for(RequiresModifier rm: requiresModifiers) {
				result.append(rm);
			}
		}
		result.append(name.toString() + ";");
		return result.toString();
	}

}
/*
 * RequiresModifier:
 * 		transitive or static
 */
class RequiresModifier{
	String key;
	boolean TRANSITIVE = false;
	boolean STATIC = false;
	
	public RequiresModifier(String key) {
		this.key = key;
	}
	
	private void setSituation(String key) {
		if(key == "TRANSITIVE") {
			this.TRANSITIVE = true;
		}
		if(key == "STATIC") {
			this.STATIC = true;
		}
	}
	
	public String toString() {
		this.setSituation(this.key);
		String result = "";
		if(TRANSITIVE) {
			result = "transitive";
		}else if(STATIC) {
			result = "static";
		}
		return result;
	}
}
