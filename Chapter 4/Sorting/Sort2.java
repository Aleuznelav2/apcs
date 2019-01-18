/*
 * Sam Valenzuela
 * 11-9-18
 * Sort2.java
 * Sort 3 numbers
 */

import java.util.*;

public class Sort2{
	public static void main(String args[]){
		Scanner vUI = new Scanner(System.in);

		int iScore1, iScore2, iScore3, iTemp;

		System.out.println("Enter score 1:");
		iScore1 = vUI.nextInt();

		System.out.println("\nEnter score 2:");
		iScore2 = vUI.nextInt();

		System.out.println("\nEnter score 3:");
		iScore3 = vUI.nextInt();

		for(int i=0;i<5;i++){
			if(iScore1 > iScore2){
				iTemp = iScore1;
				iScore1 = iScore2;
				iScore2 = iTemp;
			}
			if(iScore2 > iScore3){
				iTemp = iScore2;
				iScore2 = iScore3;
				iScore3 = iTemp;
			}
		}
		System.out.println("\n1st: " + iScore1);
		System.out.println("2nd: " + iScore2);
		System.out.println("3rd: " + iScore3);
	}
}

