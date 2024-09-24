/**
@author Talani Malwandla Mlangeni
@version Java Development task 2
*/

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing{
	
	public static void main(String [] args){
		
		int max = 5;//maximum number of guesses
		int range =100;
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		boolean playAgain = true;
		String choice;
		int rounds = 1;
		int score =0;
		
		System.out.println("\nHello I've generated a random between 1 and "+range+".\nCan you you guess it in "+max+" tries?\n");
		try{
			while (playAgain){
				int number = 1 + rand.nextInt(range);
				System.out.println("Round "+rounds);
				for(int tries = 1;tries <= max; tries++){
					System.out.print("\nEnter your guess: ");
					int guess = input.nextInt();
					input.nextLine();
					if((max - tries )== 0){
						System.out.println("ahahaha, You lose ;)");
						break;
					}
					if (guess == number){
						if (tries == 1){
							System.out.println("\nYou got it in "+tries+" try.");
						}
						else{
							System.out.println("\nYou got it in "+tries+" tries");
						}
						break;
					}
					else if (guess < number){
						System.out.println("\nOops. Too low, you have "+ (max - tries)+" tries left");
					}
					else if (guess > number) {
						System.out.println("\nOops. Too high, you have "+ (max - tries)+" tries left");
						
					}else{
						throw new Exception("That was an invalid attempt.");
					}
					
					
					
				
				}
				//score += max -rounds;
				System.out.println("Do you want to play again? (y/n)");
				choice = input.nextLine();
				if (choice.equalsIgnoreCase("y")){
					rounds++;
				}else if(choice.equalsIgnoreCase("n")){
					System.out.println("Goodbye. Thanks for playing Guess the number");
					//System.out.println("Your score is: "+((score/(rounds*max))*100));//converting the score into a percentage
					playAgain = false;
					
				}
				else{
					throw new Exception("That was an invalid attempt.\nGoodBye. Thanks for playing Guess the Number");
					
					
				}
			
			}
		}
		catch(Exception e){
			System.out.println("That was an invalid attempt.\nGoodBye. Thanks for playing Guess the Number");
		}
	}
	
	
	
	
}