/* Sam Valenzuela
 * 11-19-18
 * GetComparison.java
 * Return student with the higher average
 */

 public class GetComparison{
	public static void main(String args[]){
		Student s1 = new Student("Abel",65,75,85);
		Student s2 = new Student("Cain",75,85,80);
		Student s3 = new Student("Bartholomew",100,95,90);

		System.out.println(s1.getComparison(s2	));
		System.out.println();
		System.out.println(s1.getComparisonv2(s2));
	}
}