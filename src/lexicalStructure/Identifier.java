package lexicalStructure;

/*
 *  Identifier :
 *  	IdentifierChars but not a Keyword or BooleanLiteral or NullLiteral
 *  
 *  Omit this class later??
 */
public class Identifier {
	String simpleName;
	
	public Identifier(String name) {
		this.simpleName = name;
	}
	public String toString() {
		return simpleName;
	}
}
