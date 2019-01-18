/*
	Sam Valenzuela
	Concert.java
	11-5-18
	Write an attendance program with probability using RNG
 */
import java.util.*;

public class Concert{
	public static void main (String args[]){
		 int iCapacity = 20, iFans = 35, iAdmitted = 0, iGoldenTix = 5, iPrice = 50, iMoney = 0, iLuckyTotal = 0, iBye = 0;
		 int iLuck;
		 int iOdds = iCapacity / iGoldenTix;
		 int iStarbucks = 0;

		 Random vGen = new Random();

		 if(iFans >= iCapacity){
			iStarbucks = vGen.nextInt(iCapacity) + 1;
		 }else{
			iStarbucks = vGen.nextInt(iFans) + 1;
		 }

		 while(iAdmitted < iCapacity && iFans > 0){
			 iAdmitted++;
			 iFans--;
			 iLuck = vGen.nextInt(iOdds) + 1;
			 //System.out.println(iLuck);

			if(iCapacity - iAdmitted + 1 == iGoldenTix && iGoldenTix > 0){
				 System.out.println("Admitted person " + iAdmitted + " - Automatically won a golden ticket! Free admission.");
				 if(iStarbucks == iAdmitted){
					 System.out.println("\nPERSON " + iAdmitted + " ALSO WON A STARBUCKS MACCHIATO GRANDE!\n");
				 }
				 iGoldenTix--;
				 iLuckyTotal++;
			 }
			 else if(iLuck == 2 && iGoldenTix > 0){
				 System.out.println("Admitted person " + iAdmitted + " - Won a golden ticket! Free admission.");
				 iGoldenTix--;
				 iLuckyTotal++;
				 if(iStarbucks == iAdmitted){
					 System.out.println("\nPERSON " + iAdmitted + " ALSO WON A STARBUCKS MACCHIATO GRANDE!\n");
				 }
			 }
			 else{
				  System.out.println("Admitted person " + iAdmitted + " - paid $50.");
				  if(iStarbucks == iAdmitted){
				  	 System.out.println("\nPERSON " + iAdmitted + " ALSO WON A STARBUCKS MACCHIATO GRANDE!\n");
				 }
				  iMoney += 50;
			 }
		}

		//if more fans show up than the capacity
		int iOverflow = iAdmitted;
		System.out.println();
		while(iAdmitted >= iCapacity && iFans > 0){
			iFans--;
			iOverflow++;
			iBye++;
			System.out.println("Concert full, turned away person " + iOverflow);
		}
		 System.out.println("\n---- TOTALS ----");
		 System.out.println("Admitted " + iAdmitted + " fans");
		 System.out.println("Turned away " + iBye + " fans");
		 System.out.println(iLuckyTotal + " free passes given");
		 System.out.println("Earned: $" + iMoney);
		 System.out.println("Person " + iStarbucks + " won the Starbucks macchiato grande.");
	 }
 }