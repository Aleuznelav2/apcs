/*
 Programmer: Sam Valenzuela
 Filename: ComputerGuess.java
 Date: October 26 2018
 Purpose: Guess the random double from 0-1 correctly
 */

 import java.util.*;

 public class ComputerGuess{
	 public static void main(String args[]){
		Random vGen = new Random();
		Scanner vUI = new Scanner(System.in);


		double dInput = 0.5155128400666472;
		int i = 0;

		while(i==0){
			double dRandDoub = vGen.nextDouble();
			if(dRandDoub == dInput){
				System.out.println(dRandDoub);
				System.out.println("YES");
				break;
			}else{
				System.out.println(dRandDoub);
			}
		}
	 }
 }
