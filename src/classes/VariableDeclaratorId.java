package classes;

import lexicalStructure.Identifier;
import type.Dims;

/*
 * VariableDeclaratorId:
 * 		Identifier [Dims]
 */
public class VariableDeclaratorId {
	Identifier id;
	Dims dims;
	public VariableDeclaratorId(Identifier id, Dims dims) {
		super();
		this.id = id;
		this.dims = dims;
	}
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(id.toString());
		if(dims!=null) {
			result.append(dims.toString());
		}
		return result.toString();
	}
	
	
}
