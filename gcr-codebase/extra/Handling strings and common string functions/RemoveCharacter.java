import java.util.Scanner;

public class RemoveCharacter{
    
	// create method to remove all occurrences of a specific character
	public static String removeCharacter(String str , char removeCh){
		String output = "";
	    for(int i=0 ;i<str.length(); i++){
		    char ch = str.charAt(i);
		    if( ch != removeCh){
			    output+= ch;		
			}
		}
        return output;		
	}
	

    // main method
	public static void main(String args[]){
	
	    Scanner input = new Scanner(System.in);
		System.out.print("\nEnter String: ");
		String str = input.nextLine();
		System.out.print("\nEnter Character to Remove:");
		char removeCh = input.next().charAt(0);
		
		// method calling
	    String result = removeCharacter(str, removeCh);
		System.out.println(result);
		
		input.close();
	}
}
