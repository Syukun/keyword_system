package type;

/*
 * ArrayType:
 * 		PrimitiveType Dims
 * 		ClassOrInterfaceType Dims
 * 		TypeVariable Dims
 */
public abstract class ArrayType implements ReferenceType {
	public abstract String toString();
}
