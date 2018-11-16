package classes;

import java.util.List;

/*
 * Throws:
 * 		throws ExceptionTypeList
 * 
 * ExceptionTypeList:
 * 		ExceptionType{,ExceptionType}
 */
public class Throws {
	List<ExceptionType> exceptionTypes;

	public Throws(List<ExceptionType> exceptionTypes) {
		super();
		this.exceptionTypes = exceptionTypes;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("throws ");
		
		String seperator = "";
		for(ExceptionType exceptionType:exceptionTypes) {
			result.append(seperator + exceptionType.toString());
			seperator = ",";
		}
		return result.toString();
	}
}
