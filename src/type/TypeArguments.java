package type;

import java.util.List;

public class TypeArguments {
	List<TypeArgument> typeArguments;

	public TypeArguments(List<TypeArgument> typeArguments) {
		super();
		this.typeArguments = typeArguments;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("<");
		String seperator = "";
		for(TypeArgument ta : this.typeArguments) {
			result.append(seperator + ta.toString());
			seperator = ";";
		}
		result.append(">");
		return result.toString();
	}
}
