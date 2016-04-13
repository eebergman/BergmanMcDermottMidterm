package com.midterm.bergmanmcdermott;

import static org.junit.Assert.*;

import org.junit.Test;

public class EnDeValidationTest {

	@Test
	public void test1() {
		assertEquals(Validation.encryDecry("e"), "encry");
	}
	
	@Test
	public void test3() {
		assertEquals(Validation.encryDecry("d"), "decry");
	}
	
}
