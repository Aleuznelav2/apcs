/* Sam Valenzuela
 * 1-16-19
 * Project10d2.java
 * Stuff with averages
 */

 import java.util.Scanner;
 public class Project10d2{
	 public static void main(String args[]){
		 Scanner vUI = new Scanner(System.in);
		 double input, average;
		 double numberList[] = new double[10];

		 for(int i=0;i<numberList.length;i++){
			 System.out.print("Enter a number:  ");
			 input = vUI.nextDouble();
			 numberList[i] = input;
		 }

		 average = averageCalc(numberList);
		 System.out.println("The average is " + average);
		 for(double greater: numberList){
			 if(greater > average)
			 	System.out.println(greater + " is greater than the average.");
		 }
	 }

	 public static double averageCalc(double x[]){
		 double total = 0, avg;
		 for(int i=0;i<x.length;i++){
			 total += x[i];
		 }
		 return avg = total / x.length;
	 }
 }