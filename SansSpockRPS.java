/* 
 * Filename: SansSpockRPS.java
 * Author: nanonite9
 * Date: October 6, 2017
 * Description: This program allows a user to play scissor-rock-paper with a computer.
 */

import java.util.Scanner;

public class SansSpockRPS {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int compWins = 0; // initializes the wins of the computer and user
		int userWins = 0;

		while (userWins == 0 && compWins == 0 || userWins != 2 && compWins != 2) { // allows user to play up to 2 wins

			int computer = (int)(Math.random() * 3); // Generates a random integer of 0, 1, 2 as computer choice

			System.out.print("Enter [0] for scissor, [1] for rock, [2] for paper: "); // Prompts user to enter 0, 1, or 2 representing scissor, rock and paper
			int user = scan.nextInt();
			
			switch (computer) { // takes computer input and displays their choice
				case 0: System.out.print("The computer is scissor. "); break;
				case 1: System.out.print("The computer is rock. "); break;
				case 2: System.out.print("The computer is paper. "); break;
				default: System.out.print("Invalid. Please try again. "); break;
			}
		
			switch (user) { // takes user input and displays their choice
				case 0: System.out.print("You are scissor"); break;
				case 1: System.out.print("You are rock"); break;
				case 2: System.out.print("You are paper"); break;
				default: System.out.print("Invalid. Please try again."); break;
			}

			if (computer == user) // displays if there is a draw
				System.out.println(" too. It is a draw");
			
			else {
				boolean win = (user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1); // displays wins loses of user under given circumstances
				
				if (win) { // result if user wins if above is True
					System.out.println(". You won");
					userWins++; // increments userWins
					
					if (userWins == 2) {
						System.out.println("End."); // lets user know game is over once userWins has reached 2
					}
				}
				
				else { // result if user loses
					System.out.println(". You lose");
					compWins++; // increments compWins
					
					if (compWins == 2) {
						System.out.println("End."); // lets user know game is over once compWins has reached 2
					}
				}
			}
		}
	}
}