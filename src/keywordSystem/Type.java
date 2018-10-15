package keywordSystem;

import java.util.Vector;

public class Type {
	private String type;
	Vector<Type> subtype = new Vector<Type>();
	// represent all possible types in whole system
	public static Vector<Type> allType = new Vector<Type>();


	public Type() {
		
	}
	
	public Type(String type) {
		this.type = type;
	}
	public void initSubtype() {
		subtype.add(this);
	}
	public String toString() {
		return type;
	}
	
	public Vector<Type> setSubtype(Type new_subtype){
		this.subtype.add(new_subtype);
		return subtype;
	}
	public Vector<Type> getSubtype(){
		initSubtype();
		return subtype;
	}
	
	public static Vector<Type> initAllType() {
		allType.add(new Type("String"));
		allType.add(new Type("Integer"));
		allType.add(new Type("BufferReader"));
		allType.add(new Type("boolean"));
		allType.add(new Type("List<String>"));
		return allType;
	}
	
	public boolean matchSubtype(Type type, Type ExpressionType) {
		return type.getSubtype().contains(ExpressionType);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Type other = (Type) obj;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
}
