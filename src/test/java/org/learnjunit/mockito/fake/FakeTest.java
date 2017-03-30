package org.learnjunit.mockito.fake;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.learnjunit.mockito.fake.Flight;
import org.learnjunit.mockito.fake.FlightManagementFacade;
import org.learnjunit.mockito.fake.FlightManagementFacadeImpl;

/**
 * We should use a Fake Object whenever our SUT depends on other components that
 * are unavailable or which make testing difficult or slow. It must also be
 * easier to create a lightweight implementation.
 * 
 * @author psajja
 *
 */
public class FakeTest {

	@Test
	public void testFakeInMomeryDatabase() {

		// Setup:
		FlightManagementFacade facade = new FlightManagementFacadeImpl();
		facade.setDao(new InMemoryFlightDao());
		// Exercise:
		String airport1 = facade.createAirport("airport1", "Calgary", "Calgary");
		String airport2 = facade.createAirport("airport2", "LAX Intl", "LA");
		facade.createFlight(airport1, airport2);
		List<Flight> flights = facade.getFlightsByOriginAirport(airport1);
		// Verify:
		assertEquals("# of flights", 1, flights.size());
		Flight flight = flights.get(0);
		assertEquals("origin", airport1, flight.getOriginCode());
	}
}
