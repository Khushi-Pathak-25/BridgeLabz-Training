import java.util.Scanner;

public class AnotherWord{

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
	
	// create replace method that replaces a given word with another word 
	public static String replaceWord(String storeWords[], String word, String anotherWord){
	    String result ="";
		if(storeWords[0].equals(word)){
		   result+=anotherWord;
		}
		else{
		    result+= storeWords[0];
		}
		for(int i =1 ; i< storeWords.length ;i++){
		    result+=" ";
		    if(storeWords[i].equals(word)){
		        result+=anotherWord;
		    }
		    else{
		        result+= storeWords[i];
		    }
		}
		return result;	
	}
	// main method 
	public static void main(String args[]){
	    Scanner input = new Scanner(System.in);
	    System.out.print("\nEnter String : ");
		String str = input.nextLine();
		System.out.print("\nEnter given word : ");
		String word = input.next();
		System.out.print("\nEnter another word : ");
		String anotherWord = input.next();
		
		// method calling
		String wordsArr[]=  splitTextIntoWord(str);
		String output = replaceWord(wordsArr, word, anotherWord);
		// Display output
		System.out.print(output);
		input.close();
	}
}	