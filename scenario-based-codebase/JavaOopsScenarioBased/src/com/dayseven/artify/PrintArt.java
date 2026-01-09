package com.dayseven.artify;

public class PrintArt extends Artwork {

	public PrintArt(String title, String artist, double price, LicenseType licenseType, 
			        boolean preview) {
		super(title, artist, price, licenseType, preview);
	}
	
	@Override
    public void license(LicenseType licenseType) {
        System.out.println("Print Art licensed for " + licenseType +
                " use with physical print rights.");
    }

}
