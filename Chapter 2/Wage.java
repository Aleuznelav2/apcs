/*
Name: Sam Valenzuela
Date: 9-24-18
Filename: Wage.java
Purpose: Calculate net pay
*/

import java.util.Scanner;

public class Wage{
	public static void main(String[] args){
		Scanner vReader = new Scanner(System.in);

		double dHours, dWage, dTax, dGross, dNet, dFinalTax;

		System.out.println("Enter hours worked:");
		dHours = vReader.nextDouble();

		System.out.println("Enter hourly wage:");
		dWage = vReader.nextDouble();

		System.out.println("Enter tax rate (as a decimal):");
		dTax = vReader.nextDouble();

		dGross = dHours * dWage;
		dFinalTax = dGross * dTax;
		dNet = dGross - dFinalTax;

		System.out.println("Gross pay: $" + dGross);
		System.out.println("Tax: $" + dTax);
		System.out.println("Net pay: $" + dNet);


		vReader.close();
	}
}