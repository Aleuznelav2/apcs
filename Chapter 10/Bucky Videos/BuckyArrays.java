/* Sam Valenzuela
 * 1-3-19
 * BuckyArrays.java
 * Bucky tutorials 27-34
 */
import java.util.Random;

public class BuckyArrays{
	public static void main(String args[]){
		int firstarray[][] = {{8,9,10,11},{12,13,14,15}};  //first bracket for row, second for column
		int secondarray[][] = {{30,31,32,33},{43},{4,5,6}};

		//firstarray[1][0] would be 8 when trying to call a value
		//secondarry[3][1] would be 5

		System.out.println("This is the first array");
		display(firstarray);

		System.out.println("This is the second array");
		display(secondarray);
	}

	public static void display(int x[][]){
		//one loop goes through rows, other goes through columns
		for(int row=0; row<x.length; row++){
			for(int column=0; column<x[row].length; column++){
				System.out.print(x[row][column] + "\t");
			}
			System.out.println();
		}
	}
}

/* ------------
     Video 27
   ------------
    int yeehaw[] = new int[10]; //indicates how many values will be stored (10 values)

	yeehaw[0] = 87; //indexes (or subscrpits) from 0-9
	yeehaw[1] = 543;
	yeehaw[9] = 22;

	System.out.println(yeehaw[1]); //prints 543

	int hawyee[] = {2,4,5,7,9}; //array initializer, easier way to create array values

	System.out.println(hawyee[4]); //prints 9

	------------
	  Video 28
	------------
	System.out.println("Index\tValue");

	int despacito[] = {32,21,18,54,2};

	for(int i=0; i < despacito.length; i++){	//first index of array is 0
		System.out.println(i + "\t" + despacito[i]);
	}

	------------
	  Video 29
	------------
	int ono[] = {21,16,86,21,3};
	int sum = 0;

	for(int i=0; i < ono.length; i++){
		sum += ono[i];	//adds up all values in the array together
	}

	System.out.println("The sum is: " + sum);

	------------
	  Video 30
	------------
	Random rand = new Random();
	int frequency[] = new int[7]; //0-6, not using 0 though

	for(int roll=1; roll<10000; roll++){
		++frequency[1+rand.nextInt(6)];
		//1 + rand shifts all the numbers to not use 0
		//++ adds 1 to the index each time a number is rolled
	}

	System.out.println("Face\tFrequency");

	for(int face=1; face<frequency.length; face++){
		System.out.println(face + "\t" + frequency[face]); //output value
	}

	------------
	  Video 31
	------------
	int bork[] = {3,4,5,6,7};
	int total = 0;

	for(int x: bork){	//stores value of array to x variable
		total += x;
	}

	System.out.println(total);

	------------
	  Video 32
	------------
	public static void main(String args[]){
		int shiasurprise[] = {3,4,5,6,7};

		change(shiasurprise);

		for(int y: shiasurprise){
			System.out.println(y);
		}
	}

	public static void change(int x[]){	//parameter of an array
		for(int i=0; i<x.length; i++){
			x[i] +=5; //adds 5 to every value
		}
	}

	------------
      Video 33
	------------
	int firstarray[][] = {{8,9,10,11},{12,13,14,15}};  //first bracket for row, second for column
	int secondarray[][] = {{30,31,32,33},{43},{4,5,6}};

	//firstarray[1][0] would be 8
	//secondarry[3][1] would be 5

	------------
	  Video 34
	------------
	public static void main(String args[]){
		int firstarray[][] = {{8,9,10,11},{12,13,14,15}};  //first bracket for row, second for column
		int secondarray[][] = {{30,31,32,33},{43},{4,5,6}};

		//firstarray[1][0] would be 8 when trying to call a value
		//secondarry[3][1] would be 5

		System.out.println("This is the first array");
		display(firstarray);

		System.out.println("This is the second array");
		display(secondarray);
	}

	public static void display(int x[][]){
		//one loop goes through rows, other goes through columns
		for(int row=0; row<x.length; row++){
			for(int column=0; column<x[row].length; column++){
				System.out.print(x[row][column] + "\t");
			}
			System.out.println();
		}
	}








*/
