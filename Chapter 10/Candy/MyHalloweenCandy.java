/* Sam Valenzuela
 * 1-16-19
 * MyHalloweenCandy.java
 * Fill an array with 20 candy pieces
 */

 public class MyHalloweenCandy{
	 public static void main(String args[]){
		 String candy[] = {"Kit-Kat","Starburst","Twix","Skittles","Skittles","Starburst","Hershey's","M&Ms","Milk Duds","Skittles","Skittles","Twix","Kit-Kat","Hershey's","M&Ms","Almond Joy","Twix","Skittles","Starburst","Kit-Kat","Kit-Kat"};
		 int skittles = 0;

		 for(String x: candy){
			 if(x.equals("Skittles")){
				 skittles++;
			 }
		 }

		 System.out.println("Skittles was found " + skittles + " times\n");

		 for(int x = 0; x<candy.length;x++){
			 if(candy[x].equals("Almond Joy")){
				 System.out.println("Almond Joy was found at index " + x);
				 break;
			 }
		 }

		 System.out.println();
		 for(String all: candy){
			 System.out.println(all);
		 }
	 }
 }
