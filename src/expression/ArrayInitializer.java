package expression;

import java.util.List;

public class ArrayInitializer extends Expression{
	List<Expression> varInitList;
	
	public ArrayInitializer(List<Expression> varInitList) {
		this.varInitList = varInitList;
	}

	@Override
	public String toString() {
		String varInitString = "";
		for(Expression varInit: varInitList) {
			varInitString += varInit.toString();
		}
		return "{" + varInitString + "}";
	}
	
	
}
