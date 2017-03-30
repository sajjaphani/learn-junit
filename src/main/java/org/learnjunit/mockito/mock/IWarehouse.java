package org.learnjunit.mockito.mock;

/**
 * Warehouse.
 * 
 * @author psajja
 *
 */
public interface IWarehouse {

	public void add(Product product, int quantity);
	
	public void remove(Product product, int quantity);
	
	public boolean hasInventory(Product product, int quantity);
	
}
