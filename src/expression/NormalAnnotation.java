package expression;

import java.util.List;
/*
 * not ok right now
 */
public class NormalAnnotation extends Annotation {
	
	Name typeName;
	List<MemberValuePair> values;
	
	public NormalAnnotation(Name typeName, List<MemberValuePair> values) {
		this.typeName = typeName;
		this.values = values;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
