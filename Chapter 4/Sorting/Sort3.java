/*
 * Sam Valenzuela
 * 11-9-18
 * Sort3.java
 * Sort 5 numbers
 */

import java.util.*;

public class Sort3{
	public static void main(String args[]){
		Scanner vUI = new Scanner(System.in);

		int iScore1, iScore2, iScore3, iScore4, iScore5, iTemp;

		System.out.print("Enter score 1:\n>");
		iScore1 = vUI.nextInt();

		System.out.print("\nEnter score 2:\n>");
		iScore2 = vUI.nextInt();

		System.out.print("\nEnter score 3:\n>");
		iScore3 = vUI.nextInt();

		System.out.print("\nEnter score 4:\n>");
		iScore4 = vUI.nextInt();

		System.out.print("\nEnter score 5:\n>");
		iScore5 = vUI.nextInt();

		for(int i=0;i<15;i++){
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
			if(iScore3 > iScore4){
				iTemp = iScore3;
				iScore3 = iScore4;
				iScore4 = iTemp;
			}
			if(iScore4 > iScore5){
				iTemp = iScore4;
				iScore4 = iScore5;
				iScore5 = iTemp;
			}
		}

		System.out.println("\n1st: " + iScore1);
		System.out.println("2nd: " + iScore2);
		System.out.println("3rd: " + iScore3);
		System.out.println("4th: " + iScore4);
		System.out.println("5th: " + iScore5);


	}
}

