/*
 * Sam Valenzuela
 * 11-26-18
 * StudentTester2.java
 * Running the Student class but slightly different
 */

 public class StudentTester2{
	public static void main (String args[]){
		Student s1 = new Student("Ron Burgundy",55,62,78);
		Student s2 = new Student("Veronica Corningstone",85,97,64);

		//Print name and score of student who has the highest test score
		int i1, i2;

		i1 = s1.getHighScore();
		i2 = s2.getHighScore();

		if(i1 > i2){
			System.out.println(s1.getName() + " has the highest test score with a score of " + i1);
		}else if(i2 > i1){
			System.out.println(s2.getName() + " has the highest test score with a score of " + i2);
		}
	}
 }


