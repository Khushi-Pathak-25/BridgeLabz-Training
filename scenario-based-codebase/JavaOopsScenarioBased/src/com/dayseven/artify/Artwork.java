package com.dayseven.artify;

public abstract class Artwork implements IPurchasable{
	
	// title, artist, price, licenseType
	private String title;
	private String artist;
	private double price;
	protected LicenseType licenseType;
	private boolean preview;

    // with preview
	public Artwork(String title, String artist, double price,
			       LicenseType licenseType, boolean preview) {
		this.title = title;
		this.artist = artist;
		this.price = price;
		this.licenseType = licenseType;
		this.preview = preview;
	}
	
	// Constructor without preview
    public Artwork(String title, String artist, double price,
                   LicenseType licenseType) {
        this(title, artist, price, licenseType, false);
    }
	public boolean canPreview() {
		return true;
	}

	// Deduct wallet balance
    @Override
    public void purchase(User user) {
        if (user.getWalletBalance() >= price) {
            user.deductBalance(price);
            System.out.println("Purchase successful: " + title);
        } else {
            System.out.println("Insufficient wallet balance!");
        }
    }

    public double getPrice() {
        return price;
    }
}
