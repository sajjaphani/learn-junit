package org.learnjunit.mockito.fake;

import java.util.List;

/**
 * An implementation of <code>FlightManagementFacade</code>.
 * 
 * @author psajja
 *
 */
public class FlightManagementFacadeImpl implements FlightManagementFacade {

	private FlightDao flightDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.learnjunit.mockito.fake.FlightManagementFacade#setDao(org.codebits.
	 * mockito.fake.FlightDao)
	 */
	@Override
	public void setDao(FlightDao flightDao) {
		this.flightDao = flightDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.learnjunit.mockito.fake.FlightManagementFacade#createFlight(java.lang.
	 * String, java.lang.String)
	 */
	@Override
	public void createFlight(String origin, String destination) {
		flightDao.createFlight(origin, destination);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.learnjunit.mockito.fake.FlightManagementFacade#createAirport(java.lang.
	 * String, java.lang.String, java.lang.String)
	 */
	@Override
	public String createAirport(String airportCode, String name, String city) {
		try {
			return flightDao.createAirport(airportCode, name, city).getId();
		} catch (Exception e) {
			// TODO should handle the exception
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.learnjunit.mockito.fake.FlightManagementFacade#
	 * getFlightsByOriginAirport(java.lang.String)
	 */
	@Override
	public List<Flight> getFlightsByOriginAirport(String origin) {
		return flightDao.getFlightsByOriginAirport(origin);
	}

}
