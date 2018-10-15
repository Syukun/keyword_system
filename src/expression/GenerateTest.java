package expression;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.Test;

import keywordSystem.Label;

class GenerateTest {

	String keywords = "";
	@Test
	void testToString() {
		
		/*
		 * Annotation ::= MarkerAnnotation | NormalAnnotation | SingleMemberAnnotation
		 */
//		MarkerAnnotation : @TypeName
		keywords = "have some warnings";
		MarkerAnnotation markerAnnotation = new MarkerAnnotation(new SimpleName("Override"));
		assertEquals(markerAnnotation.toString(),"@Override");
		
		MarkerAnnotation markerAnnotation_2 = new MarkerAnnotation(new SimpleName("SuppressWarnings"));
		/*
		 * markerAnnotation : - Default(0.05) - WNIK(0.01) = -0.06
		 * markerAnnotation_2 : -Default(0.05) + WIK(1.00) - WNIK(0.01) = 0.94
		 */
		assertEquals(markerAnnotation.getScore(ConvertToken.splitKeywords(keywords)),-0.06f,0);
		assertEquals(markerAnnotation_2.getScore(ConvertToken.splitKeywords(keywords)),0.94f,0);
		
//		SimpleName s1 = new SimpleName("a");
//		SimpleName s2 = new SimpleName("add");
//		SimpleName s3 = new SimpleName("b");
//		SimpleName s4 = new SimpleName("c");
//		
//		Vector<Expression> args = new Vector<Expression>();
//		args.add(s3);
//		args.add(s4);
//		MethodInvocation mtdInv = new MethodInvocation(s1,s2,args);
//		System.out.println(mtdInv.toString());
	}

	@Test
	void testConvertToTokens() {
		assertEquals(ConvertToken.toString(ConvertToken.convertToTokens("convertToToken")),"convert to token");
	}
}
