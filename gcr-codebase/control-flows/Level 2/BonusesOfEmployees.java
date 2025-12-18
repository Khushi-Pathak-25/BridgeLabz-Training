import java.util.Scanner;

class BonusesOfEmployees{

    public static void main(String[]args){
     
        //Create Scanner class object
        Scanner input = new Scanner(System.in);
        
        //Take salary and year of service
        System.out.print("\nEnter salary of employee ");
        double salary = input.nextDouble();
        System.out.print("\nEnter years of service ");
        double year =  input.nextDouble();
          
        double bonus = 0.0;
        //Bonus of 5% on salary to employee whose year of service is more than 5 year
        if(year>5){
            bonus = salary * 5 / 100;
        }
        
        // Print bonus amount
        System.out.println("Bonus : "+bonus);

        input.close();
    }
}
        
        
        
        