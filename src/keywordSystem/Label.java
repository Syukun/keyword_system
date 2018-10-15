package keywordSystem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Label {
	List<String> label;
	public Label() {
		
	}
	public Label(List<String> label) {
		this.label = label;
	}
	public static Label convertToLabel(String name){
		return  new Label(toLowerCase(Arrays.asList(name.split("(?<!^)(?=[A-Z])"))));
	}
	public static List<String> toLowerCase(List<String> name_split_list) {
		return name_split_list.stream().map(name -> name.toLowerCase()).collect(Collectors.toList());
		
	}
	public String toString() {
		String result="";
		for(String s : label) {
			result += (s + " ");
		}
		return result;
	}
}
