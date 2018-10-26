package type;

/*
 * TypeVariable Dims
 */
public class ArrayType_three extends ArrayType {

	TypeVariable typeVariable;
	Dims dims;
	
	
	
	public ArrayType_three(TypeVariable typeVariable, Dims dims) {
		super();
		this.typeVariable = typeVariable;
		this.dims = dims;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return typeVariable.toString() + dims.toString();
	}

}
