

package testMethods;

import java.util.Scanner;

public class GuessingGame{
	
	static Scanner sc = new Scanner(System.in);
	static boolean keepPlaying = true;
	
public static void main(String[] args) {
	
	while(keepPlaying) {
		
		System.out.println("Let's play a guessing game!");
		
		playARound();
	
	}

}

public static void playARound() {
	boolean validInput;
	int number, guess;
	String answer;
	
	//pick a random number 
	
	number = (int) (Math.random() * 10) + 1;
	//number = 1;
	
	System.out.println("\nI'm thinking of a number between 1 and 10.");
	
	//guess the number 
	System.out.println("\nwhat do you think it is? ");
	
	do {
		guess = sc.nextInt();
		validInput = true;
		
		if((guess < 1)|| guess > 10) {
			
			System.out.print("I said, between 1 and 10. Try again: ");
			validInput = false; 
		}
		
	}while(!validInput);
	
	//check the input 
	if (guess == number) {
		System.out.println("You're right!");
		}
		else {
			System.out.println("You're wrong! The number was " + number);
			}

	do {
		System.out.println("\nPlay again? (Y or N)");
		answer = sc.next();
		
		
		validInput = true;
		
		if (answer.equalsIgnoreCase("Y"));
		else if(answer.equalsIgnoreCase("N"))
				keepPlaying = false;
		else
			validInput = false;
	
	} while(!validInput);
	
	
	
}
	
}


