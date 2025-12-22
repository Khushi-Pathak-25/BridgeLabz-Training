import java.util.Scanner;
public class ZaraBonusCalculator {

    // By random function generate randomsalary and random years of service
    // (Column 0--> Salary) (Column 1--> Years of Service)

    public static int[][] generateEmployeeData(int employees) {

        // Store details of employees in array 
        int[][] salaryData= new int[employees][2];

        for (int i = 0; i < employees; i++) {
            // for salary
            salaryData[i][0] = (int)(Math.random()*900000)+100000;
	        // for year of service
            salaryData[i][1] = (int)(Math.random()*10)+1;       
        }
        return salaryData;
    }
    // Method to calculate new salary and bonus
    // Column 0--> Old Salary, Column 1-->Bonus, Column 2--> New Salary
    public static double [][] calculateNewSalaryAndBonus(int salaryData[][]){
		
		double [][] newSalaryBonus = new double[salaryData.length][2];
		
		for(int i=0 ; i<salaryData.length; i++){
			if(salaryData[i][1]>5){
				// for bonus 
				newSalaryBonus[i][0] = 0.5* salaryData[i][0];
			}
			if(salaryData[i][1]<5){
				newSalaryBonus[i][0] = 0.2* salaryData[i][0];
			}
		}
		for(int i=0;i<salaryData.length;i++){
			// for new salary
			newSalaryBonus[i][1]= salaryData[i][0]+ newSalaryBonus[i][0];
		}
		return newSalaryBonus;
	}
	// display output
	public static void display(int salaryData[][],double newSalaryBonus[][]){
		double totalOldSalary=0;
		double totalNewSalary=0;
		double totalBonus=0;
		for(int i =0;i<salaryData.length;i++){
			totalOldSalary+= salaryData[i][0];
		}
		for(int i=0;i<newSalaryBonus.length;i++){
			totalBonus+= newSalaryBonus[i][0];
			totalNewSalary+=newSalaryBonus[i][1];
		}
		System.out.println("-------------------------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t\n","oldSalary","year","newSalary","bonus");
		System.out.println("-------------------------------------------------------");
		for(int i =0;i<salaryData.length;i++){
		System.out.printf("%d\t\t%d\t%f\t%f\t\n",salaryData[i][0],salaryData[i][1],newSalaryBonus[i][1],
		newSalaryBonus[i][0]);
		}
	}
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		// Enter number of employees
		System.out.print("\nEnter no. of Employees ");
		int employees=input.nextInt();	
		int data[][]=generateEmployeeData(employees);
		double result[][]=calculateNewSalaryAndBonus(data);
        display(data,result);
		input.close();
	}
}