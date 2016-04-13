package com.midterm.bergmanmcdermott;

import static org.junit.Assert.*;

import org.junit.Test;

public class EnDeValidationTest {

	@Test
	public void testEncryptOption() {
		assertEquals(Validation.encryDecry("e"), "encry");
	}

	@Test
	public void testDecryptOption() {
		assertEquals(Validation.encryDecry("d"), "decry");
	}

	@Test
	public void testInvalidInput() {
		assertEquals(Validation.encryDecry("a"), null);
	}
	

}
