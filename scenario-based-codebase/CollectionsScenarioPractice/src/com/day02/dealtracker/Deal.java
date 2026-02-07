package com.day02.dealtracker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// represents one deal
public class Deal {
	private String code;
	private LocalDate validTill;
	private int discountPercent;
	private int minPurchase;

	// constructor
	public Deal(String code, String validTillStr, String discountStr, String minPurchaseStr)
			throws InvalidDealException {
		this.code = code.trim();

		// parse date dd-MM-yyyy
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		try {
			this.validTill = LocalDate.parse(validTillStr.trim(), fmt);
			
		} catch (Exception e) {
			throw new InvalidDealException("Invalid date format: " + validTillStr);
		}

		// parse discount (remove % if present)
		try {
			String cleanDiscount = discountStr.trim().replace("%", "");
			this.discountPercent = Integer.parseInt(cleanDiscount);
			
			if (discountPercent < 0 || discountPercent > 100) {
				throw new InvalidDealException("Discount must be 0-100%");
			}
			
		} catch (NumberFormatException e) {
			throw new InvalidDealException("Invalid discount: " + discountStr);
		}

		// parse min purchase
		try {
			this.minPurchase = Integer.parseInt(minPurchaseStr.trim());
			
			if (minPurchase < 0) {
				throw new InvalidDealException("Minimum purchase cannot be negative");
			}
			
		} catch (NumberFormatException e) {
			throw new InvalidDealException("Invalid min purchase: " + minPurchaseStr);
		}
	}

	public String getCode() {
		return code;
	}

	public LocalDate getValidTill() {
		return validTill;
	}

	public int getDiscountPercent() {
		return discountPercent;
	}

	public int getMinPurchase() {
		return minPurchase;
	}

	public boolean isExpired(LocalDate today) {
		return validTill.isBefore(today);
	}

	// good string representation
	@Override
	public String toString() {
		return code + " | " + discountPercent + "% off | Min: Rs." + minPurchase + " | Valid till: " + validTill;
	}
}