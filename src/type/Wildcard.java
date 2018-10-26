package type;

/*
 * WildCard:
 * 		{Annotation} ?[WildcardBounds]
 */ 
public class Wildcard extends TypeArgument {
	WildcardBounds wildcardBounds;
	
	
	public Wildcard(WildcardBounds wildcardBounds) {
		super();
		this.wildcardBounds = wildcardBounds;
	}


	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("?");
		if(wildcardBounds!=null) {
			result.append(wildcardBounds.toString());
		}
		return result.toString();
	}

}
