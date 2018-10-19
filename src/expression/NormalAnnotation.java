package expression;

import java.util.List;
/*
 * not ok right now
 */
public class NormalAnnotation extends Annotation {
	
	Name typeName;
	List<MemberValuePair> values;
	
	public NormalAnnotation(Name typeName) {
		this.typeName = typeName;
	}
	public NormalAnnotation(Name typeName, List<MemberValuePair> values) {
		this.typeName = typeName;
		this.values = values;
	}
	
	
	
	@Override
	public String toString() {
		StringBuffer result= new StringBuffer();
		result.append("@"+typeName.toString()+"(");
		
		StringBuffer values_String = new StringBuffer();
		String seperator = "";
		for(MemberValuePair value:values) {
			values_String.append(seperator+value.toString());
			seperator=",";
		}
		result.append(values_String+")");
		// TODO Auto-generated method stub
		return result.toString();
	}

}
