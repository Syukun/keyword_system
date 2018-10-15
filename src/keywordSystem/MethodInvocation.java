package keywordSystem;
import java.util.List;

public class MethodInvocation extends Expression {

	MethodName name;
	Expression[] args;
	public MethodInvocation(MethodName name, Expression[] args) {
		super();
		this.name = name;
//		this.arity = arity;
		this.args = args.clone();
	}
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(""+args[0]+"."+name.toString()+"(");
		String separator = "";
		for (int i=1;i<name.types.length; i++) {
			result.append(separator+args[i]);
			separator = ",";
		}
		result.append(")");
		return result.toString();
	}

	@Override
	public Type getType() {
		// TODO Auto-generated method stub
		return args[0].getType();
	}
	@Override
	public float getScore(List<String> keywords) {
		float score = Expression.DEFSCORE;
		score = this.name.getScore(keywords);
		for(int i = 0; i < args.length; i++){
			score = addPrecise(score,args[i].getScore(keywords));
		}
		return score;
	}

}
