package org.learnjunit.mockito.fake;

/**
 * A class to generates unique ids based on prefix.
 * 
 * @author psajja
 *
 */
public class UniqueIdGen {

	private int num;
	private String prefix;

	public UniqueIdGen(String prefix) {
		num = 0;
		this.prefix = prefix == null ? "" : prefix;
	}

	public String gentNextId() {
		return prefix + "-" + (++num);
	}
}
