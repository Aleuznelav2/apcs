/* Sam Valenzuela
 * 12-5-18
 * FractionTester.java
 * Return a fraction given numerator and denominator
 */
 import java.util.*;

 public class FractionTester{
	 public static void main(String args[]){
		 Scanner vUI = new Scanner(System.in);

		 int iNum, iDen, iNum2, iDen2;

		 System.out.println("Enter the numerator:");
		 iNum = vUI.nextInt();

		 System.out.println("\nEnter the denominator:");
		 iDen = vUI.nextInt();

		 System.out.println("\nEnter the numerator of the second fraction:");
		 iNum2 = vUI.nextInt();

		 System.out.println("\nEnter the denominator of the second fraction:");
		 iDen2 = vUI.nextInt();

		 vUI.nextLine();

		 Fraction f1 = new Fraction(iNum,iDen);
		 Fraction f2 = new Fraction(iNum2,iDen2);

		 String sChoice;
		 System.out.println("\nWould you like to add, subtract, multiply, or divide? ( A,S,M,D)");
		 sChoice = vUI.nextLine();
		 if(sChoice.equals("A") || sChoice.equals("a")){
			 System.out.println("\n" + f1.add(f2));
		 }
		 else if(sChoice.equals("S") || sChoice.equals("s")){
		 	 System.out.println("\n" + f1.subtract(f2));
		 }
		 else if(sChoice.equals("M") || sChoice.equals("m")){
		 	 System.out.println("\n" + f1.multiply(f2));
		 }
		 else if(sChoice.equals("D") || sChoice.equals("d")){
		 	 System.out.println("\n" + f1.divide(f2));
		 }

		 System.out.println("\n\n\n\n\n");


		 /*----------------------------*\
	     |  Operators with 1/4 and 1/2  |
		 \*----------------------------*/
		 Fraction OneQuarter = new Fraction(1,4);
		 Fraction OneHalf = new Fraction(1,2);

		 System.out.println(OneQuarter + "\n" + OneHalf);

		 System.out.println("\nAdding these 2 fractions equals: " + OneQuarter.add(OneHalf));
		 System.out.println("\nSubtracting these 2 fractions equals: " + OneQuarter.subtract(OneHalf));
		 System.out.println("\nMultiplying these 2 fractions equals: " + OneQuarter.multiply(OneHalf));
		 System.out.println("\nDividing these 2 fractions equals: " + OneQuarter.divide(OneHalf));

	 }
 }