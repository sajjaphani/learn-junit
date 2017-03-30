package org.learnjunit.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * A test class to test the parameterized tests.
 * 
 * @author psajja
 *
 */
@RunWith(Parameterized.class)
public class GcdParameterizedTest {

	private int number1;
	private int number2;
	private int expectedValue;

	public GcdParameterizedTest(int number1, int number2, int expectedValue) {
		this.number1 = number1;
		this.number2 = number2;
		this.expectedValue = expectedValue;
	}

	@Test
	public void test() {
		assertEquals(MathUtil.gcd(number1, number2), expectedValue);
	}

	@Parameters
	public static Collection<Object[]> gcdData() {
		return Arrays.asList(new Object[][] { { 50, 20, 10 }, { 45, 9, 9 }, { 17, 5, 1 } });
	}

}
