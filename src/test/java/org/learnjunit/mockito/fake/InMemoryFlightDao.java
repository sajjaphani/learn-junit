package org.learnjunit.mockito.fake;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an in-memory DAO object.
 * 
 * @author psajja
 *
 */
public class InMemoryFlightDao implements FlightDao {

	private UniqueIdGen airportIdGen = new UniqueIdGen("Airport");
	private UniqueIdGen flightIdGen = new UniqueIdGen("Flight");

	private List<Airport> airports = new ArrayList<Airport>();
	private List<Flight> flights = new ArrayList<Flight>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.learnjunit.mockito.fake.FlightDao#createAirport(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public Airport createAirport(String airportCode, String name, String nearbyCity) throws Exception {
		// TODO validate airportCode, name, nearbyCity
		// TODO validate airport doesn't exist with airportCode
		Airport result = new Airport(airportIdGen.gentNextId(), airportCode, name, createCity(nearbyCity));
		airports.add(result);
		return result;
	}

	/**
	 * @param city
	 * @return
	 */
	private City createCity(String city) {
		return new City(city);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.learnjunit.mockito.fake.FlightDao#getAirportByPrimaryKey(java.lang.
	 * String)
	 */
	@Override
	public Airport getAirportByPrimaryKey(String airportId) throws Exception {
		// TODO validate NotNull with airportId
		for (Airport airport : airports) {
			if (airport.getId().equals(airportId)) {
				return airport;
			}
		}
		throw new Exception("Airport not found: " + airportId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.learnjunit.mockito.fake.FlightDao#createFlight(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void createFlight(String origin, String destination) {

		// TODO validation
		try {
			Flight flight = new Flight(flightIdGen.gentNextId(), getAirportByPrimaryKey(origin),
					getAirportByPrimaryKey(destination));
			flights.add(flight);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.learnjunit.mockito.fake.FlightDao#getFlightsByOriginAirport(java.lang.
	 * String)
	 */
	@Override
	public List<Flight> getFlightsByOriginAirport(String origin) {
		// TODO Auto-generated method stub
		// TODO validate NotNull with airportId
		List<Flight> flights = new ArrayList<Flight>();
		for (Flight flight : this.flights) {
			if (flight.getOrigin().getId().equals(origin)) {
				flights.add(flight);
			}
		}
		return flights;
	}

}
