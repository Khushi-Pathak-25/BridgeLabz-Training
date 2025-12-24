import java.util.Scanner;

public class CompareStringsLexicographically{

    // create method to compare two strings lexicographically (dictionary order )
    public static String [] compareStrings (String str1, String str2){
	    String result [] =new String [2];
	    int i = 0;
		int length1 = str1.length();
		int length2 = str2.length();
	    while(i < length1 && i< length2){
		    if(str1.charAt(i)<str2.charAt(i)){
			    result[0] = str1;
				result[1] = str2;
				return result;
			}
			else if (str1.charAt(i)>str2.charAt(i)){
			    result[0] = str2;
				result[1] = str1; 
				return result;
				
			}
			else{
				i++;
			}
		}
		if(length1>length2){
			result[0] = str1;
		    result[1] = str2;
		
		}
		else {
			 result[0] = str2;
			 result[1] = str1; 
		
		}
		
		return result;
	}
    
    // main method
    public static void main(String args[]){
	    Scanner input = new Scanner(System.in);
		System.out.print("\nEnter String 1 : ");
		String str1 = input.nextLine();
		System.out.print("\nEnter String 2 : ");
		String str2 = input.nextLine();
		
		// method calling
		String output [] = compareStrings (str1, str2);
		for(int i =0 ; i< output.length ; i++){
		    System.out.print(output[i]+" ");
		}
		input.close();
	}	
}