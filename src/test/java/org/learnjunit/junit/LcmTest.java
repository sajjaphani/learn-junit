package org.learnjunit.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.learnjunit.junit.MathUtil;

/**
 * Test class for LCM API test.
 * 
 * @author psajja
 *
 */
public class LcmTest {

	/**
	 * Test method for {@link org.learnjunit.junit.MathUtil#lcm(int, int)}.
	 */
	@Test
	public void testGcd() {
		int gcd = MathUtil.lcm(50, 20);
		assertEquals(100, gcd);
	}

}
