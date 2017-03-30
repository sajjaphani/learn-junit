package org.learnjunit.mockito.dummy;

/**
 * A Product object
 * 
 * @author psajja
 *
 */
public class Product {

	private String id;
	private String name;
	
	/**
	 * Construct a product object.
	 * 
	 * @param string
	 * @param gentNextId
	 */
	public Product(String id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == this)
		      return true;
		
		if (!(obj instanceof Product)) {
			return false;
		}
		
		Product product = (Product) obj;
		return this.id == product.id && this.name == product.name;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		int hash = 17;
		hash = 31 * hash + id == null ? 0 : id.hashCode();
		hash = 31 * hash + name == null ? 0 : name.hashCode();
		return hash;
	}
}
