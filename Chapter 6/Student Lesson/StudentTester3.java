/*
 * Sam Valenzuela
 * 11-26-18
 * StudentTester3.java
 * Running the Student class but slightly different again
 */

 public class StudentTester3{
	 public static void main (String args[]){
		 Student s1 = new Student("Ron Burgundy",65,55,75);
		 Student s2 = new Student("Veronica Corningstone",95,75,85);
		 Student s3 = new Student(s1);
		 s3.setName("Brick");
		 System.out.println(s1 + "\n\n" + s2 + "\n\n" + s3);


	 }
 }
