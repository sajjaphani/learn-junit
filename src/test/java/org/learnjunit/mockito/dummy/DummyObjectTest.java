package org.learnjunit.mockito.dummy;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.learnjunit.mockito.dummy.Invoice;
import org.learnjunit.mockito.dummy.LineItem;
import org.learnjunit.mockito.dummy.Product;

/**
 * We can use a Dummy Object whenever we need to use objects as attributes of other objects or arguments 
 * of methods on the SUT or other fixture objects.
 * 
 * @author psajja
 *
 */
public class DummyObjectTest {

	@Test
	public void testInvoiceWithDummyObject() {
	
		final int QUANTITY = 1;
		Product product = new Product(UUID.randomUUID().toString(), "Dummy Product");
		
		// We could try passing in null for the Customer, but our Invoice won't accept null
		Invoice inv = new Invoice( new DummyCustomer() );
		LineItem expItem = new LineItem(inv, product, QUANTITY);
		
		// Exercise
		inv.addLineItems(product, QUANTITY);
	    
		// Verify
		List<LineItem> lineItems = inv.getLineItems();
		assertEquals("Number of items", lineItems.size(), 1);
		LineItem actual = (LineItem)lineItems.get(0);
		assertEquals("Line items are equal", expItem, actual);
	}
}
