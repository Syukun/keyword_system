package expression;
public class AssignmentOperator {
//	static String ASSIGN = "=";
//	static String BIT_AND_ASSIGN = "&=";
//	static String BIT_OR_ASSIGN = "|=";
//	static String BIT_XOR_ASSIGN = "^=";
//	static String DIVIDE_ASSIGN = "/=";
//	static String LEFT_SHIFT_ASSIGN = "<<==" ;
//	static String MINUS_ASSIGN = "-=";
//	static String PLUS_ASSIGN = "+=" ;
//	static String REMAINDER_ASSIGN = "%=";
//	static String RIGHT_SHIFT_SIGNED_ASSIGN = ">>=";
//	static String RIGHT_SHIFT_UNSIGNED_ASSIGN = ">>>=";
//	static String TIME_ASSIGN = "*=";
	String operatorName;
	public AssignmentOperator(String s) {
		this.operatorName = s;
	}
	
	public String toString() {
		return operatorName;
	}
	
}
