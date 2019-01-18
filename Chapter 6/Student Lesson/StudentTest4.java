/*
 * Sam Valenzuela
 * 11-26-18
 * StudentTester4.java
 * Running the Student class but slightly different again and again
 */

 public class StudentTest4{
	 public static void main (String args[]){
		 Student s1 = new Student("Ron Burgundy",65,55,75);
		 Student s2 = new Student("Veronica Corningstone",95,75,85);

		 System.out.println(s1);
		 System.out.println(s2);

		 s1 = s2;

		 System.out.println(s1);
		 System.out.println(s2);

		 s1.setName("Ron");
		 System.out.println(s1);
		 System.out.println(s2);

	 }
 }