package org.learnjunit.mockito.mock;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.InOrder;

/**
 * Tests the mock object.
 * 
 * @author psajja
 *
 */
public class MockTest {

	@Test
	public void testOrderFillBehavior() {

		// setup - data
		Product talisker = new Product("Talisker");
		final int QUANTITY = 50;
		Order order = new Order(talisker, QUANTITY);
		IWarehouse warehouse = mock(IWarehouse.class);
		InOrder inOrder = inOrder(warehouse);

		// setup - expectations
		doNothing().when(warehouse).add(talisker, QUANTITY);
		when(warehouse.hasInventory(talisker, QUANTITY)).thenReturn(true);

		// exercise
		warehouse.add(talisker, QUANTITY);
		order.fill(warehouse);

		// verify
		verify(warehouse).remove(talisker, QUANTITY);

		// Order of verification
		inOrder.verify(warehouse).add(talisker, QUANTITY);
		inOrder.verify(warehouse).hasInventory(talisker, QUANTITY);
		inOrder.verify(warehouse).remove(talisker, QUANTITY);
	}
}
