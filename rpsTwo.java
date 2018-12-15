/*
 * Mark Mauro 2018
 * Courtesy of @amhokies on youtube
 */

import java.util.Scanner;
import java.util.Random;

public class rpsTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Random random = new Random();		// random number generator
		
		
		Scanner s = new Scanner(System.in);	// scanner object for user input
		
		/*
		 * 	0 = rock
		 *  1 = paper
		 *  2 = scissors
		 * 
		 */
		
		int userChoice, computerChoice;
		
		System.out.println("Pick 0 for rock, 1 for paper, and 2 for scissors");
		userChoice = s.nextInt();
		
		
	
		if (userChoice < 0 || userChoice > 2)		//check if userChoice is between the values of 0, 1, or 2
		{
			System.out.println("Invalid");
			System.exit(0); 
		}
		
		
		computerChoice = random.nextInt(3);	//generate a random number for the computer
		
		
	
		if (userChoice == computerChoice)	// determining a tie
		{
			if (userChoice == 0)
			{
				System.out.println("Tie! You both picked rock");
			}
			else if (userChoice == 1)
			{
				System.out.println("Tie! You both picked paper");
			}
			else if (userChoice == 2)
			{
				System.out.println("Tie! You both picked scissors");
			}
			
		}
		
	
		
		if (userChoice == 0)		// if the user picks a rock
		{
			if (computerChoice == 1)
			{
				System.out.println("You chose rock: The computer chose paper. You win!");
			}
			else 
			{
				System.out.println("You chose rock: Computer chose scissors. You win!");
			}
			
		}
		
		else if (userChoice == 1)
			
		{
			if(computerChoice == 0)
			{
				System.out.println("You chose paper: The computer chose rock. You win!");
			}
			else
			{
				System.out.println("You chose paper: The computer chose scissors. You lose!");
			}
			
		}
		
		else 
			
		{
			if (computerChoice == 0)
			{
				System.out.println("You chose scissors: The computer chose rock. You lose!");
			}
			else
			{
				System.out.println("You chose scissors: The computer chose paper. You win!");
			}
			
		}
			 
	}
	
}
