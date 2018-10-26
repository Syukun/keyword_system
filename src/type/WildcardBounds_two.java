package type;

/*
 * super ReferenceType
 */
public class WildcardBounds_two extends WildcardBounds {

	ReferenceType referenceType;
	
	
	public WildcardBounds_two(ReferenceType referenceType) {
		super();
		this.referenceType = referenceType;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "super" + referenceType.toString();
	}

}
