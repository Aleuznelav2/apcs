/*
 * Sam Valenzuela
 * 11-9-18
 * Sort1.java
 * Sort 2 numbers
 */

import java.util.*;

public class Sort1{
	public static void main(String args[]){
		Scanner vUI = new Scanner(System.in);

		int iScore1, iScore2, iSorted1 = 0, iSorted2 = 0;

		System.out.println("Enter score 1:");
		iScore1 = vUI.nextInt();

		System.out.println("\nEnter score 2:");
		iScore2 = vUI.nextInt();

		if(iScore1 <= iScore2){
			iSorted1 = iScore1;
			iSorted2 = iScore2;
		}
		if(iScore1 > iScore2){
			iSorted1 = iScore2;
			iSorted2 = iScore1;
		}

		System.out.println("\nThis is score 1: " + iScore1);
		System.out.println("This is score 2: " + iScore2);
		System.out.println("This is sorted 1: " + iSorted1);
		System.out.println("This is sorted 2: " + iSorted2);
	}
}
