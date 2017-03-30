package org.learnjunit.mockito.spy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.spy;

import org.junit.Test;

/**
 * Tests the spy object.
 * 
 * @author psajja
 *
 */
public class SpyTest {

	@Test
	public void testWithAuditTestSpy() {
		// fixture setup
		FlightDto expectedFlightDto = createAnUnregFlight();
		FlightManagementFacade facade = new FlightManagementFacadeImpl();
		// Test Double setup
		AuditLog logSpy = new AuditLogSpy();
		facade.setAuditLog(logSpy);
		// exercise
		facade.removeFlight(expectedFlightDto.getFlightNumber());
		// verify
		assertFalse("flight still exists after being removed",
				facade.flightExists(expectedFlightDto.getFlightNumber()));
		assertEquals("number of calls", 1, logSpy.getNumberOfCalls());
		assertEquals("action code", SpyHelper.DUMMY_REMOVE_FLIGHT_ACTION_CODE, logSpy.getActionCode());
		assertEquals("date", SpyHelper.getTodaysDateWithoutTime(), logSpy.getDate());
		assertEquals("user", SpyHelper.Dummy_USER_NAME, logSpy.getUser());
		assertEquals("detail", expectedFlightDto.getFlightNumber(), logSpy.getDetail());
	}

	/**
	 * @return
	 */
	private FlightDto createAnUnregFlight() {
		return new FlightDto(SpyHelper.DUMMY_FLIGHT_NUMBER);
	}

	@Test
	public void testWithAuditTestMockitoSpy() {
		// fixture setup
		FlightDto expectedFlightDto = createAnUnregFlight();
		FlightManagementFacade facade = new FlightManagementFacadeImpl();
		// Test Double setup
		AuditLog auditLog = new AuditLogSpy();
		AuditLog logSpy = spy(auditLog);

		// System.out.println(auditLog.getClass());
		// System.out.println(logSpy.getClass());

		facade.setAuditLog(logSpy);
		// exercise
		facade.removeFlight(expectedFlightDto.getFlightNumber());
		// verify
		assertFalse("flight still exists after being removed",
				facade.flightExists(expectedFlightDto.getFlightNumber()));
		assertEquals("number of calls", 1, logSpy.getNumberOfCalls());
		assertEquals("action code", SpyHelper.DUMMY_REMOVE_FLIGHT_ACTION_CODE, logSpy.getActionCode());
		assertEquals("date", SpyHelper.getTodaysDateWithoutTime(), logSpy.getDate());
		assertEquals("user", SpyHelper.Dummy_USER_NAME, logSpy.getUser());
		assertEquals("detail", expectedFlightDto.getFlightNumber(), logSpy.getDetail());
	}
}
