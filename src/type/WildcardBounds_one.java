package type;

/*
 * extends ReferenceType
 */
public class WildcardBounds_one extends WildcardBounds{
	ReferenceType referenceType;

	
	public WildcardBounds_one(ReferenceType referenceType) {
		super();
		this.referenceType = referenceType;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "extends " + referenceType.toString();
	}

	
	
}
