/*
10. DealTracker – E-Commerce Discount Validator
Story: An e-commerce platform is flooded with daily deals, sent in a file like:
DealCode: FLAT50
ValidTill: 15-06-2025
Discount: 50%
MinimumPurchase: 999
The DealTracker tool should:
● Read and parse .txt deal entries using FileInputStream
● Use Regex to extract fields like percentage and date
● Filter expired deals using LocalDate + regex validation
● Store all valid deals in a Map<String, Deal>
● Use a Set to prevent duplicate deal codes
● Allow sorting deals by discount using Comparator
● Use Generics to work with other promotion types: cashback, referral bonus, etc.
*/

package com.day02.dealtracker;

public class DealTrackerApp {
    public static void main(String[] args) {
        DealTracker<Deal> tracker = new DealTracker<>();

        // sample file path
        String dealsFile = "samplefiles/deals.txt";

        try {
            tracker.loadDeals(dealsFile);
            tracker.showActiveDeals();
            tracker.showDealCodes();

        } catch (InvalidDealException e) {
            System.out.println("Deal validation error: " + e.getMessage());
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}