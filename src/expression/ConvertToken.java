package expression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToken {
	public static List<String> convertToTokens(String name){
		return Arrays.asList(name.split("(?<!^)(?=[A-Z])")).stream()
				.map(id -> id.toLowerCase()).collect(Collectors.toList());
	}
	
	/*
	 * could be omit later, this method is just used on testing.
	 * @toString()
	 */
	public static String toString(List<String> names) {
		StringBuffer result = new StringBuffer();
		String seperator = "";
		for(String name: names) {
			result.append(seperator + name);
			seperator=" ";
		}
		return result.toString();
	}
	
	public static List<String> splitKeywords(String keywords){
		return Arrays.asList(keywords.toLowerCase().split("[^\\w]"))
				.stream().distinct().collect(Collectors.toList());
	}
}
