/*
 * Sam Valenzuela
 * 12-5-18
 * Swervepoint.java
 * y
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

	 public void setName(String n){
		 sName = n;
	 }

	 public String getName(){
		 return sName;
	 }

	 public void setRepType(int r){
		 iRepType = r;
	 }

	 public int getRepType(){
		 return iRepType;
	 }

	 public void setCost(double c){
		 dCost = c;
	 }

	 public double getCost(){
		 return dCost;
	 }

	 public void setSales(double s){
		 dSales = s;
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
		 		"\nCommission: $" + getCommission();
		 return str;
	}

 }