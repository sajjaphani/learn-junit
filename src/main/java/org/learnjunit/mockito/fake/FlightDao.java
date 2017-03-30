package org.learnjunit.mockito.fake;

import java.util.List;

/**
 * DAO for Flight.
 * 
 * @author psajja
 *
 */
public interface FlightDao {

	/**
	 * @param airportCode
	 * @param name
	 * @param nearbyCity
	 * @return
	 * @throws Exception
	 */
	Airport createAirport(String airportCode, String name, String nearbyCity) throws Exception;

	/**
	 * @param airportId
	 * @return
	 * @throws Exception
	 */
	Airport getAirportByPrimaryKey(String airportId) throws Exception;

	/**
	 * @param origin
	 * @param destination
	 */
	void createFlight(String origin, String destination);

	/**
	 * @param origin
	 * @return
	 */
	List<Flight> getFlightsByOriginAirport(String origin);
}
