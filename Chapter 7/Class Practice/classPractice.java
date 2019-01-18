/*
Figure it out
*/


public class classPractice{

  //PROBLEM 1
  //write the output for the above loop and tell me what the break accomplishes
  public static void main (String[] args){
	  for (int i = 0; i <= 50; i++){
		while(i%10==0){
			System.out.println(i);
			break;
			}
	}
	//Outputs 0 10 20 30 40 50
	//The break stops the while loop, making it like an if statement
	//PROBLEM 2
/*
	write a nested for loop to solve:
	Outer Loop uses a counter that begins at zero, increments by one at each
	  iteration, and iterates until the counter reaches a value of 100.
	Inner loop will print the values 1-10 but only if the outer loop is divisible by 3.
*/
		for(int i=0; i<=100; i++){
			for(int j=1; j <= 10; j++){
				if(i % 3 == 0){
					System.out.print(j + " ");
				}else{
					System.out.println("");
					break;
				}
			}
		}
	}
}
