package classes;

import java.util.List;

import type.InterfaceType;

public class SuperInterfaces {
	List<InterfaceType> interfaceTypes;

	public SuperInterfaces(List<InterfaceType> interfaceTypes) {
		super();
		this.interfaceTypes = interfaceTypes;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("implements");
		String seperator = "";
		for(InterfaceType it: this.interfaceTypes) {
			result.append(seperator + it.toString());
			seperator = ",";
		}
		
		return result.toString();
		
	}
}
