public class DayOfWeek {

    public static void main(String[] args) {

        // Taking Command line arguments
		// month
        int m = Integer.parseInt(args[0]);
		// day
        int d = Integer.parseInt(args[1]); 
		// year
        int y = Integer.parseInt(args[2]); 

        // Apply formulas
        int y0 = y - (14-m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12*((14-m)/12) - 2;
        int d0 = (d + x + (31*m0) / 12) % 7;

        // Printing result
        System.out.println("Day of the week = " + d0);
    }
}

