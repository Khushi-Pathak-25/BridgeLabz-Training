import java.util.Scanner;

public class MostFrequentCharacter{

    // create method to find the most frequent character
	public static char findFrequentCharacter(String str){
	    int length = str.length();
		int frequencyArr[] = new int [256];
		char mostFrequentChar=' ';
		for(int i = 0 ; i< length ; i++){
		    char ch = str.charAt(i);
			frequencyArr[ch]++;
		    if(frequencyArr[ch]>frequencyArr[mostFrequentChar]){
			    mostFrequentChar=ch;
			}    
		}
		return mostFrequentChar;
	}
	// main method 
	public static void main(String args[]){
	    Scanner input = new Scanner(System.in);
	    System.out.print("\nEnter String : ");
		String str = input.nextLine();
		// method calling
		char result = findFrequentCharacter(str);
		System.out.println("The most frequent character is "+result);
		
		input.close();
	}
}