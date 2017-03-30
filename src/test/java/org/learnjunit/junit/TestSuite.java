package org.learnjunit.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * A sample test suite.
 * 
 * @author psajja
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({GcdTest.class, LcmTest.class})
public class TestSuite {

}
