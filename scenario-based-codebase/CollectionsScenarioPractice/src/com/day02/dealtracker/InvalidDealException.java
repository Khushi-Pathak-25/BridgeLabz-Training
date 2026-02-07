package com.day02.dealtracker;

// custom exception for invalid deal data
public class InvalidDealException extends Exception {
  	private static final long serialVersionUID = 1L;

	public InvalidDealException(String message) {
        super(message);
    }
}