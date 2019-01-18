/*
 * Sam Valenzuela
 * 11-27-18
 * Turkey4U.java
 * Calculate how to cook turkeys
 */

 import java.util.*;

 public class Turkey4U{
	 public static void main(String args[]){
		 Scanner vUI = new Scanner(System.in);
		 String a;
		 double b;
		 boolean c;

		 System.out.println("Enter your name:");
		 a = vUI.nextLine();

		 System.out.println("\nEnter the weight:");
		 b = vUI.nextDouble();

		 System.out.println("\nIs the turkey stuffed? (true/false)");
		 c = vUI.nextBoolean();

		 Turkey turk = new Turkey(a,b,c);

		 //turk.setName("Albuquerque Turkey");
		 //System.out.println(turk.getName());
		 //System.out.println();

		 //turk.setWeight(10);
		 //System.out.println(turk.getWeight() + " lbs");

		 //turk.setType(false);
		 //System.out.println(turk.getType());
		 //System.out.println(turk.getHours() + " hours");
		 //System.out.println(turk.getMin() + " minutes");
		 //System.out.println(turk.getTotalMin() + " minutes");
		 //System.out.println();
		 System.out.println(turk);
	 }
 }