package org.learnjunit.mockito.dummy;

/**
 * Line item.
 * 
 * @author psajja
 *
 */
public class LineItem {

	@SuppressWarnings("unused")
	private Invoice invoice;
	private Object product;
	private int quantity;

	/**
	 * Construct a line item.
	 * 
	 * @param invoice
	 * @param product
	 * @param quantity
	 */
	public LineItem(Invoice invoice, Product product, int quantity) {
		this.invoice = invoice;
		this.product = product;
		this.quantity = quantity;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == this)
		      return true;
		if (!(obj instanceof LineItem)) {
			return false;
		}
		
		LineItem lineItem = (LineItem) obj;
		
		// For quick testing purpose, we have omitted equals on invoice, it should not be done in real scenario
		return this.quantity == lineItem.quantity && this.product.equals(lineItem.product);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// For quick testing purpose, we have omitted hashCode computation on invoice, it should not be done in real scenario
		int hash = 17;
		hash = 31 * hash + (product == null ? 0 : product.hashCode());
		hash = 31 * hash + this.quantity;
		return hash;
	}
}
