/* Sam Valenzuela
 * 1-17-19
 * Squares.java
 * Square the values within an array
 */

 public class Squares{
	 public static void main(String args[]){
		 int array[] = {2,4,6,8,10,12};

		 System.out.println("The original dataset:");
		 for(int i=0;i<array.length;i++){
		 	 System.out.print(array[i] + " ");
		 }
		 squareValues(array);

		 System.out.println("\n\nThe dataset squared:\n");

		 for(int i=0;i<array.length;i++){
			 System.out.print(array[i] + " ");
			 if(i == array.length - 1)
			 	System.out.println();
		 }
	 }

	 public static int[] squareValues(int[] x){
		 for(int i=0;i<x.length;i++){
			 x[i] = (x[i] * x[i]);
		 }
		 return x;
	 }
 }

