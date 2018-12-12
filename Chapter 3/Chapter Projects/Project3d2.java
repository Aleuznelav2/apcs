/*
Programmer: Sam Valenzuela
Filename: Project3d2.java
Date: 10/15/18
Purpose: Find diameter, circumference, surface area, and volume of a sphere given radius
*/
import java.util.*;

public class Project3d2{
	public static void main(String args[]){
		Scanner vUI = new Scanner(System.in);

		double dRadius, dDiameter, dCircumference, dSA, dVolume;

		System.out.println("Enter the radius:");
		dRadius = vUI.nextDouble();

		dDiameter = dRadius*2;
		dCircumference = dDiameter * Math.PI;
		dCircumference = Math.round(dCircumference*100.00)/100.00;
		dSA = 4 * Math.PI * (dRadius * dRadius);
		dSA = Math.round(dSA*100.00)/100.00;
		dVolume = Math.PI * dRadius * dRadius * dRadius * 4 / 3;
		dVolume = Math.round(dVolume*100.00)/100.00;

		System.out.println("Diameter: " + dDiameter);
		System.out.println("Circumference: " + dCircumference);
		System.out.println("Surface area: " + dSA);
		System.out.println("Volume: " + dVolume);





	}
}
