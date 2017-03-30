package org.learnjunit.mockito.spy;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Spy helper class.
 * 
 * @author psajja
 *
 */
public class SpyHelper {

	public static final String DUMMY_REMOVE_FLIGHT_ACTION_CODE = "code-123";
	public static final String Dummy_USER_NAME = "test-user";

	public static final String DUMMY_FLIGHT_NUMBER = "Flight-123";

	private SpyHelper() {
	}

	/**
	 * @return
	 */
	public static Date getTodaysDateWithoutTime() {
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date today = new Date();
		Date todayWithZeroTime = null;
		try {
			todayWithZeroTime = formatter.parse(formatter.format(today));
		} catch (ParseException e) {
			// this should not happen
		}
		return todayWithZeroTime;
	}
}
