package org.learnjunit.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * A sample class configured with life cycle annotations.
 * 
 * @author psajja
 *
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class GcdTests {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("**In setUpBeforeClass, executes once before any test.**");
		System.out.println("===============================");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("===============================");
		System.out.println("**In tearDownAfterClass, executes once after all tests.**");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("\tIn setUp, executes before every test");
		System.out.println("\t-----------------------------");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("\t-----------------------------");
		System.out.println("\tIn setUp, executes after every test");
	}

	/**
	 * Test method for {@link org.learnjunit.junit.MathUtil#gcd(int, int)}.
	 */
	@Test
	public void testGcd() {
		System.out.println("\tA test case.");
		int gcd = MathUtil.gcd(50, 20);
		assertEquals(10, gcd);
	}

	/**
	 * Test method for {@link org.learnjunit.junit.MathUtil#gcd(int, int)}.
	 */
	@Test
	public void testGcdFail() {
		System.out.println("\tA test case.");
		int gcd = MathUtil.gcd(10, 2);
		assertEquals(1, gcd);
	}
}
