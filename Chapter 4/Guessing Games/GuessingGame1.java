/*
 Programmer: Sam Valenzuela
 Filename: GuessingGame1.java
 Date: October 26 2018
 Purpose: Guess the number between 1-100
 */

import java.util.Random;
import java.util.Scanner;

public class GuessingGame1 {
	public static void main(String args[]){
		Random rand = new Random();
		Scanner vUI = new Scanner(System.in);

		int iRandNum, iTries = 1;
		double dNum;
		String sChoice;
		iRandNum = rand.nextInt(100)+1;

		while(true){
			System.out.println("Guess the number between 1 and 100.");
			dNum = vUI.nextDouble();

			if(dNum < 1 || dNum > 100){
				System.out.println("Invalid input.");
			}
			else if(dNum == iRandNum){
				System.out.println("You guessed correctly!");
				System.out.println("It took you " + iTries + " tries.");
				vUI.nextLine();
				System.out.println("\nWould you like to play again? (Y/N)");
				sChoice = vUI.nextLine();
				if(sChoice.equals("Y") || sChoice.equals("y")){
					iRandNum = rand.nextInt(100)+1;
					iTries = 1;
					System.out.println();
				}else{
					break;
				}
			}else if(dNum > iRandNum){
				System.out.println("Lower.\n");
				iTries++;

			}else{
				System.out.println("Higher.\n");
				iTries++;
			}
		}
	}
}
