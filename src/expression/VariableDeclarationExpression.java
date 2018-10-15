package expression;

import java.util.List;

import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.Type;

public class VariableDeclarationExpression extends Expression {

	List<Modifier> extendedModifier;
	Type type;
	List<VariableDeclarationFragment> fragments;
	
	public VariableDeclarationExpression(List<Modifier> modifiers,Type type, List<VariableDeclarationFragment> fragments) {
		this.extendedModifier = modifiers;
		this.type = type;
		this.fragments = fragments;
	}
	
	public VariableDeclarationExpression(Type type, List<VariableDeclarationFragment> fragments) {
		this.type = type;
		this.fragments = fragments;
	}
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		if(this.extendedModifier != null) {
			for(Modifier m : extendedModifier) {
				result.append(m.toString()+" ");
			}
		}
		result.append(this.type.toString()+" ");
		String seperator="";
		for(VariableDeclarationFragment fragment : fragments) {
			result.append(seperator+fragment.toString());
			seperator=",";
		}
		return result.toString();
	}

}
