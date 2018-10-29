package classes;

import type.Dims;

/*
 * UnannArrayType_three:
 * 		UnannTypeVariable Dims
 */
public class UnannArrayType_three implements UnannArrayType {

	UnannTypeVariable unannTypeVariable;
	Dims dims;
	
	public UnannArrayType_three(UnannTypeVariable unannTypeVariable, Dims dims) {
		super();
		this.unannTypeVariable = unannTypeVariable;
		this.dims = dims;
	}
	
	public String toString() {
		return unannTypeVariable.toString() + dims.toString();
	}
	
}
