public class UnitConvertor{

    // Create method Convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Create method Convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Create method Convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Create method Convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    // Create method main method for testing
    public static void main(String[] args) {
        
		// Display results
        System.out.println("10 km in miles = " + convertKmToMiles(10));
        System.out.println("10 miles in km = " + convertMilesToKm(10));
        System.out.println("10 meters in feet = " + convertMetersToFeet(10));
        System.out.println("10 feet in meters = " + convertFeetToMeters(10));
    }
}
