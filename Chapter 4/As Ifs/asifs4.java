/*
 Programmer: Sam Valenzuela
 Filename: asifs4.java
 Date: October 29 2018
 Purpose: As-ifs 4 - swap 2 numbers using a 3rd variable
 */

import java.util.Scanner;

public class asifs4 {
    public static void main(String args[]) {
        Scanner vUI = new Scanner(System.in);

        int a,b,c;

        System.out.println("Enter integer 1");
        a = vUI.nextInt();

        System.out.println("\nEnter interger 2");
        b = vUI.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("\n" + a);
        System.out.println(b);
    }
}
