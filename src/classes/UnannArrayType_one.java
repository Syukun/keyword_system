package classes;

import type.Dims;

/*
 * UnannArrayType_one:
 * 		UnannPrimitiveType Dims
 */
public class UnannArrayType_one implements UnannArrayType {

	UnannPrimitiveType unannPrimitiveType;
	Dims dims;
	
	public UnannArrayType_one(UnannPrimitiveType unannPrimitiveType, Dims dims) {
		super();
		this.unannPrimitiveType = unannPrimitiveType;
		this.dims = dims;
	}
	
	public String toString() {
		return unannPrimitiveType.toString() + dims.toString();
	}
}
