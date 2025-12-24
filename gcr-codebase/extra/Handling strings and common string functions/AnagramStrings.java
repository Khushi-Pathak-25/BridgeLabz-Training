import java.util.Scanner;

public class AnagramStrings{
    
	// create method checks if the two strings are anagrams
	// (i.e., whether they contain the same characters in any order)
	public static boolean checkAnagram(String str1, String str2){
	    int length1 = str1.length(); 
        int length2 = str2.length();
        if(length1 != length2){
		    return false;
		}
        else{
		    int frequency []= new int[256];
		    for(int i = 0 ; i< length1 ;i++){
			    char ch1 = str1.charAt(i);
				char ch2 = str2.charAt(i);
				frequency[ch1]++;
				frequency[ch2]--;
			}
			for(int i : frequency){
			    if(i != 0){
				   return false;
				}
			}
			return true;
		}		
	}
	
	// main method
    public static void main(String args[]){
	    Scanner input = new Scanner(System.in);
		System.out.print("\nEnter String 1 : ");
		String str1 = input.nextLine();
		System.out.print("\nEnter String 2 : ");
		String str2 = input.nextLine();
		
		// method calling
		boolean result = checkAnagram(str1,str2);
		if(result){
		    System.out.println("\nStrings are anagrams");
		}
		else{
		    System.out.println("\nStrings are not anagrams");
		}
		input.close();
	}	
}	