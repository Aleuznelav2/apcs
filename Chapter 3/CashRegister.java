/*
Name: Sam Valenzuela
Date: 10-2-18
Filename: CashRegister.java
Purpose: Display change with bill and coin amounts, but with SUBTRACTION
*/
import java.util.Scanner;

public class CashRegister{
	public static void main(String args[]){
		Scanner vUI = new Scanner(System.in);

		double dPurchase, dChange, dTender, dDollar, dQuarter, dDime, dNickel, dPenny, dChangeRounded;

		//dPurchase = 18.12;
		//dTender = 20;


		System.out.println("Enter total purhcase:");
		dPurchase = vUI.nextDouble();
		System.out.println();

		System.out.println("Enter amount tendered:");
		dTender = vUI.nextDouble();
		System.out.println();


		dChange = dTender - dPurchase;
		dChange = (dChange * 100) / 100;
		dChange = dChange + 0.000000000000001;


		System.out.println("Your change is: $" + dChange);
		System.out.println();
		dDollar = (int)dChange / 1;
		System.out.println("Dollars: " + dDollar);
		System.out.println();

		dChange = dChange - dDollar;
		dQuarter = (int)(dChange / 0.25);
		//System.out.println(dChange + " change left after dollars");
		System.out.println("Quarters: " + dQuarter);
		System.out.println();

		dChange = dChange - (dQuarter * 0.25);
		dDime = (int)(dChange / 0.1);
		//System.out.println(dChange + " change left after quarters");
		System.out.println("Dimes: " + dDime);
		System.out.println();

		dChange = dChange - (dDime * 0.1);
		dNickel = (int)(dChange / 0.05);
		//System.out.println(dChange + " change left after dimes");
		System.out.println("Nickels: " + dNickel);
		System.out.println();

		dChange = dChange - (dNickel * 0.05);
		dPenny = (int)(dChange / 0.01);
		//System.out.println(dChange + " change left after nickels");
		System.out.println("Pennies: " + dPenny);
		System.out.println();
	}
}