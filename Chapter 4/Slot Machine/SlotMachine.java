/*
 * Sam Valenzuela
 * 11-8-18
 * SlotMachine.java
 * Write a slot machine program
 */

import java.util.*;

public class SlotMachine{
	 public static void main(String args[]){
		Scanner vUI = new Scanner(System.in);
		Random vGen = new Random();

		int iNum1, iNum2, iNum3, iTokens = 100, iTrial = 0, iHS = 100;
		String sPull;

		while(iTokens > 0){
			System.out.println("You have " + iTokens + " tokens.  Pull? (Y/N)");
			sPull = vUI.nextLine();
			sPull = sPull.toLowerCase();
			if(sPull.equals("y")){
				iTrial++;
				iNum1 = vGen.nextInt(3) + 1;
				iNum2 = vGen.nextInt(3) + 1;
				iNum3 = vGen.nextInt(3) + 1;
				System.out.print("[" + iNum1 + "] ");
				System.out.print("[" + iNum2 + "] ");
				System.out.print("[" + iNum3 + "] \n");
				if(iNum1 == iNum2 && iNum2 == iNum3 && iNum1 == 1){
					System.out.println("You won!");
					System.out.println("You won 4 tokens!\n");
					iTokens += 4;
					if(iTokens > iHS){
						iHS = iTokens;
					}
				}else if(iNum1 == iNum2 && iNum2 == iNum3 && iNum1 == 2){
					System.out.println("You won!");
					System.out.println("You won 8 tokens!\n");
					iTokens += 8;
					if(iTokens > iHS){
						iHS = iTokens;
					}
				}else if(iNum1 == iNum2 && iNum2 == iNum3 && iNum1== 3){
					System.out.println("You won!");
					System.out.println("You won 10 tokens!\n");
					iTokens += 10;
					if(iTokens > iHS){
						iHS = iTokens;
					}
				}
				else{
					System.out.println("You lost.\n");
					iTokens -= 1;
					if(iTokens == 0){
						System.out.println("You have ran out of tokens.\n");
						System.out.println("It took you " + iTrial + " pulls to go bankrupt!\n");
						System.out.println("At one point, you had " + iHS + " tokens.");
					}
				}
			}else if(sPull.equals("n")){
				System.out.println("Thanks for playing!");
				System.out.println("You played " + iTrial + " times.");
				iTokens = -1;
			}
		}
	}
}