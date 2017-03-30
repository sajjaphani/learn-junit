package org.learnjunit.mockito.fake;

/**
 * Airport object.
 * 
 * @author psajja
 *
 */
public class Airport {

	private String id;
	private String airportCode;
	private String name;
	private City city;

	/**
	 * @param gentNextId
	 * @param airportCode
	 * @param name
	 * @param createCity
	 */
	public Airport(String id, String airportCode, String name, City city) {
		this.id = id;
		this.airportCode = airportCode;
		this.name = name;
		this.city = city;
	}

	/**
	 * @return
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the airportCode
	 */
	public String getAirportCode() {
		return airportCode;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the city
	 */
	public City getCity() {
		return city;
	}
}
