package type;

//public abstract class Type {
//	public abstract String toString();
//}

  public class Type{
	  String typeName;
	  
	  public Type(String name) {
		  this.typeName = name;
	  }
	  
	  public String toString() {
		  return typeName;
	  }
  }
