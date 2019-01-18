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
		Student s1 = new Student();

		s1.setName("Lazaan Ya");
		System.out.println(s1.getName());

		s1.setScore(1,90);
		s1.setScore(2,80);
		s1.setScore(3,100);
		System.out.println(s1.getScore(1));
		System.out.println(s1.getScore(2));
		System.out.println(s1.getScore(3));

		/*--------------------*\
		|    Additional fed    |
		\*--------------------*/

		Student s2 = new Student("Bark Zuckerbork",70,80,90);

		System.out.println("\nName: " + s2.getName());
		System.out.println("Score 1: " + s2.getScore(1) + "\nScore 2: " + s2.getScore(2) + "\nScore 3: " + s2.getScore(3));
		System.out.println("Average: " + s2.getAverage());
		System.out.println("High score: " + s2.getHighScore());

		/*--------------------*\
		|    Additional + UI   |
		\*--------------------*/

		Scanner vUI = new Scanner(System.in);

		String a;
		int b,c,d;

		System.out.println("\nEnter student name:");
		a = vUI.nextLine();
		System.out.println("\nEnter score 1:");
		b = vUI.nextInt();
		System.out.println("\nEnter score 2:");
		c = vUI.nextInt();
		System.out.println("\nEnter score 3:");
		d = vUI.nextInt();

		Student s3 = new Student(a,b,c,d);

		System.out.println("\nName: " + s3.getName());
		System.out.println("Score 1: " + s3.getScore(1) + "\nScore 2: " + s3.getScore(2) + "\nScore 3: " + s3.getScore(3));
		System.out.println("Average: " + s3.getAverage());
		System.out.println("High score: " + s3.getHighScore());
	}
}
