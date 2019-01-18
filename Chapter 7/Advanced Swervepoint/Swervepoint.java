/*
 * Sam Valenzuela
 * 12-12-18
 * Swervepoint.java
 * yeehaw
 */
 import java.io.*;

 public class Swervepoint{
	 private String sName;
	 private int iRepType;
	 private double dCost, dSales;

	 public Swervepoint(){
		 this("",0,0,0);
	 }

	 public Swervepoint(String n, int r, double c, double s){
		 sName = n;
		 iRepType = r;
		 dCost = c;
		 dSales = s;
	 }

	 public Swervepoint(Swervepoint z){
		 this(z.sName, z.iRepType, z.dCost, z.dSales);
	 }

	 public boolean setName(String n){
		 if(n.equals("")){
			 return false;
		 }else{
			 sName = n;
			 return true;
		 }
	 }

	 public String getName(){
		 return sName;
	 }

	 public boolean setRepType(int r){
		 if(r != 1 && r != 2 && r != 3){
			 return false;
		 }else{
		 	iRepType = r;
		 	return true;
		}
	 }

	 public int getRepType(){
		 return iRepType;
	 }

	 public boolean setCost(double c){
		 if(c < 0){
			 return false;
		 }else{
			 dCost = c;
			 return true;
		 }
	 }

	 public double getCost(){
		 return dCost;
	 }

	 public boolean setSales(double s){
		if(s < 0){
			return false;
		}else{
			dSales = s;
			return true;
		}
	 }

	 public double getSales(){
		 return dSales;
	 }

	 public double getGrossProfit(){
		 return (dSales - dCost);
	 }

	 public double getCommission(){
		 if(iRepType == 1){
			 return (getGrossProfit() * 0.05);
		 }else if(iRepType == 2){
			 return (getGrossProfit() * 0.1);
		 }else{
			 return (getGrossProfit() * 0.5);
		 }
	 }

	 public String toString(){
		 String str;
		 String rep;
		 if(iRepType == 1){
		 	 rep = "Inside sales";
		 }else if(iRepType == 2){
			 rep = "Phone/web";
		 }else{
			 rep = "Outside sales";
		 }
		 str = 	"\nName: " + sName +
		 		"\nRepresentative type: " + rep +
		 		"\nGross profit: $" + getGrossProfit() +
		 		"\nCommission: $" + getCommission() + "\n\n-------------------\n";
		 return str;
	}

 }