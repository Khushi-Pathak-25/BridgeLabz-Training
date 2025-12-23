import java.util.Scanner;

public class CompareSubstring {
	
	public static String substr(String str, int startIndex, int lastIndex) {
		//Temp string
		String temp = "";
		
		for(int i = startIndex; i < lastIndex; i++) {
			temp += str.charAt(i);
		}
		return temp;
	}
	
	public static boolean compareTwoStrings (String s1, String s2) {
		
		//if length of strings not equal
		if(s1.length() != s2.length()){
			return false;
		}
		
		//Check each character in both strings
		for(int i = 0; i< s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}
		//all are equal
		return true;
	}
	
	public static void main (String args []) {
	
		//Create Scanner class object.
		Scanner input = new Scanner (System.in);
		
		//Take input of String from user.
		System.out.print("Enter String : ");
		String str = input.nextLine();
		
		System.out.print("Enter starting index : ");
		int startIndex = input.nextInt();
		System.out.print("Enter ending index : ");
		int lastIndex = input.nextInt();
		
		// Substring using charAt()
		String charAtSubstring = substr(str, startIndex, lastIndex);
		
		// Substring using built-in method
		String builtInSubstring = str.substring(startIndex, lastIndex);
		
		boolean compareResult = compareTwoStrings(charAtSubstring, builtInSubstring);
		
		//Display results.
		System.out.println("Substring using charAt(): " + charAtSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);

        if (compareResult) {
            System.out.println("Both substrings are Same");
        } 
		else {
            System.out.println("Both substrings are Different");
        }
	    input.close();	
	 	
	}
	
}