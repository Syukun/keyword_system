package type;
/*
 * extends TypeVariable
 */
public class TypeBound_one extends TypeBound {

	TypeVariable typeVar;
	
	public TypeBound_one(TypeVariable typeVar) {
		super();
		this.typeVar = typeVar;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "extends "+typeVar.toString();
	}

}
