package expression;

public class PrefixOperator {
	String TOKEN;
	public PrefixOperator(String t) {
		this.TOKEN = t;
	}
	
	public String toString() {
		return this.TOKEN;
	}
}
