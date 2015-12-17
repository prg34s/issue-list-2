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
	public void createClosed() throws Exception {
		String statusStr = "closed";
		Status status = Status.fromText(statusStr);
		
		assertNotNull(status);
		assertEquals(statusStr.toUpperCase(), status.name());
	}

	@Test(expected = IllegalArgumentException.class)
	public void createHelp() throws Exception {
		try {
			Status.fromText("help");
		}
		catch (IllegalArgumentException iae) {
			assertEquals("Argument 'name' with value 'help' is not a known Status.", iae.getMessage());
			throw iae;
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void createNull() throws Exception {
		try {
			Status.fromText(null);
		}
		catch (IllegalArgumentException iae) {
			assertEquals("Argument 'name' should not be null.", iae.getMessage());
			throw iae;
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void createSpaces() throws Exception {
		try {
			Status.fromText("   ");
		}
		catch (IllegalArgumentException iae) {
			assertEquals("Argument 'name' should not be null.", iae.getMessage());
			throw iae;
		}
	}

}
