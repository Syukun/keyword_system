package keywordSystem;

import java.util.List;
import java.util.Vector;
import keywordSystem.Expression;

public class MethodName {
	String name;
	Type receiveType;
	Type[] types;
	static Vector<MethodName> allMethodNames = new Vector<MethodName>();

	public MethodName(String name, Type receiveType,Type[] types) {
		this.name = name;
		this.receiveType = receiveType;
		this.types = types;
	}

	@Override
	public String toString() {
		return name;
	}

	public Type returnType() {
		return this.receiveType;
	}

	public List<String> label() {
		return new Label().convertToLabel(name).label;
	}

	public boolean matchReceiverType(Type type) {
		return type.equals(this.receiveType);
	}

	public static void addToAllMethodName(String name,Type returnTypeName
			,Type[] parameterTypes) {
		MethodName mname = new MethodName(name,returnTypeName,parameterTypes);
		allMethodNames.add(mname);
	}
	public static Vector<MethodName> allMethodName() {

		Vector<MethodName> allMethodName = new Vector<MethodName>();
		
		allMethodName.addAll(MethodName.allMethodNames);
//		allMethodName.add(new MethodName("concat", new Type("String"),new Type[] {new Type("String"), new Type("String") }));
//		allMethodName.add(new MethodName("add", new Type("boolean"),new Type[] { new Type("String") }));
//		allMethodName.add(new MethodName("readLine",new Type("String"),new Type[] {new Type("BufferReader")}));
//		allMethodName.add(new MethodName("add",new Type("boolean"),new Type[] {new Type("List<String>"),new Type("String")}));
		return allMethodName;
	}

	public float getScore(List<String> keywords) {
		float score = Expression.DEFSCORE;
		List<String> name_label = this.label();
		for(String word : name_label) {
			if(keywords.contains(word)) {
				score = Expression.addPrecise(score,Expression.WIK);
				keywords.remove(word);
			}else{
				score = Expression.addPrecise(score,-Expression.WNIK);
			}
		}
		return score;
	}
	
	
	

}

