package org.learnjunit.junit;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

/**
 * Tests Rule.
 * 
 * @author psajja
 *
 */
public class RulesTest {

	@Rule
	public TestRule globalTimeout = Timeout.millis(500);

	@Test()
	public void test() {
		String url = "https://www.google.co.in/";

		boolean status = HttpUtil.getStatus(url);

		assertTrue(status);
	}

	@Rule
	public TemporaryFolder folder = new TemporaryFolder();

	@Test
	public void testUsingTempFolder() throws IOException {
		File createdFile = folder.newFile("myfile.txt");
		assertTrue(createdFile.exists());
	}
}
