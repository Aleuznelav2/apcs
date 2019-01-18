/*
	Sam Valenzuela
	Chap4Tester
	10-23-18
	Go over math functions from chapter 4
*/

import java.util.*;

public class Chap4Tester{
	public static void main(String[] args){
		double d1;
		int i1, iChoice;

		Scanner vUI = new Scanner(System.in);

		System.out.println("Type (1) for math functions, type (2) for assignment operators");
		iChoice = vUI.nextInt();
		if(iChoice == 1){
			System.out.println("Enter a double");
			d1 = vUI.nextDouble();
			System.out.println("Enter an integer");
			i1 = vUI.nextInt();

			System.out.println();

			double dAbs = Math.abs(d1);
			System.out.println("Absolute value of " + d1 + " is " + dAbs);
			System.out.println(i1 + " to the third power is " + Math.pow(i1,3));
			System.out.println("The sqaure root of " + i1 +  " is " + Math.sqrt(i1));
			System.out.println(d1 + " to the nearest integer is " + Math.round(d1));
			System.out.println(Math.max(d1,i1) + " is the larger number of " + d1 + " and " + i1);
			System.out.println();
			System.out.println("Round " + Math.PI + ": " + Math.round(Math.PI));
			System.out.println("Round 3.50: " + Math.round(3.50));
			System.out.println("Round some math: " + Math.round(3+.5+.3+.2+.1));
		}else if(iChoice == 2){
			System.out.println("--------------------\nASSIGNMENT OPERATORS\n--------------------");
			System.out.println("= is assignment operator");
			System.out.println("e.g. x *= 3 means x = x * 3\nx-= 5 means x = x - 5");
			System.out.println("++ and -- mean add and subtract one respectively");
			System.out.println();
			System.out.println("--------------------\nRELATIONAL OPERATORS\n--------------------");
			System.out.println("== test equality\n&& and\n!= not equal\n|| or\n> < <= >= comparing");
			int x = 2;
			System.out.println(x+=4); //6
			System.out.println(x-=1); //5
			System.out.println(x/=2); //2
			System.out.println(x+=x); //4
			x=9;
			System.out.println(x%=2); //1
			System.out.println(x*=4); //4
			System.out.println(x++); //4
			System.out.println("weird" + x); //weird5
			System.out.println(x++); //5
			System.out.println(x--); //6
			System.out.println("weird" + x); //weird5
			System.out.println();
			int ab = 5, cd = 6;
			System.out.println(ab<cd); //true
			System.out.println(5 == ab); //true
			System.out.println(5 != 5); //false
			System.out.println();
			if(ab != cd && 5 == cd){ //evaluates to false
				System.out.println("evaluates to true");
			}else{
				System.out.println("evaluates to false");
			}if(ab != cd && 6 == ab){ //evaluates to false
				System.out.println("evaluates to true");
			}else{
				System.out.println("evaluates to false");
			}
		}
	}
}