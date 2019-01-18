/*	Sam Valenzuela
	Club2.java
	10-24-18
	Create an age check program for TTDPC but with BOOLEANS
*/

import java.util.Scanner;

public class Club2{
	public static void main(String args[]){
		Scanner vUI = new Scanner(System.in);

		int iAge, i21 = 21, iSyntax = 0;
		//String sMom;
		boolean bMom;

		System.out.println("How old are you?");
		iAge = vUI.nextInt();
		System.out.println();
		i21 = 21 - iAge;

		if(iAge > 1 && iAge < 18){
			System.out.println("Come back on Tuesday for under 18 night and free wings!");
			System.out.println("You will become 21 years old in " + i21 + " years!");
			System.out.println();
		}else if(iAge >= 18 && iAge < 21){
			vUI.nextLine();
			System.out.println("Is your mom present? (true/false)");

			bMom = vUI.nextBoolean();
			System.out.println();
			if(bMom){
				System.out.println("You can go anywhere but make sure she keeps an eye on you.");
				System.out.println("You will become 21 years old in " + i21 + " years!");
				System.out.println();
				iSyntax++;
			}else{
				System.out.println("You are welcome in the under 21 ballroom.");
				System.out.println("You will become 21 years old in " + i21 + " years!");
				System.out.println();
				iSyntax++;
			}
		}else if(iAge >= 21){
			System.out.println("Welcome to the club!");
			System.out.println();
		}else{
			System.out.println("Your age isn't valid, multi-dimensional beings are not welcome.");
			System.out.println();
		}
	}
}
