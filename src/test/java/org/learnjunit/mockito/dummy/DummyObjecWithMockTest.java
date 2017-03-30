package org.learnjunit.mockito.dummy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.withSettings;

import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.learnjunit.mockito.dummy.ICustomer;
import org.learnjunit.mockito.dummy.Invoice;
import org.learnjunit.mockito.dummy.LineItem;
import org.learnjunit.mockito.dummy.Product;
import org.mockito.internal.stubbing.answers.ThrowsException;

/**
 * We can use a Dummy Object whenever we need to use objects as attributes of other objects or arguments 
 * of methods on the SUT or other fixture objects.
 * This is pretty much equal to {@code DummyObjectTest}.
 * 
 * @author psajja
 *
 */
public class DummyObjecWithMockTest {

	@Test
	public void testInvoiceWithDummyObject() {
	
		final int QUANTITY = 1;
		Product product = new Product(UUID.randomUUID().toString(), "Dummy Product Name");
		
		// We use Mockito, whith default behavior on method invocation will throw exception
		ICustomer customer = mock(ICustomer.class, withSettings().defaultAnswer(new ThrowsException(new RuntimeException("This should never be called!"))));
		
		// Execution of this line throws exception and the test fails
		System.out.println(customer.getName());
		Invoice inv = new Invoice(customer);
		LineItem expItem = new LineItem(inv, product, QUANTITY);
		
		// Exercise
		inv.addLineItems(product, QUANTITY);
	    
		// Verify
		List<LineItem> lineItems = inv.getLineItems();
		assertEquals("Number of items", lineItems.size(), 1);
		LineItem actual = (LineItem)lineItems.get(0);
		boolean equals = expItem.equals(actual);
		assertTrue("Line items are equal", equals);
	}
}
