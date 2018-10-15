package keywordSystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.AbstractTypeDeclaration;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;


public class InitParser {
	public String getFileContent(String filepath) throws FileNotFoundException,
	IOException{
		BufferedReader br = new BufferedReader(new FileReader(filepath));
		StringBuilder sb = new StringBuilder();
		String line = br.readLine();
		while(line != null) {
			sb.append(line);
			sb.append(System.lineSeparator());
			line = br.readLine();
		}
		return sb.toString();
	}
	
	public void initElements(String filepath) throws FileNotFoundException, IOException {
		ASTParser parser = ASTParser.newParser(AST.JLS10);
		char[] fileContent = getFileContent(filepath).toCharArray();
		parser.setSource(fileContent);
		CompilationUnit cu = (CompilationUnit) parser.createAST(null);
		cu.accept(new MyVisitor());
	}
}
class MyVisitor extends ASTVisitor{
	@SuppressWarnings("unchecked")
	public boolean visit(CompilationUnit node) {
		for(AbstractTypeDeclaration atd : (List<AbstractTypeDeclaration>) node.types()) {
			
			this.addToAllType(atd.getName().toString());
			
			if(atd instanceof TypeDeclaration) {
				FieldDeclaration[] fields = ((TypeDeclaration) atd).getFields();
				MethodDeclaration[] methods= ((TypeDeclaration) atd).getMethods();
				for(FieldDeclaration field : fields) {
					String fieldType = field.getType().toString();
					List<VariableDeclarationFragment> vdfs = field.fragments();
					this.addToAllType(fieldType);
					if(fieldType.equals("int") || fieldType.equals("integer")) {
						for(VariableDeclarationFragment vdf:vdfs) {
							IntGenerator.addToAllExpression(vdf.getName().toString());
						}
					}else {
						for(VariableDeclarationFragment vdf:vdfs) {
							VarGenerator.addToAllVarExpression(fieldType, vdf.getName().toString());
						}
					}
				}
				
				for(MethodDeclaration method : methods) {
					String methodName = method.getName().toString();
					List<SingleVariableDeclaration> svds = method.parameters();
					int parameterSize = svds.size();
					Type[] parameterTypes= new Type[parameterSize];
					for(int i = 0 ; i < parameterSize ; i++) {
						String parameterTypeName = svds.get(i).getType().toString();
						if(parameterTypeName == "int" || parameterTypeName=="integer") {
							parameterTypeName = "Integer";
						}
						this.addToAllType(parameterTypeName);
						parameterTypes[i] = new Type(parameterTypeName);
					}
					String returnType = method.getReturnType2().toString();
					if(returnType.equals("void")) {
						MethodName.addToAllMethodName(methodName, new Type(), parameterTypes);
					}
					this.addToAllType(returnType);
					MethodName.addToAllMethodName(methodName, new Type(returnType), parameterTypes);
				}
			}
		}
		return false;
	}
	
	public void addToAllType(String typeName) {
		Type t = new Type(typeName);
		if(!Type.allType.contains(t)) {
			Type.allType.add(t);
		}
	}
}

