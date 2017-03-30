package org.learnjunit.mockito.fake;

import java.util.List;

/**
 * Flight management facade.
 * 
 * @author psajja
 *
 */
public interface FlightManagementFacade {

	public void setDao(FlightDao flightDao);

	public void createFlight(String origin, String destination);

	public String createAirport(String airportCode, String name, String city);

	public List<Flight> getFlightsByOriginAirport(String origin);
}
