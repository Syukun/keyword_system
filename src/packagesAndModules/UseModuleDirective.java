package packagesAndModules;

import names.ModuleDirective;
import names.TypeName;
/*
 * UseModuleDirective :
 * 		uses TypeName;
 * 
 * e.g. uses com.example.foo.spi.intf;
 */
public class UseModuleDirective extends ModuleDirective {

	TypeName typeName;
	
	public UseModuleDirective(TypeName typeName) {
		this.typeName = typeName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "uses " + typeName.toString() + ";";
	}

}
