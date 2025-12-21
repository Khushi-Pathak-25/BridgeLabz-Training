public class UnitConvertorProgram2{

    // Create method convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Create method convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Create method convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Create method convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Create method convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    // Create method main method for testing
    public static void main(String[] args) {

        System.out.println("10 yards in feet = " + convertYardsToFeet(10));
        System.out.println("10 feet in yards = " + convertFeetToYards(10));
        System.out.println("10 meters in inches = " + convertMetersToInches(10));
        System.out.println("10 inches in meters = " + convertInchesToMeters(10));
        System.out.println("10 inches in centimeters = " + convertInchesToCentimeters(10));
    }
}
