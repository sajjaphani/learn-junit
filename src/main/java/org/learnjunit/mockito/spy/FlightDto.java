package org.learnjunit.mockito.spy;

/**
 * DAO for Flight.
 * 
 * @author psajja
 *
 */
public class FlightDto {

	private String flightNumber;

	public FlightDto(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	// other flight stuff
}
