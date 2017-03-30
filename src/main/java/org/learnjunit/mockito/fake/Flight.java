package org.learnjunit.mockito.fake;

/**
 * Represents a Flight object.
 * 
 * @author psajja
 *
 */
public class Flight {

	@SuppressWarnings("unused")
	private String id;
	private Airport origin;
	@SuppressWarnings("unused")
	private Airport destination;

	/**
	 * 
	 * @param gentNextId
	 * @param origin
	 * @param destination
	 */
	public Flight(String id, Airport origin, Airport destination) {
		this.id = id;
		this.origin = origin;
		this.destination = destination;
	}

	/**
	 * @return
	 */
	public String getOriginCode() {
		return origin.getId();
	}

	/**
	 * @return
	 */
	public Airport getOrigin() {
		return origin;
	}
}
