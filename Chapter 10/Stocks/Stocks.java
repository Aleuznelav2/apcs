/* Sam Valenzuela
 * 1-9-19
 * Stocks.java
 * 5 day changes of AMZN
 */
 import java.util.Scanner;
 import java.text.DecimalFormat;

 public class Stocks{
	 public static void main(String args[]){
		 double dAMZN[] = {1539.13,1500.28,1575.39,1629.51,1656.58};
		 int z = -1;

		 System.out.println("Amazon stock price changes from January 2 to January 8");
		 for(int i=0; i<dAMZN.length;i++){
			 System.out.println("Day " + (i+1) + ": $" + dAMZN[i]);
		 }

		/*
		 for(int i=0; i<dAMZN.length-1;i++){
			 if(dAMZN[i] < dAMZN[i+1]){
			 	System.out.println("AMZN gained " + (Math.round((dAMZN[i+1] - dAMZN[i]) * 100.0) / 100.0) + " points from day " + (i+1) + " to day " + (i+2));
			}else{
				System.out.println("AMZN lost " + (Math.abs(Math.round((dAMZN[i+1] - dAMZN[i]) * 100.0) / 100.0)) + " points from day " + (i+1) + " to day " + (i+2));
			}
		 }
		*/
		 for(int i=0; i<dAMZN.length-1;i++){
			 if(dAMZN[i+1] < dAMZN[i]){
				 System.out.println("AMZN dropped on day " + (i+2) + " in the last 5 days.");
				 z = 0;
			 }
		 }
		 if(z == -1){
		 	System.out.println("AMZN did not drop in the last " + dAMZN.length + " days.");
		}

		System.out.println();
		System.out.println("Tilray stock price changes from January 2 to January 8");
		double TLRY[] = {70.46,70,69.95,71.9,83.26};
		int y = -1;

		for(int i=0; i<TLRY.length;i++){
			System.out.println("Day " + (i+1) + ": $" + TLRY[i]);
		}
		for(int i=0; i<TLRY.length-1;i++){
			if(TLRY[i] < TLRY[i+1]){
				System.out.println("TLRY gained " + (Math.round((TLRY[i+1] - TLRY[i]) * 100.0) / 100.0) + " points from day " + (i+1) + " to day " + (i+2));
			}else{
				System.out.println("TLRY lost " + (Math.abs(Math.round((TLRY[i+1] - TLRY[i]) * 100.0) / 100.0)) + " points from day " + (i+1) + " to day " + (i+2));
			}
		}
		for(int i=0; i<TLRY.length-1;i++){
			 if(TLRY[i+1] < TLRY[i]){
				 System.out.println("TLRY dropped on day " + (i+2) + " in the last 5 days.");
				 y = 0;
			 }
		 }
		 if(y == -1){
			System.out.println("TLRY did not drop in the last " + TLRY.length + " days.");
		}

		System.out.println("\nMy 5 favorite car brands");

		String fav[] = {"Mercedes", "Nissan", "Subaru", "Mazda", "Audi"};
		for(int i=0;i<fav.length;i++){
			System.out.println(fav[4-i]);
		}
	 }
 }