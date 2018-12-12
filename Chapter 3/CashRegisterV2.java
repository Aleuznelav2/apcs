/*
Name: Sam Valenzuela
Date: 10-2-18
Filename: CashRegisterV2.java
Purpose: Display change with bill and coin amounts, but with MODULUS
*/
import java.util.Scanner;

public class CashRegisterV2{
	public static void main(String args[]){
		Scanner vUI = new Scanner(System.in);

		double dPurchase, dChange, dTender;
		int iChange, iDl, iQ, iDm, iN, iP;

		//dPurchase = 18.12;
		//dTender = 20;


		System.out.println("Enter total purhcase:");
		dPurchase = vUI.nextDouble();
		System.out.println();

		System.out.println("Enter amount tendered:");
		dTender = vUI.nextDouble();
		System.out.println();



		dChange = dTender - dPurchase;
		iChange = (int)((dChange * 100) + .5);
		//System.out.println(iChange);
		dChange = (double)iChange / 100;
		System.out.println("Your change is $" + dChange);

		iDl = iChange / 100;
		System.out.println("Dollars: " + iDl);
		iChange = iChange % 100;
		//System.out.println("Change left " + iChange);
		System.out.println();

		iQ = iChange / 25;
		System.out.println("Quarters: " + iQ);
		iChange = iChange % 25;
		//System.out.println("Change left " + iChange);
		System.out.println();

		iDm = iChange / 10;
		System.out.println("Dimes: " + iDm);
		iChange = iChange % 10;
		//System.out.println("Change left " + iChange);
		System.out.println();

		iN = iChange / 5;
		System.out.println("Nickels: " + iN);
		iChange = iChange % 5;
		//System.out.println("Change left " + iChange);
		System.out.println();

		iN = iChange / 1;
		System.out.println("Pennies: " + iN);
		iChange = iChange % 1;
		//System.out.println("Change left " + iChange);
		System.out.println();
	}
}