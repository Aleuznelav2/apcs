/*
 * Sam Valenzuela
 * 12-12-18
 * SwervepointTester.java
 * bonus quiz grade	WITH TRY AND CATCH STATEMENTS!!!!!!
 */
 import java.util.*;
 import java.io.*;

 public class SwervepointTester{
	 public static void main(String args[]){
		 Scanner vUI = new Scanner(System.in);

		 String sName, sNameTrimmed;
		 int iRep;
		 double dCost, dSell;

		 while(true){
		 	System.out.println("What is your name? (or blank to quit):");
		 	sName = vUI.nextLine();
		 	sNameTrimmed = sName.trim();
		 	if(sNameTrimmed.length() == 0){
		 		break;
			}

		 	Swervepoint com = new Swervepoint();
		 	com.setName(sNameTrimmed);

		 	while(true){
				try{
		 			System.out.println("\nWhat type of rep are you? \n(1)Inside sales\n(2)Phone/web\n(3)Outside sales");
		 			iRep = vUI.nextInt();
		 			if(com.setRepType(iRep)){
						break;
					}

				}
				catch(Exception e){
					System.out.println("ERROR: Response was not an integer.");
					vUI.next();
				}
		 	}

		 	while(true){
				try{
		 			System.out.println("\nWhat was the cost of the goods?");
		 			dCost = vUI.nextDouble();
		 			if(com.setCost(dCost)){
						break;
					}
				}
				catch(Exception lol){
					System.out.println("ERROR: Response was not a (decimal) number.");
					vUI.next();
				}
		 	}

		 	while(true){
				try{
		 			System.out.println("\nHow much were the goods sold for?");
		 			dSell = vUI.nextDouble();
		 			if(dSell < dCost){
						System.out.println("ERROR: Sell cannot be less than cost.");
					}
		 			else if(com.setSales(dSell)){
						break;
					}
				}
				catch(Exception OISERHFGOI){
					System.out.println("ERROR: Response was not a (decimal) number.");
					vUI.next();
				}
		 	}
			vUI.nextLine();
		 	System.out.println(com);
		}
	 }
 }
