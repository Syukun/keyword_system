package keywordSystem;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.eclipse.jdt.core.CompletionProposal;
import org.junit.jupiter.api.Test;

class GeneratorTest {

	@Test
	void test() throws FileNotFoundException, IOException {
		String keyword = "add line";
		Generator.setBeamWidth(7);
		int depth = 10;
		String path = "/Users/aochishu/eclipse-workspace/keywordSystemPlugin/src/keywordSystem/TestClass.java";
		new InitParser().initElements(path);
		System.out.println("Expression in Depth of " + depth + ":");
		Generator.generateExact(depth, keyword).stream().forEach(System.out::println);
	}
	

}
