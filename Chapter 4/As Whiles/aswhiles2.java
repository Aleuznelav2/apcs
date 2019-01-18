/*	Sam Valenzuela
	aswhiles2.java
	10-29-18
	Print 10 random ints from 1-100
*/

import java.util.Random;

public class aswhiles2{
	public static void main(String args[]){
		Random vGen = new Random();

		for(int i=1;i<=10;i++){
			System.out.println(vGen.nextInt(100)+1);
		}
	}
}