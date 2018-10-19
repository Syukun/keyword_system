package expression;

public class SingleMemberAnnotation extends Annotation {

	SimpleName typeName;
	Expression value;
	
	public SingleMemberAnnotation(SimpleName name,Expression exp) {
		this.typeName = name;
		this.value = exp;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "@" + typeName.toString() +"(" + value.toString() + ")";
	}

}
