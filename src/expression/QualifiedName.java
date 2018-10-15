package expression;

public class QualifiedName extends Expression {
	Name qualifier;
	SimpleName name;
	

	public QualifiedName(Name qualifier, SimpleName name) {
		super();
		this.qualifier = qualifier;
		this.name = name;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return qualifier.toString() + "." + name.toString();
	}

}
