/*
 Programmer: Sam Valenzuela
 Filename: Chap4Random
 Date: October 26 2018
 Purpose: Random numbers and while loops
 */

import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class Chap4Random{
	public static void main(String args[]){
		Random vGen = new Random();

		System.out.println(vGen.nextInt(3)); //rng from 0-2
		System.out.println(vGen.nextInt(3)+1); //rng from 1-3
		System.out.println(vGen.nextInt(6)+9); //rng from 9-14
		System.out.println(vGen.nextInt(9)+88); //rng from 88-96

		int i = vGen.nextInt(77);
		System.out.println(i);

		double d = vGen.nextDouble(); //rng random double from 0.0 to 1.0, cant send parameter
		System.out.println(d);

		double e = vGen.nextDouble() * 10;
		System.out.println(e);

		double f = vGen.nextDouble() * 13 + 7.2;
		System.out.println(f);

		System.out.println();





	}
}