import java.util.Scanner;

public class SubStringOccurrences{
    
	// create method to count substring occurance
    public static int countSubString(String str, String subStr){
	    int subStrLength = subStr.length();
		int count =0;
	    for(int i=0; i<str.length() ; i++){
		    boolean isSubString = true;	
		    for(int j=0; j<subStrLength; j++){
			    if((i+j) >=str.length()){
			        isSubString = false;
					break;
			    }
				if(str.charAt(i+j)!= subStr.charAt(j)){
				    isSubString =false;
					break;
				}
		    }
			if(isSubString){
			    count++;
			}
        }
		return count;
    }
	
	// main method 
	public static void main(String [] args){
	    Scanner input = new Scanner(System.in);
		System.out.print("\nEnter String : ");
		String str =input.nextLine();
		System.out.print("\nEnter Sub-String : ");
		String subStr = input.nextLine();
	    // calling method
		int result =  countSubString(str,subStr);
		System.out.println("substring occurance = "+result);
		
		input.close();
	}

}