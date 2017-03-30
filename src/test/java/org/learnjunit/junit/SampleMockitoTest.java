package org.learnjunit.junit;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Sample mock test.
 *  
 * @author psajja
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class SampleMockitoTest {

	@Test
	public void test() {

		// Create mock
		@SuppressWarnings("rawtypes")
		List mockList = mock(List.class);
		
		// stubbing
		when(mockList.get(0)).thenReturn("mymock");
		
		Assert.assertEquals("mymock", mockList.get(0));
	}
}
