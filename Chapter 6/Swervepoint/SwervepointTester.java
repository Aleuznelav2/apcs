/*
 * Sam Valenzuela
 * 12-5-18
 * SwervepointTester.java
 * y
 */
 import java.util.*;
 import java.io.*;

 public class SwervepointTester{
	 public static void main(String args[]){
		 Scanner vUI = new Scanner(System.in);

		 String a;
		 int b;
		 double c,d;

		 System.out.println("What is your name?");
		 a = vUI.nextLine();

		 System.out.println("\nWhat type of rep are you? \n(1)Inside sales\n(2)Phone/web\n(3)Outside sales");
		 b = vUI.nextInt();

		 System.out.println("\nWhat was the cost of the goods?");
		 c = vUI.nextDouble();

		 System.out.println("\nHow much were the goods sold for?");
		 d = vUI.nextDouble();

		 Swervepoint s1 = new Swervepoint(a,b,c,d);

		 System.out.println(s1);
	 }
 }
