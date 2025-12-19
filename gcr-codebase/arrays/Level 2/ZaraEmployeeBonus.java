import java.util.Scanner;

public class ZaraEmployeeBonus{

    public static void main(String[] args){

        //Creating Scanner class object
        Scanner input = new Scanner(System.in);

        //Arrays to store salary and years of service
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];

        //Arrays to store bonus and new salary
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        //Variable to store totals bonus
        double totalBonus = 0.0;
        //Variable to store totals old salary
        double totalOldSalary = 0.0;
        //Variable to store total new salary
        double totalNewSalary = 0.0;

        //Taking Input
        for (int i=0; i < 10; i++) {
            System.out.println("\nEnter details of Employee " + (i + 1));

            System.out.print("Enter Salary: ");
            salary[i] = input.nextDouble();

            System.out.print("Enter Years of Service: ");
            yearsOfService[i] = input.nextDouble();

            //checking salary and year of service
            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input !! Please enter again.");
                // decrement index
                i--;
            }
        }
        //Calculating Bonus and New Salary
        for (int i = 0; i < 10; i++) {

            // Check years of service and calculate bonus
            if (yearsOfService[i] > 5) {
                //5% bonus
                bonus[i] = salary[i] * 0.05;
            }
            else {
                // 2% bonus
                bonus[i] = salary[i] * 0.02;
            }
            // Calculate new salary
            newSalary[i] = salary[i] + bonus[i];

            // Calculate totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        //Printing final Output
        System.out.println("\nZara Company Report");
        System.out.println("Total Old Salary of all Employees : " + totalOldSalary);
        System.out.println("Total Bonus Paid by Zara          : " + totalBonus);
        System.out.println("Total New Salary after Bonus      : " + totalNewSalary);

        input.close();
    }
}