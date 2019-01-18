/*
 Programmer: Sam Valenzuela
 Filename: asifs4.java
 Date: October 29 2018
 Purpose: As-ifs 5 - swap 2 numbers without using a 3rd variable
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class asifs5 {
    public static void main(String args[]) {
        Scanner vUI = new Scanner(System.in);

        int a, b;
		try{
			System.out.println("Enter integer 1");
			a = vUI.nextInt();

			System.out.println("\nEnter interger 2");
			b = vUI.nextInt();

			a = a + b; //12 = 5 + 7
			b = a - b; //5 = 12 - 7
       		a = a - b; //7 = 12 - 5

       		System.out.println("\n" + a);
        	System.out.println(b);
		}
		catch(Exception e){
			System.out.println("\nError code 1: String entered instead of int.\n");
		}
    }
}
