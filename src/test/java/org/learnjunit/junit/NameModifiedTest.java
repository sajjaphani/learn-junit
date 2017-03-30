package org.learnjunit.junit;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

/**
 * Tests the correct name object.
 * 
 * @author psajja
 *
 */
public class NameModifiedTest {

	@Test
	public void test() {
		Set<NameModified> s = new HashSet<NameModified>();
		s.add(new NameModified("Ned", "Stark"));
		assertTrue(s.contains(new NameModified("Ned", "Stark")));
	}
}
