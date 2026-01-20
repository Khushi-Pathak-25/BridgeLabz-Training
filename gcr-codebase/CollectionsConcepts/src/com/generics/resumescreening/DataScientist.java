package com.generics.resumescreening;

public class DataScientist extends JobRole {

	public DataScientist() {
		super("Data Scientist");
	}

	@Override
	public void screenResume() {
		System.out.println("Screening for statistics and machine learning skills.");
	}
}
