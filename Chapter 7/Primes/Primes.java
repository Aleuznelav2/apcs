/* Sam Valenzuela
 * 12-17-18
 * Primes.java
 * Find prime numbers between a bound
 */

 import java.util.Scanner;

 public class Primes{
	 public static void main(String args[]){
		 Scanner reader = new Scanner(System.in);

		double lower, upper, innerLimit, n, d;;

		System.out.print("Enter the lower limit or -1 to quit: ");
		lower = reader.nextDouble();

		while (lower != -1){
			System.out.print("Enter the upper limit: ");
			upper = reader.nextDouble();

			for (n = lower; n <= upper; n++){
				innerLimit = (double)Math.sqrt (n);
				for (d = 2; d <= innerLimit; d++){
					if (n % d == 0){
						break;
					}
				}
				if (d > innerLimit)
					System.out.println (n + " is prime");
			}

			System.out.print("Enter the lower limit or -1 to quit: ");
			lower = reader.nextDouble();
		}
	}
}