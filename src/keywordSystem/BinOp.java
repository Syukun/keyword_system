package keywordSystem;

import java.util.List;

public class BinOp extends Expression {
	private Operator operator;
	private Expression operand1;
	private Expression operand2;
	public BinOp(Operator operator, Expression operand1, Expression operand2) {
		super();
		this.setOperator(operator);
		this.setOperand1(operand1);
		this.setOperand2(operand2);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + operand1.toString() + ") " + operator + " (" + operand2 + ")";
	}

	@Override
	public Type getType() {
		// TODO Auto-generated method stub
		String operand1_type = operand1.getType().toString();
		String operand2_type = operand2.getType().toString();
		return (operand1_type == operand2_type)?
				operand1.getType() :
					// modify later to represent error message;
					null
				;
	}
	public Operator getOperator() {
		return operator;
	}
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	public Expression getOperand1() {
		return operand1;
	}
	public void setOperand1(Expression operand1) {
		this.operand1 = operand1;
	}
	public Expression getOperand2() {
		return operand2;
	}
	public void setOperand2(Expression operand2) {
		this.operand2 = operand2;
	}
	@Override
	public float getScore(List<String> keywords) {
		float score = 0;
		// if score_operand1 = operand2 then just add 1
		float score_operand1 = this.getOperand1().getScore(keywords);
		float score_operand2 = this.getOperand2().getScore(keywords);
		float score_operator = this.getOperator().getScore(keywords);
		
		score = addPrecise(score_operator,addPrecise(score_operand1,score_operand2));
		return score;
	}

}

