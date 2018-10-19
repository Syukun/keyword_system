package lexicalStructure;
/*
 * FloatingPointLiteral :
 * 	DecimalFloatingPointLiteral |
 * 	HexadecimalFloatingPointLiteral
 * 
 * 	just consider normal way right now
 */

public class FloatingPointLiteral extends Literal {

	float f;
	
	public FloatingPointLiteral(float f) {
		this.f = f;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(f);
	}

}
