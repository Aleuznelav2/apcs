/*
 Programmer: Sam Valenzuela
 Filename: JavaBucks.java
 Date: October 29 2018
 Purpose:
 */

 import java.util.*;

 public class JavaBucks{
	 public static void main(String args[]){
		 Scanner vUI = new Scanner(System.in);
		 int iStandingStudents = 18, iJavaBucks = 9, iStudentX = 1, iJavaBucksPaid = 0;

		/*
		 while(iStandingStudents > 0 && iJavaBucks > 0){
			 System.out.println("Student " + iStudentX + ", get a Java Buck");
			 iStandingStudents--;
			 iJavaBucks--;
			 iStudentX++;
			 iJavaBucksPaid++;
		 }
		 */

		boolean bJavaBucks = true;
		try{
			while(bJavaBucks == true){
				System.out.println("Student " + iStudentX + ", get a Java Buck");
				iStandingStudents--;
				iJavaBucks--;
				iStudentX++;
				System.out.println("\nAre there more Java Bucks on the table? (true/false)");
				bJavaBucks = vUI.nextBoolean();
				iJavaBucksPaid++;
				System.out.println("\nPaid " + iJavaBucksPaid + " Java Bucks\n");
			 }
		 }
		 catch(Exception e){
		 			System.out.println("\nError code 1: Expected value 'true' or 'false'.\n");
		}
	 }
 }