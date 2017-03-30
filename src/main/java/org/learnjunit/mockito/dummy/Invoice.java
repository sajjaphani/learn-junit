package org.learnjunit.mockito.dummy;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoice.
 * 
 * @author psajja
 *
 */
public class Invoice {

	private List<LineItem> items;
	
	@SuppressWarnings("unused")
	private ICustomer customer;
	
	/**
	 * Create an invoice.
	 * 
	 * @param customer
	 */
	public Invoice(ICustomer customer) {
		if(customer == null)
			throw new NullPointerException("Customer cannot be null.");
		
		// Stored for later processing
		this.customer = customer;

		this.items = new ArrayList<LineItem>();
	}

	/**
	 * Add a line item.
	 * 
	 * @param product
	 * 		the product
	 * @param quantity
	 * 		quantity
	 */
	public void addLineItems(Product product, int quantity) {
		items.add(new LineItem(this, product, quantity));
	}

	/**
	 * Get the line items.
	 * 
	 * @return
	 * 		line items
	 */
	public List<LineItem> getLineItems() {
		return items;
	}
}
