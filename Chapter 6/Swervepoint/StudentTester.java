/*
 * Sam Valenzuela
 * 11-19-18
 * StudentTester.java
 * Running the Student class
 */
import java.util.*;

 public class StudentTester{
	public static void main(String args[]){
		/*--------------------*\
		|        Default       |
		\*--------------------*/
		Student s1 = new Student("No",1,2,3);
		System.out.println(s1.getName());
		System.out.println(s1.getScore(1));
		System.out.println(s1.getScore(2));
		System.out.println(s1.getScore(3));
	}
}
