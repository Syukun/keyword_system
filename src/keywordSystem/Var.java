package keywordSystem;

import java.util.List;

public class Var extends Expression {
	private String name;
	private Type type;
	
	public Var(String name, Type type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	public List<String> label() {
		return new Label().convertToLabel(name).label;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public float getScore(List<String> keywords) {
		float score = addPrecise(DEFSCORE,LMVAR);
		List<String> name_label = this.label();
		for(String word : name_label) {
			if(keywords.contains(word)) {
				score = addPrecise(score,WIK);
				keywords.remove(word);
			}else{
				score = addPrecise(score,-WNIK);
			}
		}

		return score;
	}

}

