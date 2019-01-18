/*
	Sam Valenzuela
	Concert.java
	11-7-18
	Write an attendance program with probability using RNG but with UI
 */
import java.util.*;

public class ConcertUI{
	public static void main (String args[]){
		int iCapacity = 0, iFans = 1, iAdmitted = 0, iGoldenTix = 0, iPrice = 50, iMoney = 0, iLuckyTotal = 0, iBye = 0;
		String sLine = "";

		Random vGen = new Random();
        Scanner vUI = new Scanner(System.in);

        System.out.println("What will the capacity of the concert be?");
        iCapacity = vUI.nextInt();

        System.out.println("How many golden tickets will be given out?");
        iGoldenTix = vUI.nextInt();
        vUI.nextLine();

        System.out.println("\nExecuting program...\n");

		int iLuck;
		int iOdds = iCapacity / iGoldenTix;
		int iStarbucks = 0;

		while(iAdmitted < iCapacity){
			System.out.println("Is there a fan in line? (Y/N)");
			sLine = vUI.nextLine();
			sLine.toLowerCase();
			if(sLine.equals("y")){
				iFans++;
				iAdmitted++;
				iLuck = vGen.nextInt(iOdds) + 1;
					if(iCapacity - iAdmitted + 1 == iGoldenTix && iGoldenTix > 0){
						System.out.println("Admitted person " + iAdmitted + " - Automatically won a golden ticket! Free admission.\n");
						iGoldenTix--;
						iLuckyTotal++;
					 }
					 else if(iLuck == 2 && iGoldenTix > 0){
						System.out.println("Admitted person " + iAdmitted + " - Won a golden ticket! Free admission.\n");
						iGoldenTix--;
						iLuckyTotal++;
					 }
					 else{
						System.out.println("Admitted person " + iAdmitted + " - paid $50.\n");
						iMoney += 50;
		 			}
			 	}
			if(sLine.equals("n")){
				break;
			}
		}

		int iOverflow = iAdmitted;
		while(iAdmitted >= iCapacity){

			System.out.println("Is there a fan in line? (Y/N)");
			sLine = vUI.nextLine();
			sLine.toLowerCase();
			if(sLine.equals("y")){
				iOverflow++;
				iBye++;
				System.out.println("Concert full, turned away person " + iOverflow + ".\n");
			}
			if(sLine.equals("n")){
				break;
			}
		}

		System.out.println("\n---- TOTALS ----");
		System.out.println("Admitted " + iAdmitted + " fans");
		System.out.println("Turned away " + iBye + " fans");
		System.out.println(iLuckyTotal + " free passes given");
		System.out.println("Earned: $" + iMoney);
		iStarbucks = vGen.nextInt(iAdmitted) + 1;
		System.out.println("Person " + iStarbucks + " won the Starbucks macchiato grande.");
	 }
 }




