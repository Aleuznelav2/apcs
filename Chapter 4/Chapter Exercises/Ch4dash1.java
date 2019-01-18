/*
 * Sam Valenzuela
 * 11-15-18
 * Ch4dash1.java
 * Divide 2 numbers and give quotient + remainder
 */

 import java.util.*;

 public class Ch4dash1{
	 public static void main(String args[]){
		 Scanner vUI = new Scanner(System.in);

		 int iNum1, iNum2, iQuotient, iRemainder;

		 System.out.println("This program will always divide the larger number by the smaller one.");
		 System.out.println("\nEnter first number:");
		 iNum1 = vUI.nextInt();

		 System.out.println("\nEnter second number:");
		 iNum2 = vUI.nextInt();

		 iQuotient = Math.max(iNum1,iNum2) / Math.min(iNum1,iNum2);
		 iRemainder = Math.max(iNum1,iNum2) % Math.min(iNum1,iNum2);

		 System.out.println("\nThe quotient is " + iQuotient + ", with a remainder of " + iRemainder);
	 }
 }