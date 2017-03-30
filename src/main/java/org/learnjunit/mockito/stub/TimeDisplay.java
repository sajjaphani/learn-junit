package org.learnjunit.mockito.stub;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Time display object.
 * 
 * @author psajja
 *
 */
public class TimeDisplay {

	private TimeProvider tpStub;

	/**
	 * @param tpStub
	 */
	public void setTimeProvider(TimeProvider tpStub) {
		this.tpStub = tpStub;
	}

	/**
	 * Get the html string from for the time.
	 * 
	 * @return
	 * 		html time string
	 */
	public String getCurrentTimeAsHtmlFragment() {
		if (tpStub.getTime().get(Calendar.HOUR) == 0 && tpStub.getTime().get(Calendar.MINUTE) == 0)
			return "<span class=\"tinyBoldText\">Midnight</span>";

		SimpleDateFormat format = new SimpleDateFormat("hh-mm");

		String formatted = format.format(tpStub.getTime().getTime());
		return "<span class=\"tinyBoldText\">Time: " + formatted + "</span>";
	}
}
