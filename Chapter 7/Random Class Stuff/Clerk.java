/* Sam Valenzuela
 * 12-10-18
 * Clerk.java
 * Learn comparisson operators
 */


import java.util.Scanner;

public class Clerk{
	public static void main(String args[]){
		Scanner vUI = new Scanner(System.in);

		int score1, score2;

		System.out.println("Enter the first test score:");
		score1 = vUI.nextInt();

		System.out.println("Enter the second test score:");
		score2 = vUI.nextInt();

		boolean bothHigh, atLeastOneHigh, atLeastOneModerate, noLow;

		bothHigh = score1 >= 90 && score2 >= 90;
		atLeastOneHigh = score1 >= 90 || score2 >= 90;
		atLeastOneModerate = score1 >= 70 || score2 >= 70;
		noLow = !(score1 < 50 || score2 < 50);

		if(bothHigh){
			System.out.println("Qualified to be a manager");
		}
		if(atLeastOneHigh && noLow){
			System.out.println("Qualified to be a supervisor");
		}
		if(atLeastOneModerate && noLow){
			System.out.println("Qualified to be a clerk");
		}

		/*
		if(score1 >= 90 && score2 >= 90){
			System.out.println("Qualified to be a manager");
		}
		if(score1 >= 90 || score2 >= 90){
			System.out.println("Qualified to be a supervisor");
		}
		if((score1 >= 70 || score2 >= 70) && !(score1 < 50 || score2 < 50)){
			System.out.println("Qualified to be a clerk");
		}


		*/
	}
}