import java.util.*;
class CelsiustoFahrenheit{
 public static void main(String[]args){
  Scanner s=new Scanner(System.in);
  System.out.print("Enter the temperature in Celsius: ");
  double celsius=s.nextDouble();
  double fahrenheit= (celsius * 9/5) + 32;
  System.out.print("Temperature in Fahrenheit: "+fahrenheit);
}
 }