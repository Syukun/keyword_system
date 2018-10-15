package expression;

public class CharacterLiteral extends Expression {
	char c;
	public CharacterLiteral(char c) {
		this.c = c;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(c);
	}

}
