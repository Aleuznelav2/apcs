/*
Name: Sam Valenzuela
Date: 10-3-18
Filename: Base2.java
Purpose: Convert a base 10 number to base 2 and back
*/

import java.util.Scanner;

public class Base2{
	public static void main(String args[]){
		Scanner vUI = new Scanner(System.in);

		int iChoice, iBase10, iBaseKeep, i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11;
		String sLeading;
		sLeading = "";

		System.out.println("Type '1' to convert to binary, type '2' to convert from binary.");
		iChoice = vUI.nextInt();

		if(iChoice == 1){
			System.out.println("Enter a base 10 number:");
			iBase10 = vUI.nextInt();
			iBaseKeep = iBase10;

			vUI.nextLine();
			System.out.println("Do you care about leading 0's? (Y/N)");
			sLeading = vUI.nextLine();

			i1 = iBase10 / 1024;
			//System.out.println(i1);
			iBase10 = iBase10 - (i1 * 1024);

			i2 = iBase10 / 512;
			//System.out.println(i2);
			iBase10 = iBase10 - (i2 * 512);

			i3 = iBase10 / 256;
			//System.out.println(i3);
			iBase10 = iBase10 - (i3 * 256);

			i4 = iBase10 / 128;
			//System.out.println(i4);
			iBase10 = iBase10 - (i4 * 128);

			i5 = iBase10 / 64;
			//System.out.println(i5);
			iBase10 = iBase10 - (i5 * 64);

			i6 = iBase10 / 32;
			//System.out.println(i6);
			iBase10 = iBase10 - (i6 * 32);

			i7 = iBase10 / 16;
			//System.out.println(i7);
			iBase10 = iBase10 - (i7 * 16);

			i8 = iBase10 / 8;
			//System.out.println(i8);
			iBase10 = iBase10 - (i8 * 8);

			i9 = iBase10 / 4;
			//System.out.println(i9);
			iBase10 = iBase10 - (i9 * 4);

			i10 = iBase10 / 2;
			//System.out.println(i10);
			iBase10 = iBase10 - (i10 * 2);

			i11 = iBase10 / 1;
			//System.out.println(i11);
			iBase10 = iBase10 - (i11 * 1);

			if(sLeading.equals("Y") || sLeading.equals("y")){
				if(iBaseKeep == 1){
					System.out.println("" + i11);
				}
				if(iBaseKeep >= 2 && iBaseKeep <= 3){
					System.out.println("" + i10 + i11);
				}
				if(iBaseKeep >= 4 && iBaseKeep <= 7){
					System.out.println("" + i9 + i10 + i11);
				}
				if(iBaseKeep >= 8 && iBaseKeep <= 15){
					System.out.println("" + i8 + i9 + i10 + i11);
				}
				if(iBaseKeep >= 16 && iBaseKeep <= 31){
					System.out.println("" + i7 + i8 + i9 + i10 + i11);
				}
				if(iBaseKeep >= 32 && iBaseKeep <= 63){
					System.out.println("" + i6 + i7 + i8 + i9 + i10 + i11);
				}
				if(iBaseKeep >= 64 && iBaseKeep <= 127){
					System.out.println("" + i5 + i6 + i7 + i8 + i9 + i10 + i11);
				}
				if(iBaseKeep >= 128 && iBaseKeep <= 255){
					System.out.println("" + i4 + i5 + i6 + i7 + i8 + i9 + i10 + i11);
				}
				if(iBaseKeep >= 256 && iBaseKeep <= 511){
					System.out.println("" + i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10 + i11);
				}
				if(iBaseKeep >= 512 && iBaseKeep <= 1023){
					System.out.println("" + i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10 + i11);
				}
				if(iBaseKeep == 1024){
					System.out.println("" + i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10 + i11);
				}
			}
			if(sLeading.equals("N") || sLeading.equals("n")){
				System.out.println("" + i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10 + i11);
			}
		}
		int iBinary;
		if(iChoice == 2){
			System.out.println("Enter a binary number:");
			iBinary = vUI.nextInt();

			i1 = iBinary % 10;
			//System.out.println(i1);
			iBinary = iBinary / 10;

			i2 = iBinary % 10;
			//System.out.println(i2);
			iBinary = iBinary / 10;

			i3 = iBinary % 10;
			//System.out.println(i3);
			iBinary = iBinary / 10;

			i4 = iBinary % 10;
			//System.out.println(i4);
			iBinary = iBinary / 10;

			i5 = iBinary % 10;
			//System.out.println(i5);
			iBinary = iBinary / 10;

			i6 = iBinary % 10;
			//System.out.println(i6);
			iBinary = iBinary / 10;

			i7 = iBinary % 10;
			//System.out.println(i7);
			iBinary = iBinary / 10;

			i8 = iBinary % 10;
			//System.out.println(i8);
			iBinary = iBinary / 10;

			i9 = iBinary % 10;
			//System.out.println(i9);
			iBinary = iBinary / 10;

			i10 = iBinary % 10;
			//System.out.println(i10);
			iBinary = iBinary / 10;

			i11 = iBinary % 10;
			//System.out.println(i11);
			iBinary = iBinary / 10;

			i1 = i1 * 1;
			i2 = i2 * 2;
			i3 = i3 * 4;
			i4 = i4 * 8;
			i5 = i5 * 16;
			i6 = i6 * 32;
			i7 = i7 * 64;
			i8 = i8 * 128;
			i9 = i9 * 256;
			i10 = i10 * 512;
			i11 = i11 * 1024;

			System.out.println(i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10 + i11);
		}
	}
}