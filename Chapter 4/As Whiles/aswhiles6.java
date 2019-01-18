/*	Sam Valenzuela
	aswhiles6.java
	10-29-18
	Generate 1000 random numbers from 1-10
*/

import java.util.Scanner;
import java.util.Random;

public class aswhiles6{
	public static void main(String args[]){
		Random vGen = new Random();
		int iNum;
		int i1, i2, i3, i4, i5, i6, i7, i8, i9, i10;
		i1 = i2 = i3 = i4 = i5 = i6 = i7 = i8 = i9 = i10 = 0;

		for(int i=1; i<=1000; i++){
			iNum = vGen.nextInt(10) + 1;
			System.out.println(i + ") " + iNum);
			if(iNum == 1){
				i1++;
			}else if(iNum == 2){
				i2++;
			}else if(iNum == 3){
				i3++;
			}else if(iNum == 4){
				i4++;
			}else if(iNum == 5){
				i5++;
			}else if(iNum == 6){
				i6++;
			}else if(iNum == 7){
				i7++;
			}else if(iNum == 8){
				i8++;
			}else if(iNum == 9){
				i9++;
			}else if(iNum == 10){
				i10++;
			}
		}
		System.out.println("\n1 was generated " + i1 + " times.");
		System.out.println("2 was generated " + i2 + " times.");
		System.out.println("3 was generated " + i3 + " times.");
		System.out.println("4 was generated " + i4 + " times.");
		System.out.println("5 was generated " + i5 + " times.");
		System.out.println("6 was generated " + i6 + " times.");
		System.out.println("7 was generated " + i7 + " times.");
		System.out.println("8 was generated " + i8 + " times.");
		System.out.println("9 was generated " + i9 + " times.");
		System.out.println("10 was generated " + i10 + " times.\n");

	}
}