/*
Name: Sam Valenzuela
Date: 9-27-18
Filename: PaintTheRoom.java
Purpose: Calculate gallons and cost of paint to paint a room
*/

import java.util.*;

public class PaintTheRoom{
	public static void main(String[] args){
		Scanner vUI = new Scanner(System.in);

		double dLength, dWidth, dHeight, dSqFt, dPrice;
		int iGallon = 0;

		System.out.println("Enter room length:");
		dLength = vUI.nextDouble();
		System.out.println();

		System.out.println("Enter room width:");
		dWidth = vUI.nextDouble();
		System.out.println();

		System.out.println("Enter room height:");
		dHeight = vUI.nextDouble();
		System.out.println();

		dSqFt = (dLength * dHeight * 2) + (dWidth * dHeight * 2);

		if (dSqFt % 150 > 0){
			iGallon = (int)(dSqFt / 150) + 1;
		}else{
			iGallon = (int)(dSqFt / 150);
		}

		dPrice = iGallon * 20;



		System.out.println("Your room is " + dSqFt + " sqaure feet.");
		System.out.println();
		System.out.println(iGallon + " gallon(s) of paint are required.");
		System.out.println();
		System.out.println("It will cost: $" + dPrice);
		System.out.println();

	}
}