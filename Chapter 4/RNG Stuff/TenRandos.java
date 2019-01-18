/*	Sam Valenzuela
	TenRandos.java
	10-24-18
	Generate 10 random numbers from 1-3
*/

import java.util.Scanner;
import java.util.Random;

public class TenRandos{
	public static void main(String args[]){
		Random vGen = new Random();
		int iNum;
		int i1, i2, i3;
		i1 = i2 = i3 = 0;

		for(int i=1; i<=10; i++){
			iNum = vGen.nextInt(3) + 1;
			System.out.println(i + ") " + iNum);
			if(iNum == 1){
				i1++;
			}else if(iNum == 2){
				i2++;
			}else if(iNum == 3){
				i3++;
			}
		}
		System.out.println();
		System.out.println("1 was generated " + i1 + " times.");
		System.out.println("2 was generated " + i2 + " times.");
		System.out.println("3 was generated " + i3 + " times.");
	}
}