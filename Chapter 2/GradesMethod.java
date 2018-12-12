/*
Name: Sam Valenzuela
Date: 9-19-18
Filename: GradesMethod.java
Purpose: idk
*/

import java.util.Scanner;

public class GradesMethod{
	public static void main(String args[]){
		Scanner vReader = new Scanner(System.in);

		double a,b,c,d;
		a = b = c = d = 5.5;

		System.out.println(getAverage(a,b,c,d));

	}

	public static double getAverage(double g1, double g2, double g3, double g4){
		double dAvg = 0;
		dAvg = (g1+g2+g3+g4)/4.0;
		return dAvg;

	}
}



