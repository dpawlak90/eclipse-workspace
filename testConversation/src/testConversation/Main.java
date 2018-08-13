package testConversation;

import java.util.Scanner;

public class Main {
	
	static Scanner sc= new Scanner(System.in);	
	 static boolean afb = true;
	 static int bet = 0;
	 static int amountOfMoney = 100;

	public static void main(String[] args) {
		
	askForBid();
		
	}
	
	
	public static void askForBid() {
		
		
		
		
		do {
			
			System.out.println("You're total is: $100");
		System.out.println("place your bet:");
		
		//String Text = sc.nextLine();
		bet = sc.nextInt();
		
		if(bet > 0 && bet < amountOfMoney) {
	
		System.out.println( "You're bet is " + bet + " is that correct? Y or N");
		
		String answer = sc.next();
		
		try {
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		if(answer.equalsIgnoreCase("Y")) {
			
			playGame();
			
			afb = false;
		}else if(answer.equalsIgnoreCase("n")) {
			
			System.out.println( "lets try again.");
			
		}
		
		
	}else if(amountOfMoney < bet) {
		System.out.println("you dont have enough. Try again.");
	
		
	}
	
	
}while(afb);
	}
	
	
	public static void playGame() {
		System.out.println( "lets play the game! the bet is: " + bet);
	}
	
	
	
}