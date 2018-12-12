/*
Name: Sam Valenzuela
Date: 9-18-18
Filename: GradeCalc.java
Purpose: Average 5 grades
*/

import java.util.Scanner;


public class GradeCalc{
	public static void main(String args[]){
		Scanner vUI = new Scanner(System.in);

		double dGrade1, dGrade2, dGrade3, dGrade4, dGrade5, dGradeAvg;
		String sLetter = "";
		int i = 1;
		dGrade1 = dGrade2 = dGrade3 = dGrade4 = dGrade5 = dGradeAvg = 0;

		System.out.println("Welcome to the grade calculator!");

		while(i<=5){
			System.out.println();
			System.out.println("Enter grade " + i);
			if(i==1){
				dGrade1 = vUI.nextDouble();
			}else if(i==2){
				dGrade2 = vUI.nextDouble();
			}
			else if(i==3){
				dGrade3 = vUI.nextDouble();
			}
			else if(i==4){
				dGrade4 = vUI.nextDouble();
			}
			else if(i==5){
				dGrade5 = vUI.nextDouble();
			}
			i++;
		}

		dGradeAvg = (dGrade1 + dGrade2 + dGrade3 + dGrade4 + dGrade5) / 5;

		if(dGradeAvg >= 97){
			sLetter = "A+";
		}
		else if(dGradeAvg >= 93 && dGradeAvg < 97){
			sLetter = "A";
		}
		else if(dGradeAvg >= 90 && dGradeAvg < 93){
			sLetter = "A-";
		}
		else if(dGradeAvg >= 87 && dGradeAvg < 90){
			sLetter = "B+";
		}
		else if(dGradeAvg >= 83 && dGradeAvg < 87){
			sLetter = "B";
		}
		else if(dGradeAvg >= 80 && dGradeAvg < 83){
			sLetter = "B-";
		}
		else if(dGradeAvg >= 77 && dGradeAvg < 80){
			sLetter = "C+";
		}
		else if(dGradeAvg >= 73 && dGradeAvg < 77){
			sLetter = "C";
		}
		else if(dGradeAvg >= 70 && dGradeAvg < 73){
			sLetter = "C-";
		}
		else if(dGradeAvg >= 67 && dGradeAvg < 70){
			sLetter = "D+";
		}
		else if(dGradeAvg >= 63 && dGradeAvg < 67){
			sLetter = "D";
		}
		else if(dGradeAvg >= 60 && dGradeAvg < 63){
			sLetter = "D-";
		}
		else if(dGradeAvg >= 0 && dGradeAvg < 60){
			sLetter = "F";
		}

		System.out.println();
		System.out.println("Your final grade is: " + dGradeAvg + ", or a(n) " + sLetter + ".");
		System.out.println();
	}
}


/*
Not a loop version

System.out.println();
System.out.println("Enter your first grade:");
dGrade1 = vUI.nextDouble();

System.out.println();
System.out.println("Enter your second grade:");
dGrade2 = vUI.nextDouble();

System.out.println();
System.out.println("Enter your third grade:");
dGrade3 = vUI.nextDouble();

System.out.println();
System.out.println("Enter your fourth grade:");
dGrade4 = vUI.nextDouble();

System.out.println();
System.out.println("Enter your fifth grade:");
dGrade5 = vUI.nextDouble();
*/