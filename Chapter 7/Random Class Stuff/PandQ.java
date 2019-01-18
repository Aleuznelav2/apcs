/* Sam Valenzuela
 * 12-12-18
 * PandQ.java
 * Weird conditional operator stuff
 */

 public class PandQ{
	 public static void main(String args[]){
		 boolean P = true, Q = false;

		 System.out.println(!((P || Q) && (P && Q)));
		 //Outputs true
	 }
 }