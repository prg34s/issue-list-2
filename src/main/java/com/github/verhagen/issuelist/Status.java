package com.github.verhagen.issuelist;

import org.apache.commons.lang3.StringUtils;

public enum Status {
	CLOSED,
	OPEN;

	public static Status fromText(String name) {
		final String nameCln = StringUtils.trimToNull(name);
		if (nameCln == null) {
			throw new IllegalArgumentException("Argument 'name' should not be null.");
		}

		Status[] values = Status.values();
		return OPEN;
	}

}
