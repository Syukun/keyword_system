package names;

public class QualifiedName extends Name {
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


	@Override
	public float getScore() {
		// TODO Auto-generated method stub
		return 0;
	}

}
