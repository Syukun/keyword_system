package keywordSystem;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import keywordSystem.Type;

public abstract class Expression {
	// default score is -0.05
	public static final float DEFSCORE = -0.05f;
	// add 1.00 when words in keywords query
	public static final float WIK = 1.00f;
	// subtract 0.01 when words not in keywords query
	public static final float WNIK = 0.01f;
	// add +0.001 where f is a local variable , member variable or member method
	// of the enclosing class;
	public static final float LMVAR = 0.001f;

	abstract public String toString();

	abstract public Type getType();

	public float getScore(String keywords) {
		return this.getScore(splitKeyword(keywords));
	}

	private List<String> splitKeyword(String keywords) {
		return Arrays.asList(keywords.toLowerCase().split("[^\\w]")).stream().distinct().collect(Collectors.toList());
//		return new ArrayList<String>(Arrays.asList(keywords.toLowerCase().split("[^\\w]")));
	}

	abstract float getScore(List<String> keywords);


	// define add function with using BigDecimal class
	public static float addPrecise(float num1, float num2) {
		return new BigDecimal(Float.toString(num1)).add(new BigDecimal(Float.toString(num2))).floatValue();
	}
}
