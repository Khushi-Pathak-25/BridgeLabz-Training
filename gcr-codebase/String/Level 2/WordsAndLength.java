import java.util.Scanner;

public class WordsAndLength{

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
	
        }
		 return i;
	}
	
	// Create method to split the text into word
	public static String[] splitTextIntoWord(String str){
		// find length of string 
	    int length = findLength(str);
		int wordCount = 0;
		
		// count word 
		for (int i = 0; i < length; i++) {
	      if (i == 0 && str.charAt(i) != ' ') {
                wordCount++;
            } 
			else if (str.charAt(i) != ' ' && str.charAt(i - 1) == ' '){
                wordCount++;
            }	
		}
		//  Store space indexes
        int indexOfSpace[] = new int[wordCount + 1];
            int k = 0;
            for(int i = 0; i < length; i++){
                if(str.charAt(i) == ' '){
                    indexOfSpace[k++] = i;
                }
            }
            indexOfSpace[k] = length; // last word end
		  
		// store words in array
		
        String storeWords[]=new String[wordCount];
        int start = 0;
        for(int i = 0; i < storeWords.length; i++){
            storeWords[i] = str.substring(start, indexOfSpace[i]);
            start = indexOfSpace[i] + 1;
        }
		
		return storeWords;
    }
	
	// create method which print word and its corresponding length. 
	//Use String built-in function String.valueOf() to generate the String value for the number
	
    public static String [][] storeWordAndLength(String storeWords[]){
	    String arr [][]=new String[storeWords.length][2];
		
		for(int i=0;i<arr.length ;i++){
		  arr[i][0] = storeWords[i];
		  arr[i][1] = String.valueOf(findLength(arr[i][0]));
		}
		
		return arr;
	}
	public static void main(String[]args){
	    Scanner input =new Scanner(System.in);
		System.out.print("Enter String : ");
		String s1 = input.nextLine().trim();
		String word[]= splitTextIntoWord(s1);
		String wordsAndLength[][]=storeWordAndLength(word);
		
		for(int i =0; i<wordsAndLength.length ;i++){
		    for(int j =0 ;j<2;j++){
			 System.out.print(wordsAndLength[i][j]+" ");
			}
			System.out.println();
		}
		input.close();
    }
}	