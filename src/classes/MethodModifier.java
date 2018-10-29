package classes;
/*
 * MethodModifier:
	(one of) 
	Annotation public protected private 
	abstract static final synchronized native strictfp
 */
public class MethodModifier {
	String methodModifier;

	public MethodModifier(String methodModifier) {
		super();
		this.methodModifier = methodModifier;
	}

	@Override
	public String toString() {
		return methodModifier;
	}
	
	
}
