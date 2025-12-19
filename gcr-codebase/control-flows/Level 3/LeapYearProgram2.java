import java.util.Scanner;

public class LeapYearProgram2{

    public static void main(String[]args){

        //Create Scanner class object
        Scanner input=new Scanner(System.in);
        
        //Take year input
        System.out.print("\nEnter year : ");
        int year = input.nextInt();
        
        //Check year corresponding to Gregorian calendar
        if(year < 1582){
            System.out.println("Not a valid year corresponding to Gregorian calendar");
        }

        //Single if condition using && and ||

        else if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("The Year is a Leap Year");
        }

        else {
            System.out.println("The Year is not a Leap Year");
        }        


        input.close();
    }
}