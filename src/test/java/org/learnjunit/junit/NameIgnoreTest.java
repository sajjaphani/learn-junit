package org.learnjunit.junit;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Tests the Ignore functionality.
 * 
 * @author psajja
 *
 */
public class NameIgnoreTest {

//	@Test
	public void test() {
		Set<Name> s = new HashSet<Name>();
		s.add(new Name("Ned", "Stark"));
		assertTrue(s.contains(new Name("Ned", "Stark")));
	}
	
	@Test
	@Ignore
	public void testIgnore() {
		Set<Name> s = new HashSet<Name>();
		s.add(new Name("Ned", "Stark"));
		assertTrue(s.contains(new Name("Ned", "Stark")));
	}
}
