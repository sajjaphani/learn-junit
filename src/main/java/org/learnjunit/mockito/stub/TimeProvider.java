package org.learnjunit.mockito.stub;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Time provider.
 * 
 * @author psajja
 *
 */
public class TimeProvider {

	private Calendar myTime = new GregorianCalendar();

	/**
	 * The complete constructor for the TimeProviderTestStub
	 * 
	 * @param hours
	 *            specify the hours using a 24 hour clock (e.g. 10 = 10 AM, 12 =
	 *            noon, 22 = 10 PM, 0 = midnight)
	 * @param minutes
	 *            specify the minutes after the hour (e.g. 0 = exactly on the
	 *            hour, 1 = 1 min after the hour)
	 */
	public TimeProvider(int hours, int minutes) {
		setTime(hours, minutes);
	}

	public void setTime(int hours, int minutes) {
		setHours(hours);
		setMinutes(minutes);
	}

	public void setHours(int hours) {
		myTime.set(Calendar.HOUR_OF_DAY, hours);
	}

	public void setMinutes(int minutes) {
		myTime.set(Calendar.MINUTE, minutes);
	}

	public Calendar getTime() {
		return myTime;
	}
}
