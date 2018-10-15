package expression;

import java.util.List;

public class MarkerAnnotation extends Annotation{

	private Name typeName;
	public MarkerAnnotation(Name typeName) {
		this.typeName = typeName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "@"+typeName.toString();
	}
	
	public float getScore(List<String> keywords){
		float score = Expression.DEFSCORE;
		List<String> tokens = ConvertToken.convertToTokens(typeName.toString());
		if(tokens.contains("annotation")||tokens.contains("annotate")) {
			score = Expression.addPrecise(score, ANNOTATION);
		}
		for(String token : tokens) {
			if(keywords.contains(token)) {
				score = Expression.addPrecise(score, WIK);
			}else {
				score = Expression.addPrecise(score, -WNIK);
			}
		}
		
		return score;
	}

}
