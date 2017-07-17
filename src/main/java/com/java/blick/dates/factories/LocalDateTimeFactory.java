package com.java.blick.dates.factories;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class LocalDateTimeFactory {

	private long millis;

	public LocalDateTimeFactory(long millis) {
		this.millis = millis;
	}

	public LocalDateTime withZone(ZoneId zone) {
		return LocalDateTime.ofInstant(new Date(millis).toInstant(), zone);
	}

	public LocalDateTime withDefaultZone() {
		return withZone(ZoneId.systemDefault());
	}

}
