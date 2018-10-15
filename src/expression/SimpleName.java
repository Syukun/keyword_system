package expression;

public class SimpleName extends Name{
	String identifier;
	public SimpleName(String id) {
		this.identifier = id;
	}
	
	public String toString() {
		return this.identifier;
	}
}
