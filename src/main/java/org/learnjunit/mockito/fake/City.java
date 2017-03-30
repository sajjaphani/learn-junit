package org.learnjunit.mockito.fake;

/**
 * City object.
 * 
 * @author psajja
 *
 */
public class City {

	private String cityName;

	/**
	 * @param city
	 */
	public City(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}
}
