package org.learnjunit.junit;

/**
 * The correct version of name class.
 * When you override equals, override hashCode as well.
 * 
 * @author psajja
 *
 */
public class NameModified {

	private final String first, last;

	public NameModified(String first, String last) {
		this.first = first;
		this.last = last;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof NameModified))
			return false;
		NameModified name = (NameModified) o;
		return first != null && first.equals(name.first) && last != null && last.equals(name.last);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		int hash = 17;
		hash = 31 * hash + (first == null ? 0 : first.hashCode()) ;
		hash = 31 * hash + (last == null ? 0 : last.hashCode()) ;
		return hash;
	}
}
