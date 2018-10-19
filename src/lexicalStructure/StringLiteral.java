package lexicalStructure;

/*
 * StringLiteral :
 * 		"{StringCharacter}"
 */
public class StringLiteral extends Literal {
	
	String s;
	
	public StringLiteral(String s) {
		this.s = s;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return s;
	}

}
