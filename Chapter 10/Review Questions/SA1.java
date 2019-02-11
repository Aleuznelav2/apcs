/* Sam Valenzuela
 * 1-17-19
 * SA1.java
 * Short answer #1
 */

 public class SA1{
	 public static void main(String args[]){
		 int[] a = {34,23,67,89,12};

		 System.out.println(a[1]);			//23
		 System.out.println(a[a.length-1]);	//89
		 System.out.println(a[2] + a[3]);	//156
		 System.out.println(a[2+3]);		//Array out of bounds exception
	 }
 }