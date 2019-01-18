/*
	Sam Valenzuela
	aswhiles4.java
	10-29-18
	Use a loop to average 5 grades
 */

 import java.util.*;

 public class aswhiles4{
	 public static void main(String args[]){
		 Scanner vUI = new Scanner(System.in);

		 double dGrade = 0, dGradeEntered;
		 int iCounter = 1;

		 while(iCounter <= 5){
			System.out.println("Enter grade " + iCounter);
			dGradeEntered = vUI.nextDouble();
			dGrade += dGradeEntered;
			System.out.println();
			iCounter++;
		 }

		 dGrade /= 5;
		 System.out.println("Final grade: " + dGrade);

	 }
 }