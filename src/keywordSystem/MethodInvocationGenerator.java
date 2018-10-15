package keywordSystem;

import java.util.Vector;

public class MethodInvocationGenerator extends Generator {
	MethodName name;
	
	@Override
	void generateWithSubExps(Expression[] subExps, Vector<Expression> result) {

		result.add(new MethodInvocation(name,subExps));

	}

	public void setName(MethodName name) {
		this.name = name;
	}

	@Override
	Type[] types() {
		
		return name.types;
	}


	@Override
	void addGenerator(Type t, Vector<Generator> allGeneratorWithTypeT) {
		for (MethodName methodName : MethodName.allMethodName()) {
			if(methodName.matchReceiverType(t)) {
				MethodInvocationGenerator methodInvGenerator = new MethodInvocationGenerator();
				methodInvGenerator.setName(methodName);
				allGeneratorWithTypeT.add(methodInvGenerator);
			}
		}
	}


	

}
