import java.util.Scanner;

public class LengthOfString{
	
    // Create method to find length of string
    public static int findLength(String str){
	    int i=0;
	    try{
	    while(true){
		  str.charAt(i);
		  i++;
		}
		}
		catch (IndexOutOfBoundsException e) {
		   return i;
        }
	}
	public static void main(String []args){
	    Scanner input = new Scanner(System.in);
		// Take input by user
		System.out.print("\nEnter String : ");
		String str = input.next().trim();
		int lenghthByBuiltIn = str.length();
		int lenghthByUserMethod = findLength(str);
		if(lenghthByBuiltIn==lenghthByUserMethod){
		    System.out.println("Length of "+ str +" "+lenghthByUserMethod);
		}
		input.close();
	}
}	