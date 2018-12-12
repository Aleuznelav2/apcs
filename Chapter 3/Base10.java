/*
Name: Sam Valenzuela
Date: 10-3-18
Filename: Base10.java
Purpose: Convert a base 10 numbers to display the places
*/

import java.util.Scanner;

public class Base10{
	public static void main(String args[]){
		Scanner vUI = new Scanner(System.in);

		double dInput;
		int iTenThou, iThou, iHun, iTen, iOne, iTenth, iHundth, iInput;

		//dInput = 73501.54;
		System.out.println("Enter a number");
		dInput = vUI.nextDouble();
		System.out.println();

		iInput = (int)((dInput * 100) + 0.5);

		iTenThou = iInput / 1000000;
		System.out.println("Ten thousands: " + iTenThou);
		iInput = iInput % 1000000;
		//System.out.println(iInput);

		iThou = iInput / 100000;
		System.out.println("Thousands: " + iThou);
		iInput = iInput % 100000;
		//System.out.println(iInput);

		iHun = iInput / 10000;
		System.out.println("Hundreds: " + iHun);
		iInput = iInput % 10000;
		//System.out.println(iInput);

		iTen = iInput / 1000;
		System.out.println("Tens: " + iTen);
		iInput = iInput % 1000;
		//System.out.println(iInput);

		iOne = iInput / 100;
		System.out.println("Ones: " + iOne);
		iInput = iInput % 100;
		//System.out.println(iInput);

		iTenth = iInput / 10;
		System.out.println("Tenths: " + iTenth);
		iInput = iInput % 10;
		//System.out.println(iInput);

		iHundth = iInput;
		System.out.println("Hundreths: " + iHundth);
		//System.out.println(iInput);
	}
}