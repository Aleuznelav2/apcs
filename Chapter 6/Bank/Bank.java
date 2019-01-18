/*
 * Sam Valenzuela
 * 11-28-18
 * Bank.java
 * Class containing methods for the bank program
 */

 public class Bank{
	 private String sName, sChoice;
	 private int iAccount;
	 private double dStartBalance, dBalance, dDeposit, dWithdrawal;

	 public Bank(){
		 sName = "";
		 sChoice = "";
		 iAccount = 0;
		 dBalance = 0;
		 dStartBalance = 0;
	 }

	 public Bank(String nm, int ac, double ba, String ch){
		 sName = nm;
		 iAccount = ac;
		 dStartBalance = ba;
		 sChoice = ch;
	 }

	 public void setName(String nm){
		 sName = nm;
	 }

	 public String getName(){
		 return sName;
	 }

	 public void setAccountNum(int ac){
		 iAccount = ac;
	 }

	 public int getAccountNum(){
		 return iAccount;
	 }

	 public double getBalance(){
		 return dBalance;
	 }

	 public void setDeposit(double dp){
		 dBalance = dStartBalance + dp;
		 dDeposit = dp;
	 }

	 public void setWithdrawal(double wd){
		 dBalance = dStartBalance - wd;
		 dWithdrawal = wd;
	 }

	 public String toString(){
		 String str;
		 if(sChoice.equals("deposit")){
			 str = 	"\nHere is your receipt:" +
			 		"\nName: " + sName +
			 		"\nAccount number: " + iAccount +
			 		"\nStarting balance: $" + dStartBalance +
			 		"\nAmount deposited: $" + dDeposit +
			 		"\nNew balance: $" + Math.round(100.0 * dBalance) / 100.0;
		 }else{
		 	  str = "\nHere is your receipt:" +
			 		"\nName: " + sName +
			 		"\nAccount number: " + iAccount +
			 		"\nStarting balance: $" + dStartBalance +
			 		"\nAmount withdrew: $" + dWithdrawal +
			 		"\nNew balance: $" + Math.round(100.0 * dBalance) / 100.0;
		 }
		return str;

	 }
 }