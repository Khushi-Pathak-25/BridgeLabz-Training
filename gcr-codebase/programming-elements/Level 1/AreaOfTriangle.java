import java.util.Scanner;
class AreaOfTriangle{
    public static void main(String[]args){
    // Scanner for user input
    Scanner input=new Scanner(System.in);
    System.out.println("Enter base in cm");
    double base=input.nextDouble();
    System.out.println("Enter height in cm");
    double height=input.nextDouble();
    
    // Calculate area in square centimeters
    double  areaCm= 0.5 * base * height;
    // Convert area to square inches (1 square inch = 6.4516 square cm)
    double areaInches = areaCm / 6.4516;
     
    System.out.println("Area of a triangle in square centimeters is "+areaCm+" and inches is "+areaInches);
    input.close();
    }
}