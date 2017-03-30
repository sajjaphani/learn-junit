package org.learnjunit.mockito.mock;

/**
 * Order object.
 * 
 * @author psajja
 *
 */
public class Order {

	private Product product;
	private int quantity;
	
	private boolean isFilled;
	
	public Order(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	public void fill(IWarehouse warehouse) {
		if(warehouse.hasInventory(product, quantity)) {
			warehouse.remove(product, quantity);
			isFilled = true;
		}
	}
	
	public boolean isFilled() {
		return isFilled;
	}
}
