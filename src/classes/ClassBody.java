package classes;

import java.util.List;

/*
 * ClassBody:
 * 		'{ {ClassBodyDeclaration} '}
 */
public class ClassBody {
	List<ClassBodyDeclaration> classBodyDeclarations;

	public ClassBody(List<ClassBodyDeclaration> classBodyDeclarations) {
		super();
		this.classBodyDeclarations = classBodyDeclarations;
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("{");
		if(classBodyDeclarations!=null) {
			for(ClassBodyDeclaration classBodyDeclaration:classBodyDeclarations) {
				result.append(classBodyDeclaration.toString()+"\n");
			}
		}
		result.append("}");
		
		return result.toString();
	}
}
