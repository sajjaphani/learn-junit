package org.learnjunit.junit;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Utility class.
 * 
 * @author psajja
 *
 */
public class HttpUtil {

	private HttpUtil() {
	}

	/**
	 * Given a String URL (HTTP), this method will ping for the response.
	 * 
	 * @param url
	 *   	given url
	 * 
	 * @return 
	 * 		true if the status is '200 OK', false otherwise.
	 */
	public static boolean getStatus(String url) {

		URL httpUrl;
		try {
			httpUrl = new URL(url);
			HttpURLConnection urlConn = (HttpURLConnection) httpUrl.openConnection();
			// urlConn.setConnectTimeout(1000 * 10);
			long startTime = System.currentTimeMillis();
			urlConn.connect();
			long endTime = System.currentTimeMillis();
			System.out.println("[log] Time Taken to ping '" + url + "' is " + (endTime - startTime) + "ms");
			if (urlConn.getResponseCode() == HttpURLConnection.HTTP_OK)
				return true;
		} catch (IOException e) {
			throw new RuntimeException("Some problem in retrieving URL " + url, e);
		}

		return false;
	}
}
