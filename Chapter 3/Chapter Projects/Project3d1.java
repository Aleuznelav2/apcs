/*
Programmer: Sam Valenzuela
Filename: Project3d1.java
Date: 10/15/18
Purpose: Find surface area of a cube given an edge
*/
import java.util.*;

public class Project3d1{
	public static void main(String args[]){
		Scanner vUI = new Scanner(System.in);

		int iSide, iSArea;

		System.out.println("Enter the side length of a cube:");
		iSide = vUI.nextInt();

		iSArea = (iSide * iSide) * 6;

		System.out.println(iSArea);
	}
}
