import java.util.Scanner;

public class ToggleCaseOfCharacters{
    
	// create method to toggle the case of each character
	public static String toggleCase(String str){
		String output = "";
	    for(int i=0 ;i<str.length(); i++){
		    char ch = str.charAt(i);
		    if( ch >= 'a' && ch <= 'z'){
			    ch = (char)(ch-' ');
				
			}
			else if( ch >= 'A' && ch <= 'Z'){
			    ch = (char)(ch+' ');
			}
 
            output+=ch;			
		}
		return output;
	}

    // main method
	public static void main(String args[]){
	    Scanner input = new Scanner(System.in);
		System.out.print("\nEnter String : ");
		String str = input.nextLine();
		// method calling
	    String result = toggleCase(str);
		System.out.println(result);
		input.close();
	}
}
