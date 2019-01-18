/*
 * Sam Valenzuela
 * 11-28-18
 * BankTester.java
 * Bank program
 */

 import java.util.*;

 public class BankTester{
	 public static void main(String args[]){
		 Scanner vUI = new Scanner(System.in);

		 /*
		 Bank bank = new Bank();
		 bank.setName("hi");
		 System.out.println(bank.getName()); //hi
		 bank.setAccountNum(1234);
		 System.out.println(bank.getAccountNum()); //1234
		 System.out.println(bank.getBalance()); //0.0

		 bank.setDeposit(100);
		 System.out.println(bank.getBalance()); //100.0

		 bank.setWithdrawal(20);
		 System.out.println(bank.getBalance()); //80.0
		 */

		 String a,d;
		 int b;
		 double c;

		 System.out.println("Welcome to the bank. What is your name?");
		 a = vUI.nextLine();

		 System.out.println("\nWhat is your account number?");
		 b = vUI.nextInt();

		 System.out.println("\nWhat is your current balance?");
		 c = vUI.nextDouble();
		 vUI.nextLine();

		 int i = 0;
		 while(i<1){
			 System.out.println("\nWill you be depositing or withdrawing money today? (deposit/withdraw)");
			 d = vUI.nextLine();
			 d = d.toLowerCase();

			 Bank b1 = new Bank(a,b,c,d);
			 if(d.equals("deposit")){
				 i++;
				 double dDeposit;
				 System.out.println("\nHow much money are you depositing?");
				 dDeposit = vUI.nextDouble();
				 b1.setDeposit(dDeposit);
				 System.out.println(b1);
			 }else if(d.equals("withdraw")){
				 i++;
				 double dWithdraw;
				 System.out.println("\nHow much money are you withdrawing?");
				 dWithdraw = vUI.nextDouble();
				 b1.setWithdrawal(dWithdraw);
				 System.out.println(b1);
			 }else{
				 System.out.println("\nInvalid input.");
			 }
		 }
	 }
 }