/*	Sam Valenzuela
	aswhiles1.java
	10-29-18
	Print numbers 1 - 10, even and odd
*/

import java.util.Scanner;
import java.util.Random;

public class aswhiles1{
	public static void main(String args[]){
		Random vGen = new Random();

		System.out.println("All numbers from 1 to 10");
		for(int i=1;i<=10;i++){
			System.out.print(i + " ");
		}

		System.out.println("\n\nAll even numbers from 1 to 10");
		for(int i=1;i<=10;i++){
			if(i % 2 == 0){
				System.out.print(i + " ");
			}
		}

		System.out.println("\n\nAll odd numbers from 1 to 10");
		for(int i=1;i<=10;i++){
			if(i % 2 == 1){
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}