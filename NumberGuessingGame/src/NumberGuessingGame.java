//Jesus Ochoa
//CS-112 Java
//A program that is a guessing game.

import java.util.Scanner;
public class NumberGuessingGame 
{
	public static void main(String[] args)
	{
		Scanner myScan = new Scanner(System.in);
		int CorrectAnswer = (int)Math.ceil(Math.random()*5);
		int NumberofGuesses = 5;
		int UserGuesses = 0;
		int UserChoice =0;
		System.out.println("Guess a number from 1 to 5. You have 5 tries.");
		
		while(NumberofGuesses > 0)
		{
			System.out.println("Please take a guess.");
			UserGuesses = myScan.nextInt();
			
			if(UserGuesses == CorrectAnswer)
			{
				System.out.println("You have guessed correctly. Do you want to quite or try again?");
				System.out.println("1 for quiting andd 2 for trying again:");
				UserChoice =myScan.nextInt();
				NumberofGuesses = 6;
			}
			
			
			else if(NumberofGuesses == 1)
			{
				System.out.println("You lost, the correct answer was " + CorrectAnswer);
			}
			
			else
			{
				System.out.println("No, try again");
			}
			NumberofGuesses --;
			
			if (UserChoice == 1)
			{
				System.out.printf("You chose to quit. Quiter. You guessed a total of " + UserGuesses +" times");
				break;
			}
		}
		
		
		
		
		
		
		
	}
	
	

}
