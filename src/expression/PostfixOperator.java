package expression;

public class PostfixOperator {
	String TOKEN;
	public PostfixOperator(String t) {
		this.TOKEN = t;
	}
	public String toString() {
		return this.TOKEN;
	}
}
