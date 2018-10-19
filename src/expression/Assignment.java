package expression;

/*
 * ASTNode:
 * Assignment:
 * 	Expression AssignmentOperator Expression
 * 
 * Syntax:
 * Assignment:
 * 	LeftHandSide AssignmentOperator Expression
 */

public class Assignment extends Expression{
	
	LeftHandSide leftExp;
	Expression rightExp;
	AssignmentOperator operator;
	
	public Assignment(LeftHandSide leftExp,AssignmentOperator operator,Expression rightExp) {
		this.leftExp = leftExp;
		this.operator = operator;
		this.rightExp = rightExp;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return leftExp.toString() + operator.toString() + rightExp.toString();
	}
	
	
}
