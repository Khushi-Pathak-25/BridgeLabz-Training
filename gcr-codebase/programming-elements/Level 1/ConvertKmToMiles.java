import java.util.Scanner;
class ConvertKmToMiles{
    public static void main(String[]args){
    double km;
    //Creating Scanner Class Object to take user input 
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the distance value in km");
    km=input.nextDouble();
    
    //Calculate km into miles
    double miles= km / 1.6;
    
    System.out.println("The total miles is "+miles+" mile for the given "+km+" km");
    }
}
    
    