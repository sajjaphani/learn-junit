package org.learnjunit.mockito.stub;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Calendar;

import org.junit.Test;

/**
 * Test class to test the stubbing.
 * 
 * @author psajja
 *
 */
public class StubTest {

	@Test
	public void testMidnightTimeString() {

		// Test Double configuration
		TimeProvider tpStub = mock(TimeProvider.class);

		Calendar midnight = Calendar.getInstance();
		midnight.set(Calendar.MINUTE, 0);
		midnight.set(Calendar.HOUR_OF_DAY, 0);
		
		// Instantiate Test:
		TimeDisplay sut = new TimeDisplay();
		// Test Double installation
		sut.setTimeProvider(tpStub);

		// Set expectation
		when(tpStub.getTime()).thenReturn(midnight);

		// exercise
		String result = sut.getCurrentTimeAsHtmlFragment();

		// verify outcome
		String expectedTimeString = "<span class=\"tinyBoldText\">Midnight</span>";
		assertEquals("Midnight", expectedTimeString, result);
	}
}
