/*19. "Artify – Digital Art Marketplace"
Story: Artists sell digital art via Artify. Buyers can purchase, license, 
or subscribe to collections.
Requirements:
● Artwork class: title, artist, price, licenseType.
● User class: name, walletBalance.
● Interface IPurchasable with purchase() and license() methods.
● Encapsulation: licensing terms are protected.
● Use constructors to initialize artworks with or without previews.
● Operators: deduct wallet balance on purchase.
● Inheritance: DigitalArt, PrintArt from Artwork.
● Polymorphism: licensing varies across art types.*/

package com.dayseven.artify;

import java.util.Scanner;

public class ArtifyDigitalArtMarketplace {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);

        // User details
        System.out.print("Enter user name: ");
        String name = sc.nextLine();

        System.out.print("Enter wallet balance: ");
        double balance = sc.nextDouble();

        User user = new User(name, balance);

        // Choose art type
        System.out.println("\nSelect Art Type:");
        System.out.println("1. Digital Art");
        System.out.println("2. Print Art");
        int artChoice = sc.nextInt();
        sc.nextLine(); // clear buffer

        // Artwork details
        System.out.print("Enter artwork title: ");
        String title = sc.nextLine();

        System.out.print("Enter artist name: ");
        String artist = sc.nextLine();

        System.out.print("Enter artwork price: ");
        double price = sc.nextDouble();

        // License selection
        System.out.println("\nSelect License Type:");
        System.out.println("1. PERSONAL");
        System.out.println("2. COMMERCIAL");
        System.out.println("3. EXCLUSIVE");
        int licenseChoice = sc.nextInt();

        LicenseType licenseType;
        switch (licenseChoice) {
            case 1:
                licenseType = LicenseType.PERSONAL;
                break;
            case 2:
                licenseType = LicenseType.COMMERCIAL;
                break;
            case 3:
                licenseType = LicenseType.EXCLUSIVE;
                break;
            default:
                System.out.println("Invalid license choice!");
                sc.close();
                return;
        }

        // Preview option
        System.out.print("Preview available? (true/false): ");
        boolean preview = sc.nextBoolean();

        Artwork artwork;

        if (artChoice == 1) {
            artwork = new DigitalArt(title, artist, price, licenseType, preview);
        } else if (artChoice == 2) {
            artwork = new PrintArt(title, artist, price, licenseType, preview);
        } else {
            System.out.println("Invalid art type!");
            sc.close();
            return;
        }

        // Purchase artwork
        artwork.purchase(user);

        // Apply license
        artwork.license(licenseType);

        sc.close();
    }	     

}