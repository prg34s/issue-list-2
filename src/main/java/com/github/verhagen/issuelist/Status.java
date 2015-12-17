package com.github.verhagen.issuelist;

public enum Status {
	OPEN;

	public static Status fromText(String name) {
		if (name == null) {
			throw new IllegalArgumentException("Argument 'name' should not be null.");
		}
		return OPEN;
	}

}
