package expression;

import java.math.BigDecimal;

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
	// add +0.5 when there is a keyword annotate or annotation(modify later)
	public static final float ANNOTATION = 0.5f;

	public abstract String toString();
	// public abstract float getScore();

	// define add function with using BigDecimal class
	public static float addPrecise(float num1, float num2) {
		return new BigDecimal(Float.toString(num1)).add(new BigDecimal(Float.toString(num2))).floatValue();
	}
	
}
