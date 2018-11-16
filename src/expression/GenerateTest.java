package expression;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.eclipse.jdt.core.dom.PrimitiveType;
import type.Type;
import org.junit.jupiter.api.Test;

import keywordSystem.Label;
import keywordsystem_methodinvocation.ArrayAccess;
import keywordsystem_methodinvocation.ArrayCreation_1;
import keywordsystem_methodinvocation.ArrayCreation_2;
import keywordsystem_methodinvocation.ArrayInitializer;
import keywordsystem_methodinvocation.AssignmentOperator;

class GenerateTest {

	String keywords = "";

	@Test
	void testToString() {

		/*
		 * Annotation ::= MarkerAnnotation | NormalAnnotation | SingleMemberAnnotation
		 */
		// MarkerAnnotation : @TypeName
		keywords = "have some warnings";
		MarkerAnnotation markerAnnotation = new MarkerAnnotation(new SimpleName("Override"));
		assertEquals(markerAnnotation.toString(), "@Override");

		MarkerAnnotation markerAnnotation_2 = new MarkerAnnotation(new SimpleName("SuppressWarnings"));

		/*
		 * NormalAnnotation : @TypeName ([MemberValuePair {,MemberValuePair}])
		 * MemberValuePair : SimpleName = Expression
		 */
		MemberValuePair mvp = new MemberValuePair(new SimpleName("value"), new SimpleName("a"));
		MemberValuePair mvp_2 = new MemberValuePair(new SimpleName("value2"), new SimpleName("b"));
		List<MemberValuePair> mvpList = new ArrayList<MemberValuePair>();
		mvpList.add(mvp);
		mvpList.add(mvp_2);
		NormalAnnotation normalAnnotation = new NormalAnnotation(new SimpleName("Target"), mvpList);
		assertEquals(normalAnnotation.toString(), "@Target(value=a,value2=b)");

		/*
		 * SimpleMemberAnnotation : @TypeName(Expression)
		 */
		SingleMemberAnnotation simpleMemberAnnotation = new SingleMemberAnnotation
				(new SimpleName("Target"),new SimpleName("a"));
		assertEquals(simpleMemberAnnotation.toString(),"@Target(a)");
		
		/*
		 * ArrayAccess : Expression '[Expression']
		 */
		ArrayAccess arrayAccess = new ArrayAccess(new SimpleName("int"),new SimpleName("2"));
		assertEquals(arrayAccess.toString(),"int[2]");
		
		/*
		 * ArrayCreation_1 : new PrimitiveType '[ Expression '] { '[ Expression '] } {'[']}
		 * 
		 * Syntax: 
		 * new PrimitiveType DimExps [Dims]
		 * 
		 * DimExps : DimExpr {DimExpr}
		 * DimExpr : {Annotation} '[Expression']
		 * 
		 * Dims: {Annotation} '['] {{Annotation} '[']}
		 * 
		 * Field : PrimitiveType type_primitive;
		 * 		   List<Expression> exps;
		 * 		   int dims = 0;
		 * 
		 * right now don't consider the Annotation cause it might be rough.
		 */
		SimpleName s1 = new SimpleName("s1");
		SimpleName s2 = new SimpleName("s2");
		List<Expression> exps = new ArrayList<Expression>();
		exps.add(s1);
		exps.add(s2);
		ArrayCreation_1 array= new ArrayCreation_1(PrimitiveType.INT,exps);
		assertEquals(array.toString(),"new int[s1][s2]");
		ArrayCreation_1 array_2= new ArrayCreation_1(PrimitiveType.INT,exps);
		array_2.setDims(2);
		assertEquals(array_2.toString(),"new int[s1][s2][][]");
		
		/*
		 * new TypeName [ < Type { , Type } > ]'[ Expression '] { '[ Expression '] } { '[ '] }
		 * @see expression.Expression#toString()
		 * 
		 * SimpleName typeName;
		 * List<Expression> exps;
		 * int dims = 0;
		 * not consider the generic type right now.
		 */
		SimpleName typeName = new SimpleName("tyone");
		ArrayCreation_2 array_3 = new ArrayCreation_2(typeName,exps);
		assertEquals(array_3.toString(),"new tyone[s1][s2]");
		ArrayCreation_2 array_4 = new ArrayCreation_2(typeName,exps);
		array_4.setDims(1);
		assertEquals(array_4.toString(),"new tyone[s1][s2][]");
		
		/*
		 * ArrayInitializer:
		 * 	'{[Expression{,Expression} [,]]'}
		 */
		ArrayInitializer arrayInitializer = new ArrayInitializer(exps);
		assertEquals(arrayInitializer.toString(),"{s1,s2}");
		
		/*
		 * Assignment:
		 * 	LeftHandSide AssignmentOperator Expression
		 */
		AssignmentOperator operator = new AssignmentOperator("=");
		Assignment assignment_1 = new Assignment(arrayAccess,operator,arrayInitializer);
		assertEquals(assignment_1.toString(),"int[2]={s1,s2}");
		
		/*
		 * CastExpression :
		 * 	'(Type') Expression
		 */
		Type type_1 = new Type("Integer");
		CastExpression castExp = new CastExpression(type_1,assignment_1);
		assertEquals(castExp.toString(),"(Integer)int[2]={s1,s2}");
		
		

		// SimpleName s1 = new SimpleName("a");
		// SimpleName s2 = new SimpleName("add");
		// SimpleName s3 = new SimpleName("b");
		// SimpleName s4 = new SimpleName("c");
		//
		// Vector<Expression> args = new Vector<Expression>();
		// args.add(s3);
		// args.add(s4);
		// MethodInvocation mtdInv = new MethodInvocation(s1,s2,args);
		// System.out.println(mtdInv.toString());
	}

	@Test
	void testGetScore() {
		keywords = "have some warnings";
		MarkerAnnotation markerAnnotation = new MarkerAnnotation(new SimpleName("Override"));
		MarkerAnnotation markerAnnotation_2 = new MarkerAnnotation(new SimpleName("SuppressWarnings"));
		/*
		 * markerAnnotation : - Default(0.05) - WNIK(0.01) = -0.06 markerAnnotation_2 :
		 * -Default(0.05) + WIK(1.00) - WNIK(0.01) = 0.94
		 */
		assertEquals(markerAnnotation.getScore(ConvertToken.splitKeywords(keywords)), -0.06f, 0);
		assertEquals(markerAnnotation_2.getScore(ConvertToken.splitKeywords(keywords)), 0.94f, 0);
	}

	@Test
	void testConvertToTokens() {
		assertEquals(ConvertToken.toString(ConvertToken.convertToTokens("convertToToken")), "convert to token");
	}
}
