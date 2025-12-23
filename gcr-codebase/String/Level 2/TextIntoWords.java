import java.util.Scanner;

public class TextIntoWords{

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
	// compare two string
	public static boolean compareString(String str1[],String str2[]){
	    int str1Length = str1.length;
		int str2Length = str2.length;
		if(str1Length==str2Length){
		    for(int i=0; i<str1Length;i++){
			    if(!str1.equals(str2)){
			        return false;
			    }
			}
			return true;
		}
		return false;
	}
	// main method 
	public static void main(String[]args){
	    Scanner input =new Scanner(System.in);
		System.out.print("Enter String 1 : ");
		String s1 = input.nextLine().trim();
		System.out.print("Enter String 2 : ");
        String s2 =input.nextLine().trim();
        String str1[]= splitTextIntoWord(s1);
        String str2[]= splitTextIntoWord(s2);
		
		String words[] = splitTextIntoWord(s1);
        for(String word : words){
			System.out.print(word+" , ");
		}		
        System.out.println();
		
		if(compareString(str1,str2)){
		    for(int i=0 ; i< str1.length; i++){
			   System.out.print(str1[i]+" ");
			}
		}
		input.close();
	}		
	
}