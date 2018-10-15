package expression;

import java.util.Vector;

import javax.swing.JPopupMenu.Separator;

import org.eclipse.jdt.core.dom.Type;

public class MethodInvocation extends Expression{
	Expression exp;
	/*
	 * omit this right now;;
	 */
//	Vector<Type> geneticTypes;
	SimpleName name;
	Vector<Expression> arguments;
	
	public MethodInvocation(Expression exp, SimpleName name, Vector<Expression> arguments) {
		this.exp = exp;
		this.name = name;
		this.arguments = arguments;
	}
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(""+exp.toString()+"."+name.toString()+"(");
		String separator = "";
		for(Expression arg:arguments) {
			result.append(separator + arg.toString());
			separator = ",";
		}
		result.append(")");
		return result.toString();
	}

}
