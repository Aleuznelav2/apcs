/*
 Programmer: Sam Valenzuela
 Filename: asifs2.java
 Date: October 26 2018
 Purpose: As-ifs 2 - generate random integer from 1 thru 5
 */

 import java.util.*;

 public class asifs2jj{
	 public static void main(String args[]){
		 Random vGen = new Random();

		 int iRandInt = vGen.nextInt(5) + 1;

		 System.out.println(iRandInt);
	 }
 }
