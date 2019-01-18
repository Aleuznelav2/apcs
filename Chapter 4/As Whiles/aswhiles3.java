/*
	Sam Valenzuela
	aswhiles3.java
	10-29-18
	Guess the random double from 0-1 correctly
 */

 import java.util.*;

 public class aswhiles3{
	 public static void main(String args[]){
		Random vGen = new Random();

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
