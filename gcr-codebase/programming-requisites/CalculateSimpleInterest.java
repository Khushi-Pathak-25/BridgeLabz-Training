import java.util.Scanner;

class CalculateSimpleInterest {
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
		
	System.out.print("Enter the value of Principal : ");
	double principal = s.nextDouble();
		
	System.out.print("Enter the value of Rate (in %) : ");
	double rate = s.nextDouble();
		
	System.out.print("Enter the value of Time (in Years) : ");
	double time = s.nextDouble();
	s.close();		

	System.out.println("The simple interest is : " + ((principal * rate * time) / 100));
    }
}