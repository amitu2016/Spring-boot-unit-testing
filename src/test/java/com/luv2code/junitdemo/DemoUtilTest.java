package com.luv2code.junitdemo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

//@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
class DemoUtilTest {
	
	DemoUtils demo;
	
	/*
	 * @BeforeAll static void executeBeforeAll() {
	 * System.out.println("Running executeBeforeAll() method"); }
	 * 
	 * @AfterAll static void executeAfterAll() {
	 * System.out.println("Running executeAfterAll() method"); }
	 */
	
	@BeforeEach
	void executeBeforeEach() {
	    demo = new DemoUtils();
	}
	/*
	 * @AfterEach void executeAfterEach() {
	 * System.out.println("Running executeAfterEach() method"); }
	 */

	@Test
	@DisplayName("Equals and Not Equals")
	void testEqualsAndNotEquals() {
		
		
		Assertions.assertEquals(6, demo.add(3, 3), "3 + 3 equals 6");
		Assertions.assertNotEquals(9, demo.add(3, 3), "3 + 3 not equals 9");
		
		
	}
	
	@Test
	@DisplayName("Null and Not Null")
	void testNullandNotNullObject() {
		
		
		String str1 = null;
		String str2 = "Amit";
		
		Assertions.assertNotNull(demo.checkNull(str2), "Object should not be null");
		Assertions.assertNull(demo.checkNull(str1), "Object Should be null");
		
	}
	
	@Test
	@DisplayName("Same and Not Same")
	void testSameAndNotSame() {
		
		String str = "Amit";
		
		Assertions.assertSame(demo.getAcademy(), demo.getAcademyDuplicate(), "Both Objects Should be Same");
		Assertions.assertNotSame(str, demo.getAcademy(), "Objects Should not be Same");
	}
	
	@Test
	@DisplayName("True And False")
	void testTrueAndFalse() {
		
		int gradeOne = 20;
		int gradeTwo = 10;
		
		Assertions.assertTrue(demo.isGreater(gradeOne, gradeTwo), "This should return true");
		Assertions.assertFalse(demo.isGreater(gradeTwo, gradeOne), "This Should return False");
	}
	
	@DisplayName("Array Equals Not Equals")
	@Test
	void testArrayEqualsAndNotEquals() {
		
		String arr[] = {"A","B","C"};
		
		Assertions.assertArrayEquals(arr, demo.getFirstThreeLettersOfAlphabet(), "Both Arrays Should Be Equal");
		
	}
	
	@DisplayName("List Equals Not Equals")
	@Test
	void testIterableEqualsNotEquals() {
		List<String> list = new ArrayList<String>();
		list.add("luv");
		list.add("2");
		list.add("code");
		
		Assertions.assertIterableEquals(list, demo.getAcademyInList(), "Both Lists Should be Equal");
	}
	
	@DisplayName("Lines Match Not Match")
	@Test
	void testLineEqualsNotEquals() {
		List<String> list = new ArrayList<String>();
		list.add("luv");
		list.add("2");
		list.add("code");
		
		Assertions.assertLinesMatch(list, demo.getAcademyInList(), "Both Lines Should be Matching");
	}
	
}
