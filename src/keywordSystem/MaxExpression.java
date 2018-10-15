package keywordSystem;

import java.util.Vector;

public class MaxExpression {
	private int depth;
	private Type type;
	private Vector<Expression> expression;

	public MaxExpression() {

	}

	public MaxExpression(int depth, Type type, Vector<Expression> expression) {
		this.setDepth(depth);
		this.setType(type);
		this.setExpression(expression);
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Vector<Expression> getExpression() {
		return expression;
	}

	public void setExpression(Vector<Expression> expression) {
		this.expression = expression;
	}


}


