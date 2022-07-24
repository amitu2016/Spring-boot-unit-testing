package com.luv2code.junitdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DemoUtilTest {

	@Test
	void testEqualsAndNotEquals() {
		DemoUtils demo = new DemoUtils();
		
		Assertions.assertEquals(6, demo.add(3, 3), "3 + 3 equals 6");
		Assertions.assertNotEquals(9, demo.add(3, 3), "3 + 3 not equals 9");
		
		
	}
	
	@Test
	void testNullandNotNullObject() {
		DemoUtils demo = new DemoUtils();
		
		String str1 = null;
		String str2 = "Amit";
		
		Assertions.assertNotNull(demo.checkNull(str2), "Object should not be null");
		Assertions.assertNull(demo.checkNull(str1), "Object Should be null");
		
	}
	
}
