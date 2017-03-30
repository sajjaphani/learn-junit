package org.learnjunit.mockito.spy;

import java.util.HashSet;
import java.util.Set;

/**
 * An implementation of <code>FlightManagementFacade</code>.
 * 
 * @author psajja
 *
 */
public class FlightManagementFacadeImpl implements FlightManagementFacade {

	private AuditLog logSpy;

	Set<String> removedFlights = new HashSet<>();
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.learnjunit.mockito.spy.FlightManagementFacade#setAuditLog(org.codebits.
	 * mockito.spy.AuditLog)
	 */
	@Override
	public void setAuditLog(AuditLog logSpy) {
		this.logSpy = logSpy;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.learnjunit.mockito.spy.FlightManagementFacade#removeFlight(java.lang.
	 * String)
	 */
	@Override
	public void removeFlight(String flightNumber) {
		removedFlights.add(flightNumber);
		// removal stuff here
		logSpy.logMessage(SpyHelper.getTodaysDateWithoutTime(), SpyHelper.Dummy_USER_NAME, SpyHelper.DUMMY_REMOVE_FLIGHT_ACTION_CODE,
				flightNumber);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.learnjunit.mockito.spy.FlightManagementFacade#flightExists(java.lang.
	 * String)
	 */
	@Override
	public boolean flightExists(String flightNumber) {
		// We removed the flight
		if(removedFlights.contains(flightNumber))
			return false;
		return true;
	}

}
