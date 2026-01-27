package com.day01.travellog;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// holds one trip
public class Trip implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private String city;
	private String country;
	private LocalDate startDate;
	private LocalDate endDate;
	private String notes;

	public Trip(String id, String city, String country, LocalDate startDate, LocalDate endDate, String notes) {
		this.id = id;
		this.city = city;
		this.country = country;
		this.startDate = startDate;
		this.endDate = endDate;
		this.notes = notes;
	}

	// get duration in days
	public long getDuration() {
		return ChronoUnit.DAYS.between(startDate, endDate);
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public String getNotes() {
		return notes;
	}

	public String toString() {
		return id + " | " + city + " | " + country + " | " + startDate + " to " + endDate + " (" + getDuration()
				+ " days)";
	}
}