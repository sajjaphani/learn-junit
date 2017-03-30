package org.learnjunit.mockito.dummy;

/**
 * A dummy object created for testing purpose.
 * 
 * @author psajja
 *
 */
public class DummyCustomer implements ICustomer {

	/* (non-Javadoc)
	 * @see org.learnjunit.mockito.dummy.ICustomer#getName()
	 */
	@Override
	public String getName() {
		throw new RuntimeException("This should never be called!");
	}

}
