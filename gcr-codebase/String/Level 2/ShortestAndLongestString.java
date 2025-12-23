import java.util.Scanner;

public class ShortestAndLongestString {

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
	
	// store word and its length
	public static String [][] storeWordAndLength(String storeWords[]){
	    String arr [][]=new String[storeWords.length][2];
		
		for(int i=0;i<arr.length ;i++){
		  arr[i][0] = storeWords[i];
		  arr[i][1] = String.valueOf(findLength(arr[i][0]));
		}
		
		return arr;
	}
	
	// find the shortest and longest string 
	public static String [] displayShortestAndLongest (String arr[][]){
	    String shortestLongest[] = new String [2];
		
		int shortest = Integer.MAX_VALUE;
		int longest = Integer.MIN_VALUE;
		
	    for(int i=0; i<arr.length ;i++){
			
		    if(Integer.parseInt(arr[i][1])<shortest){
			   shortest = Integer.parseInt(arr[i][1]);
               shortestLongest[0] =  arr[i][0];
			}
			
			if(Integer.parseInt(arr[i][1])>longest){
			   longest = Integer.parseInt(arr[i][1]);
			   shortestLongest[1] = arr[i][0];
			}
		}
		return shortestLongest;
	}
	public static void main(String[]args){
	    Scanner input =new Scanner(System.in);
		System.out.print("Enter String : ");
		String s1 = input.nextLine().trim();
		String word[]= splitTextIntoWord(s1);
		String wordsAndLength[][]=storeWordAndLength(word);
		String result[] =  displayShortestAndLongest (wordsAndLength);

	    System.out.println("Shortest : "+ result[0]);
		System.out.println("Longest : "+ result[1]);

		
		input.close();
    }
}	