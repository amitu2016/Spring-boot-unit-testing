package com.luv2code.junitdemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DemoUtilTest {
	
	DemoUtils demo;
	
	@BeforeAll
	static void executeBeforeAll() {
		System.out.println("Running executeBeforeAll() method");
	}
	
	@AfterAll
	static void executeAfterAll() {
		System.out.println("Running executeAfterAll() method");
	}
	
	@BeforeEach
	void executeBeforeEach() {
	    demo = new DemoUtils();
		System.out.println("Running executeBeforeEach() method");
	}
	
	@AfterEach
	void executeAfterEach() {
		System.out.println("Running executeAfterEach() method");
	}

	@Test
	void testEqualsAndNotEquals() {
		
		
		Assertions.assertEquals(6, demo.add(3, 3), "3 + 3 equals 6");
		Assertions.assertNotEquals(9, demo.add(3, 3), "3 + 3 not equals 9");
		
		
	}
	
	@Test
	void testNullandNotNullObject() {
		
		
		String str1 = null;
		String str2 = "Amit";
		
		Assertions.assertNotNull(demo.checkNull(str2), "Object should not be null");
		Assertions.assertNull(demo.checkNull(str1), "Object Should be null");
		
	}
	
}
