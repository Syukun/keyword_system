package type;


/*
 * PrimitiveType Dims
 */
public class ArrayType_one extends ArrayType {

	PrimitiveType primitiveType;
	Dims dims;
	
	
	
	public ArrayType_one(PrimitiveType primitiveType, Dims dims) {
		super();
		this.primitiveType = primitiveType;
		this.dims = dims;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return primitiveType.toString()+dims.toString();
	}

}
