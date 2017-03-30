package org.learnjunit.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.learnjunit.junit.MathUtil;

/**
 * Test class for GCD API test.
 * 
 * @author psajja
 *
 */
public class GcdTest {

	/**
	 * Test method for {@link org.learnjunit.junit.MathUtil#gcd(int, int)}.
	 */
	@Test
	public void testGcd() {
		int gcd = MathUtil.gcd(50, 20);
		assertEquals(10, gcd);
	}
}
