package org.learnjunit.mockito.spy;

/**
 * Represents subsystem for flight management.
 * 
 * @author psajja
 *
 */
public interface FlightManagementFacade {

	public void setAuditLog(AuditLog logSpy);

	/**
	 * @param flightNumber
	 */
	public void removeFlight(String flightNumber);

	/**
	 * @param flightNumber
	 * @return
	 */
	public boolean flightExists(String flightNumber);

}
