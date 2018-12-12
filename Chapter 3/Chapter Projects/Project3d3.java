/*
Programmer: Sam Valenzuela
Filename: Project3d3.java
Date: 10/15/18
Purpose: Find kinetic energy and momentum given mass and velocity
*/

import java.util.Scanner;

public class Project3d3{
	public static void main(String args[]){
		Scanner vUI = new Scanner(System.in);

		double dMass, dVelocity, dMomentum, dKE;

		System.out.println("Input mass (in kg):");
		dMass = vUI.nextDouble();

		System.out.println("Input velocity (in m/s)");
		dVelocity = vUI.nextDouble();

		dMomentum = dMass * dVelocity;
		dKE = dMass * dVelocity * dVelocity / 2;

		System.out.println("The momentum is " + dMomentum + " kg*m/s");
		System.out.println("The kinetic energy is " + dKE + " J");
	}
}
