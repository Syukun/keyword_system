package classes;

import type.Dims;

/* 
 * UnannArrayType_two:
 * 		UnannClassOrInterfaceType Dims 
 */
public class UnannArrayType_two implements UnannArrayType {

	UnannClassOrInterfaceType unannClassOrInterfaceType;
	Dims dims;
	
	public UnannArrayType_two(UnannClassOrInterfaceType unannClassOrInterfaceType, Dims dims) {
		super();
		this.unannClassOrInterfaceType = unannClassOrInterfaceType;
		this.dims = dims;
	}
	
	public String toString() {
		return unannClassOrInterfaceType.toString() + dims.toString();
	}
}
