package expression;

import org.eclipse.jdt.core.dom.PrimitiveType;
/*
 * ArrayCreation_3 : new PrimitiveType '['] {'[']} ArrayInitializer
 */
public class ArrayCreation_3 extends ArrayCreation {
	
	PrimitiveType.Code type_primitive;
	ArrayInitializer arrInit;
	int dimension;

	public ArrayCreation_3(PrimitiveType.Code type,ArrayInitializer arrInit,int d) {
		this.type_primitive = type;
		this.arrInit = arrInit;
		this.dimension = d;
	}
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("new" + type_primitive.toString());
		for(int i = 0;i<dimension;i++) {
			result.append("[]");
		}
		result.append(" "+arrInit.toString());
		return result.toString();
	}

}
