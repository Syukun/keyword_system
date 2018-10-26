package type;
/*
 * AdditionBound:
 * 		&InterfaceType
 */
public class AdditionBound {
	InterfaceType interfaceType;

	public AdditionBound(InterfaceType interfaceType) {
		super();
		this.interfaceType = interfaceType;
	}
	
	public String toString() {
		return "&"+interfaceType.toString();
	}
}
