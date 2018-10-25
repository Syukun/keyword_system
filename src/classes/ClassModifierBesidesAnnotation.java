package classes;

/*
 * public protected private abstract static final strictfp
 */
public class ClassModifierBesidesAnnotation implements ClassModifier {
	String modifier;
	public ClassModifierBesidesAnnotation(String modifier) {
		this.modifier = modifier;
	}
	
	public String toString() {
		return modifier;
	}
}
