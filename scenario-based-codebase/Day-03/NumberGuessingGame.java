/* 7. The Number Guessing Game 🎲
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
● Use do-while loop.
● Give hints like "Too high" or "Too low".
● Count attempts and exit after 5 wrong tries.*/

import java.util.Scanner;

public class NumberGuessingGame{
    public static void main(String args[]){
	
	    Scanner input = new Scanner(System.in);
		
		// Generate number between 1 and 100
		int number = (int)(Math.random()*100)+1;
		
		int guess ;
		int count = 0, totalAttempt = 5;
		
		System.out.println("Welcome to the Game!");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("You have only 5 attempts.\n");
		
		// do-while loop
		do{
		    System.out.println("Enter a number");
			guess = input.nextInt();
			count ++;
		    
			if(number < guess){
			    System.out.println("------------------------");
			    System.out.println("Too high");
				System.out.println("------------------------");
			}
			else if(number > guess) {
			    System.out.println("------------------------");
			    System.out.println("Too Low");
				System.out.println("------------------------");
			}
			else{
			    System.out.println("------------------------------------------------------------------------------");
			    System.out.println("Congratulations ! You won ... You guessed the right number in attempts: "
				+count);
				System.out.println("------------------------------------------------------------------------------");
				break;
			}
			
			if (count < totalAttempt) {
            System.out.println("Please! Try Again...");
            }
			
		    if(count == totalAttempt){
	        // exit statement
		    System.out.println("Game Over ! Unable to guess the number... You used all 5 attempts");
            System.out.println("The correct number was: " + number);
		   }
		}
        
        while(count < totalAttempt);		
		
        input.close();		
	
	}

}