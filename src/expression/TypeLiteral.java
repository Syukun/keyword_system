package expression;

import org.eclipse.jdt.core.dom.Type;

public class TypeLiteral extends Expression{

	Type t;
	public TypeLiteral(Type t){
		this.t=t;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(this.t);
	}

}
