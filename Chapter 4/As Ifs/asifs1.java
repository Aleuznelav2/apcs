/*
 Programmer: Sam Valenzuela
 Filename: asifs1.java
 Date: October 26 2018
 Purpose: As-ifs 1 - determine if number is odd or even
 */

 import java.util.*;

 public class asifs1{
	 public static void main(String args[]){
		 Scanner vUI = new Scanner(System.in);

		 int iInput, iDivide;

		 System.out.println("Enter an integer");
		 iInput = vUI.nextInt();

		 iDivide = iInput % 2;

		 if(iDivide == 0){
			 System.out.println("Even");
		 }else{
			 System.out.println("Odd");
		 }
	 }
 }
