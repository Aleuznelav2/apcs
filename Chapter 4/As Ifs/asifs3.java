/*
 Programmer: Sam Valenzuela
 Filename: asifs3.java
 Date: October 26 2018
 Purpose: As-ifs 3 - generate random double from 1 thru 5
 */

 import java.util.*;

 public class asifs3{
	 public static void main(String args[]){
		 Random vGen = new Random();

		double dRandDoub = vGen.nextDouble() * 4 + 1;

		 System.out.println(dRandDoub);
	 }
 }
