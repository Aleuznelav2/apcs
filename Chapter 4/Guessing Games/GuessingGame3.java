/*
	Sam Valenzuela
	GuessingGame3.java
	10-31-18
	Have the computer guess the number
 */

import java.util.*;

public class GuessingGame3 {
    public static void main(String args[]) {
        Scanner vUI = new Scanner(System.in);

        int iNum, iGuess = 50, iLowerRange = 0, iUpperRange = 101, iRange, iTries = 1;
        String sPos;

        System.out.println("Enter a number for the computer to guess from 1 to 100.");
        iNum = vUI.nextInt();
		vUI.nextLine();
		while(true){
			System.out.println("\nThe computer guesses... " + iGuess + ".");
			if(iGuess == iNum){
				System.out.println("\n*******************************\n");
				System.out.println("The computer got it in " + iTries + " tries. \n");
				System.out.println("*******************************\n");
				break;
			}
			System.out.println("Higher or lower?");

			while(true){
				sPos = vUI.nextLine();
				sPos = sPos.toLowerCase();
				if(sPos.equals("higher")){
					iLowerRange = iGuess;
					iRange = iUpperRange - iGuess;
					iGuess = iGuess + iRange / 2;
					iTries++;
					break;
				}
				else if(sPos.equals("lower")){
					iUpperRange = iGuess;
					iRange = iGuess - iLowerRange;
					iGuess = iGuess - iRange / 2;
					iTries++;
					break;
				}
				else{
					System.out.println("Invalid input.");
				}
			}
		}
    }
}