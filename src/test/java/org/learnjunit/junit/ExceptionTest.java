package org.learnjunit.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests the expected exception.
 * 
 * @author psajja
 *
 */
public class ExceptionTest {

	/**
	 * Test method for {@link java.lang.Integer#intValue()}.
	 */
	@Test(expected=NumberFormatException.class)
	public void testLength() {
		Integer myInt =  new Integer("abc");
		assertEquals(0, myInt.intValue());
	}

}
