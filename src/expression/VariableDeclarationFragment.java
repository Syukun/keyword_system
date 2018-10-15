package expression;


public class VariableDeclarationFragment extends VariableDeclaration{
	SimpleName identifier;
	Expression exp;
	
	public VariableDeclarationFragment(SimpleName id) {
		this.identifier = id;
	}
	
	public VariableDeclarationFragment(SimpleName id, Expression exp) {
		this.identifier = id;
		this.exp = exp;
	}
	
	@Override
	public String toString() {
		
		return exp == null? identifier.toString()
				:identifier.toString() + "=" + exp.toString();
	}


}
