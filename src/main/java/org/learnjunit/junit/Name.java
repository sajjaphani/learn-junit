package org.learnjunit.junit;

/**
 * Represents a name object.
 * 
 * @author psajja
 *
 */
public class Name {

	private final String first, last;

	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Name))
			return false;
		Name name = (Name) o;
		return first != null && first.equals(name.first) && last != null && last.equals(name.last);
	}
	
	// Failed to override hashCode method
}
