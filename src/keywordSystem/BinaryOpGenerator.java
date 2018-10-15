package keywordSystem;

import java.util.Vector;

public class BinaryOpGenerator extends Generator {
	Operator operator;
	@Override
	void generateWithSubExps(Expression[] subExps, Vector<Expression> result) {
		result.add(new BinOp(operator,subExps[0],subExps[1]));

	}



	public void setOperator(Operator operator) {
		this.operator=operator;
		
	}

	@Override
	Type[] types() {
		// TODO Auto-generated method stub
		return operator.types;
	}



	@Override
	void addGenerator(Type t, Vector<Generator> allGeneratorWithTypeT) {
		for (Operator operator : Operator.allOperator()) {
			if(operator.types[0].equals(t)) {
				BinaryOpGenerator binOpGenerator = new BinaryOpGenerator();
				binOpGenerator.operator = operator;
				allGeneratorWithTypeT.add(binOpGenerator);
			}
		}
		
	}

	

}

