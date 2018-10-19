package expression;

/*
 * ArrayCreation_4 : new TypeName [<Type{,Type}>] '[']{'[']} ArrayInitializer
 * 
 * omit the generic type right now.
 */


public class ArrayCreation_4 extends ArrayCreation {


	SimpleName typeName;
	ArrayInitializer arrInit;
	int dimension;

	public ArrayCreation_4(SimpleName type,ArrayInitializer arrInit,int d) {
		this.typeName = type;
		this.arrInit = arrInit;
		this.dimension = d;
	}
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("new" + typeName.toString());
		for(int i = 0;i<dimension;i++) {
			result.append("[]");
		}
		result.append(" "+arrInit.toString());
		return result.toString();
	}

}
