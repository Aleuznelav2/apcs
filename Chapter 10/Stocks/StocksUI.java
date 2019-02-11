/* Sam Valenzuela
 * 1-11-19
 * StocksUI.java
 * Enter stock price changes in the last 10 days
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class StocksUI{
	public static void main(String args[]){
		String ticker;
		int z = -1;
		double prices[] = new double[10];
		Scanner vUI = new Scanner(System.in);

		System.out.print("Enter stock ticker: ");
		ticker = vUI.nextLine();

		for(int i=0;i<prices.length;i++){
			System.out.print("Enter the closing price of " + ticker + " on day " + (i+1) + ": ");
			prices[i] = vUI.nextDouble();
		}

		double change[] = new double[10];
		for(int i=0;i<change.length-1;i++){
			change[i] = Math.abs((prices[i] - prices[i+1]));
		}

		System.out.println();
		for(int i=0; i<prices.length-1;i++){
			 if(prices[i+1] < prices[i]){
				 System.out.println(ticker + " dropped on day " + (i+2) + " in the last 10 days.");
				 z = 0;
			 }
		 }
		 if(z == -1){
			System.out.println(ticker + " did not drop in the last " + prices.length + " days.");
		}

		System.out.println();
		for(int i=0;i<change.length-1;i++){
			//System.out.println("Change from day " + (i+1) + " to day " + (i+2) + ": $" + change[i]);
		}

		System.out.println();

		double percent[] = new double[10];
		String percentrounded[] = new String[10];
		DecimalFormat twodecimals = new DecimalFormat("#.00");
		//I couldn't figure out how to round to 2 decimal places for some reason, so I used this

		for(int i=0;i<percent.length-1;i++){
			percent[i] = 100 * (prices[i+1]-prices[i]) / prices[i];
			//percent[i] = Math.round((percent[i] * 100.0) / 100.0);
			percentrounded[i] = twodecimals.format(percent[i]);
		}

		for(int i=0;i<percent.length-1;i++){
			//System.out.println("Percent change from day " + (i+1) + " to day " + (i+2) + ": " + percent[i] + "%");
			System.out.println("Percent change from day " + (i+1) + " to day " + (i+2) + ": " + percentrounded[i] + "%");
		}

		int dog = -1;
		double high = change[0];
		for(int i=0;i<change.length-1;i++){
			if(change[i+1] > high){
				high = Math.round((change[i+1]) * 100.0) / 100.0;

			}
		}
		System.out.println();
		if(high > 0){
			System.out.println(ticker + "'s highest daily gain is: $" + high);
		}else{
			System.out.println(ticker + " did not make any gains :(");
		}
	}
}