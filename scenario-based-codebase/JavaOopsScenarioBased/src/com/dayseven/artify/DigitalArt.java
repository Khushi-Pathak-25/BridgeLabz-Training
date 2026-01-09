package com.dayseven.artify;

public class DigitalArt extends Artwork {

	public DigitalArt(String title, String artist, double price, LicenseType licenseType,
			boolean preview) {
		super(title, artist, price, licenseType, preview);
	}
	
	@Override
    public void license(LicenseType licenseType) {
        System.out.println("Digital Art licensed for " + licenseType +
                " use with downloadable access.");
    }

}
