package lexicalStructure;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GenerateTest {

	@Test
	void testToString() {
		// identifiers
		Identifier id_1 = new Identifier("a");
		assertEquals(id_1.toString(),"a");
		
		TypeIdentifier typeId_1 = new TypeIdentifier("String");
		assertEquals(typeId_1.toString(),"String");
	}

}
