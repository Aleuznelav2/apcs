/*
 Programmer: Sam Valenzuela
 Filename: SimpleRNG.java
 Date: October 26 2018
 Purpose: A simple number guessing game
 */

import java.util.Random;
import java.util.Scanner;

public class SimpleRNG {
	public static void main(String args[]){
		Scanner vUI = new Scanner(System.in);
		Random vGen = new Random();

		int iGuess, iRNum;

		System.out.println("Guess a number between 1 through 10.");
		iGuess = vUI.nextInt();

		iRNum = vGen.nextInt(10)+1;

		if(iGuess == iRNum){
			System.out.println("Correct!");
		}else{
			System.out.println("Incorrect, the number is " + iRNum);
		}
	}
}