/* Sam Valenzuela
 * 1-16-19
 * Project10d1.java
 * Sort integers into even, odd, and negative
 */

 import java.util.Scanner;

 public class Project10d1{
	 public static void main(String args[]){
		 int evenList[] = new int[9];
		 int oddList[] = new int[9];
		 int negativeList[] = new int[9];
		 int input, even = 0, odd = 0, negative = 0;
		 Scanner vUI = new Scanner(System.in);

		 for(int x=0;x<10;x++){
			 System.out.print("Enter a number:  ");
			 input = vUI.nextInt();
			 if(input % 2 == 0){
				 if(input < 0){
				 	 negativeList[negative] = input;
				 	 negative++;
			 	 }
				 evenList[even] = input;
				 even++;
			 }else if(input % 2 != 0){
				 if(input < 0){
				 	 negativeList[negative] = input;
				 	 negative++;
			     }
				 oddList[odd] = input;
				 odd++;
			 }
		 }

		 System.out.println("\nEven numbers: ");
		 for(int a=0;a<even;a++){
			 System.out.print(evenList[a] + " ");
		 }
		 System.out.println();
		 System.out.println("\nOdd numbers: ");
		 for(int b=0;b<odd;b++){
			 System.out.print(oddList[b] + " ");
		 }
		 System.out.println();
		 System.out.println("\nNegative numbers: ");
		 for(int c=0;c<negative;c++){
			 System.out.print(negativeList[c] + " ");
		 }
		 System.out.println();
		 System.out.println();
	 }
 }