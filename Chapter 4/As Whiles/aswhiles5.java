/*
	Sam Valenzuela
	aswhiles5.java
	10-29-18
	Use a loop to average how ever many grades the user enters
 */

 import java.util.*;

 public class aswhiles5{
	 public static void main(String args[]){
		 Scanner vUI = new Scanner(System.in);

		 double dGrade = 0, dGradeEntered;
		 int iCounter = 1, iGradeTotal;

		try{
			System.out.println("How many grades would you like to enter?");
			iGradeTotal = vUI.nextInt();
			if(iGradeTotal <= 0){
				System.out.println("\nError code 2: Expected value above 0.\n");
			}else{
				 while(iCounter <= iGradeTotal){

					System.out.println("Enter grade " + iCounter);
					dGradeEntered = vUI.nextDouble();
					if(dGradeEntered < 0 || dGradeEntered > 100){
						System.out.println("\nError code 3: Expected value in range 0-100.\n");
						break;
					}else{
						dGrade += dGradeEntered;
						System.out.println();
						iCounter++;
					}
				 }

				 dGrade /= iGradeTotal;
				 System.out.println("Final grade: " + dGrade);
				 vUI.close();
			 }
		 }
		 catch(Exception e){
			 System.out.println("\nError code 1: String entered instead of int.\n");
		 }
	 }
 }