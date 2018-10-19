package expression;

import java.util.List;

import org.eclipse.jdt.core.dom.PrimitiveType;
/*
 * Q: how to decide the number of '[ ] in an array creation expression? 
 * A :maybe just as a kind of selection
 */

/*
 * ArrayCreation_1 : new PrimitiveType '[ Expression '] { '[ Expression '] } {'[']}
 * 
 * Syntax: 
 * new PrimitiveType DimExps [Dims]
 * 
 * DimExps : DimExpr {DimExpr}
 * DimExpr : {Annotation} '[Expression']
 * 
 * Dims: {Annotation} '['] {{Annotation} '[']}
 * 
 * right now don't consider the Annotation cause it might be rough.
 */

public class ArrayCreation_1 extends ArrayCreation{
	PrimitiveType.Code type_primitive;
	List<Expression> exps;
	private int dims = 0;
	
	public int getDims() {
		return dims;
	}
	public void setDims(int dims) {
		this.dims = dims;
	}
	public ArrayCreation_1(PrimitiveType.Code type,List<Expression> exps) {
		this.type_primitive = type;
		this.exps = exps;
	}
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("new "+ type_primitive.toString());
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
