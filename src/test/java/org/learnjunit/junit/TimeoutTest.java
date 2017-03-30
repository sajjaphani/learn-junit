package org.learnjunit.junit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Tests the timeout functionality.
 * 
 * @author psajja
 *
 */
public class TimeoutTest {

	@Test(timeout = 100)
	public void test() {
		String url = "https://www.google.co.in/";

		boolean status = HttpUtil.getStatus(url);

		assertTrue(status);
	}

}
