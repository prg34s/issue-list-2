package com.github.verhagen.issuelist;

import static org.junit.Assert.*;

import org.junit.Test;

public class StatusTest {

	@Test
	public void createOpen() throws Exception {
		String statusStr = "open";
		Status status = Status.fromText(statusStr);
		
		assertNotNull(status);
		assertEquals(statusStr.toUpperCase(), status.name());
	}

	@Test
	public void createNull() throws Exception {
		try {
			Status.fromText(null);
		}
		catch (IllegalArgumentException iae) {
			assertEquals("Argument 'name' should not be null.", iae.getMessage());
		}
	}

}
