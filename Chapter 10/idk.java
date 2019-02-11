/* Sam Valenzuela
 * 1-8-19
 * idk.java
 * i really don't know
 */

public class idk{
	public static void main(String args[]){
		int bork[] = new int[10];
		int z = 0;
		int sum = 0;

		for(int i = 10; i <= bork.length * 10; i+=10){
			bork[z] = i;
			z++;
		}

		for(int j = 0; j < bork.length; j++){
			sum += bork[j];
		}

		int average = sum / bork.length;

		System.out.println("The sum is " + sum); System.out.println("The average is " + average);
	}
}