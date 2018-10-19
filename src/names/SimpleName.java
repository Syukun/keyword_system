package names;


public class SimpleName extends Name{
	String identifier;
	public SimpleName(String id) {
		this.identifier = id;
	}
	
	public String toString() {
		return this.identifier;
	}

	@Override
	public float getScore() {
		// TODO Auto-generated method stub
		return 0;
	}
}
