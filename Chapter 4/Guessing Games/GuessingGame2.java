/*
	Sam Valenzuela
	GuessingGame2.java
	10-30-18
	Guess the number in the specified range a user enters
 */

import java.util.Random;
import java.util.Scanner;

public class GuessingGame2 {
	public static void main(String args[]){
		Scanner vUI = new Scanner(System.in);
		Random vGen = new Random();

		int iUpperRange, iRand, iGuess, iTries = 1;
		String sReplay;

		System.out.println("Enter the upper limit of the range (lower limit is 1)");
		iUpperRange = vUI.nextInt();
		System.out.println("\nYou are now guessing on the interval 1 to " + iUpperRange);

		iRand = vGen.nextInt(iUpperRange) + 1;
		while(true){
            System.out.println("Guess a number.");
            iGuess = vUI.nextInt();
            if(iGuess == iRand){
                System.out.println("You guessed correctly!");
                System.out.println("It took you " + iTries + " tries.");
                break;
            }
            else if(iGuess < iRand){
                System.out.println("Higher.\n");
                iTries++;
            }
            else if(iGuess > iRand){
                System.out.println("Lower.\n");
                iTries++;
            }
		}
	}
}


