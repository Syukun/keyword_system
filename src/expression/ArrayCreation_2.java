package expression;

import java.util.List;

import org.eclipse.jdt.core.dom.PrimitiveType;

public class ArrayCreation_2 extends ArrayCreation{
	
	/*
	 * new TypeName [ < Type { , Type } > ]'[ Expression '] { '[ Expression '] } { '[ '] }
	 * @see expression.Expression#toString()
	 * 
	 * not consider the generic type right now.
	 */

	SimpleName typeName;
	List<Expression> exps;
	private int dims = 0;

	public int getDims() {
		return dims;
	}

	public void setDims(int dims) {
		this.dims = dims;
	}

	public ArrayCreation_2(SimpleName typeName,List<Expression> exps) {
		this.typeName = typeName;
		this.exps = exps;
	}
	
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("new "+ typeName.toString());
		for(Expression exp : exps) {
			result.append("[" + exp.toString() + "]");
		}
		if(dims > 0) {
			for(int i = 0; i < dims; i++) {
				result.append("[]");
			}	
		}
		
		return result.toString();
	}

}
