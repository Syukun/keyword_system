package type;

/*
 * ClassOrInterfaceType Dims
 */
public class ArrayType_two extends ArrayType {

	ClassOrInterfaceType classOrInterfaceType;
	Dims dims;
	
	
	public ArrayType_two(ClassOrInterfaceType classOrInterfaceType, Dims dims) {
		super();
		this.classOrInterfaceType = classOrInterfaceType;
		this.dims = dims;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return classOrInterfaceType.toString() + dims.toString();
	}

}
