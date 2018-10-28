package classes;

import java.util.List;

import lexicalStructure.Identifier;

/*
 * EnumConstant:
	{EnumConstantModifier} Identifier [( [ArgumentList] )] [ClassBody]

   EnumConstantModifier:
		Annotation
 */
public class EnumConstant {
	Identifier id;
	List<Expression> arguments;
	ClassBody classBody;
	public EnumConstant(Identifier id, List<Expression> arguments, ClassBody classBody) {
		super();
		this.id = id;
		this.arguments = arguments;
		this.classBody = classBody;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(id.toString());
		if(arguments != null) {
			result.append(" (");
			String seperator = "";
			for(Expression argument:arguments) {
				result.append(seperator + argument.toString());
				seperator = ",";
			}
			result.append(") ");
		}
		if(classBody!= null) {
			result.append(classBody.toString());
		}
		return result.toString();
	}
}
