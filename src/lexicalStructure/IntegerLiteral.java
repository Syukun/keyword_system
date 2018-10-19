package lexicalStructure;
/*
 * IntegerLiteral:
 * 	DecimalIntegerLiteral|
 * 	HexIntegerLiteral |
 * 	OcatalIntegerLiteral |
 * 	BinaryIntegerLiteral
 * 
 * 	just use normal integer right now
 */
public class IntegerLiteral extends Literal {
	
	int i;
	
	public IntegerLiteral(int i) {
		this.i=i;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(i);
	}

}
