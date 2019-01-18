/* Sam Valenzuela
 * 12-7-18
 * Project7d3.java
 * Input a number grade and output a letter grade
 */

 import java.util.*;

 public class Project7d3{
	 public static void main(String args[]){
		 Scanner vUI = new Scanner(System.in);

		 int iGrade;
		 System.out.println("Enter a numeric grade:");
		 iGrade = vUI.nextInt();

		 if(iGrade >= 96 && iGrade <= 100){
			 System.out.println("A+");
		 }else if(iGrade >= 92 && iGrade <= 95){
			 System.out.println("A");
		 }else if(iGrade >= 90 && iGrade <= 91){
			 System.out.println("A-");
		 }else if(iGrade >= 86 && iGrade <= 89){
			 System.out.println("B+");
		 }else if(iGrade >= 82 && iGrade <= 85){
			 System.out.println("B");
		 }else if(iGrade >= 80 && iGrade <= 81){
			 System.out.println("B-");
		 }else if(iGrade >= 76 && iGrade <= 79){
			 System.out.println("C+");
		 }else if(iGrade >= 72 && iGrade <= 75){
			 System.out.println("C");
		 }else if(iGrade >= 70 && iGrade <= 71){
			 System.out.println("C-");
		 }
	 }
 }