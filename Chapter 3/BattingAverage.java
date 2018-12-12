/*
Name: Sam Valenzuela
Date: 10-19-18
Filename: BattingAverage.java
Purpose: Calculate batting averages
*/

import java.util.*;

public class BattingAverage{
	public static void main(String args[]){
		Scanner vUI = new Scanner(System.in);

		int iBats, iHits, iBatAvg;
		String sName;

		System.out.println("Enter name of player:");
		sName = vUI.nextLine();

		System.out.println();
		System.out.println("Enter " + sName + "'s number of at bats:");
		iBats = vUI.nextInt();

		System.out.println();
		System.out.println("Enter " + sName + "'s number of hits:");
		iHits = vUI.nextInt();

		iBatAvg = (int)((((double)iHits / (double)iBats) * 1000) + 0.5);

		System.out.println();
		System.out.println(sName + "'s batting average is: y."  + iBatAvg);
	}
}