/* Sam Valenzuela
 * 11-19-18
 * Student.java
 * The class file for Student
 */

public class Student{
	private String sName;
	private int iTest1, iTest2, iTest3;
	//instance variables = inherent values

	//Constructor method - initializes variables
	//Default constructor - no parameters

	public Student(){
		sName = "";
		iTest1 = 0;
		iTest2 = 0;
		iTest3 = 0;
	}

	//Additional constructor - makes it easier to instantiate a new student
	public Student(String nme, int t1, int t2, int t3){
		sName = nme;
		iTest1 = t1;
		iTest2 = t2;
		iTest3 = t3;
	}

	public Student(Student x){
		sName = x.sName;
		iTest1 = x.iTest1;
		iTest2 = x.iTest2;
		iTest3 = x.iTest3;
	}


	public void setName(String nme){
		sName = nme;
	}

	public String getName(){
		return sName;
	}

	public void setScore(int i, int scr){
		if(i==1)iTest1 = scr;
		else if(i==2)iTest2 = scr;
		else iTest3 = scr;
	}

	//Can't use all if statements, it might not reach return
	public int getScore(int i){
		if(i==1)return iTest1;
		else if(i==2) return iTest2;
		else return iTest3;
	}

	public int getAverage(){
		int avg;
		avg = (iTest1 + iTest2 + iTest3) / 3;
		return avg;
	}

	public int getHighScore(){
		int iHS, temp1, temp2;
		temp1 = Math.max(iTest1,iTest2);
		temp2 = Math.max(iTest2,iTest3);
		iHS = Math.max(temp1,temp2);
		return iHS;
	}
	public String toString(){
		 String str;
		 str = 	"Name: " + sName +
				"\nTest 1: " + iTest1 +
				"\nTest 2: " + iTest2 +
				"\nTest 3: " + iTest3 +
				"\nAverage: " + getAverage();
		 return str;
	}

	public String getComparison(Student s){
		String name = s.sName;
		int t1 = s.iTest1;
		int t2 = s.iTest2;
		int t3 = s.iTest3;
		int avg;
		String yes,no;

		avg = (t1 + t2 + t3) / 3;

		if(avg > getAverage()){
			yes = name + " has a higher average than " + getName() + ", with an average of " + avg + " compared to " + getAverage();
			return yes;
		}else{
			no = getName() + " has a higher average than " + name + ", with an average of " + getAverage() + " compared to " + avg;
			return no;
		}
	}

	public Student getComparisonv2(Student s){
		if (getAverage() > s.getAverage()){
			return this;
		}
			else{return s;}
	}

}






















/*
import java.util.*;

public class Student{
	public static void main(String args[]){
		Scanner vUI = new Scanner(System.in);

		String sName = "";
		int iGrade, iGradeTotal = 0;

		System.out.println("What's your name?");
		sName = vUI.nextLine();

		for(int i=1; i<=3; i++){
			System.out.println("\nEnter grade " + i + ":");
			iGrade = vUI.nextInt();
			iGradeTotal += iGrade;
		}

		iGrade = iGradeTotal / 3;
		System.out.println("\nYour average grade is: " + iGrade);
	}
}
*/