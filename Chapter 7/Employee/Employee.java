/* Sam Valenzuela
 * 12-12-18
 * Employee.java
 * Compute the weekly pay of hourly employees.
 */

 public class Employee{
	 private String name;
	 private int type;
	 private double rate;
	 private int hours;

	 public Employee(){
		 this("",0,0,0);
	 }

	 public Employee(String n, int t, double r, int h){
		 n = name;
		 t = type;
		 r = rate;
		 h = hours;
	 }

	 public Employee(Employee x){
		 this(x.name, x.type, x.rate, x.hours);
	 }

	 public String getNameRules(){
		 return "nonblank";
	 }

	 public String getTypeRules(){
		 return "1 or 2";
	 }

	 public String getRateRules(){
		 return "between 6.75 and 30.50, inclusive";
	 }

	 public String getHoursRules(){
		 return "between 1 and 60, inclusive";
	 }

	 public boolean setName(String n){
		 if(n.equals("")){
			 return false;
		 }else{
			 name = n;
			 return true;
		 }
	 }

	 public boolean setType(int t){
		 if(t != 1 && t != 2){
			 return false;
		 }else{
			 type = t;
			 return true;
		 }
	 }

	 public boolean setRate(double r){
		 if(!(6.75 <= r && r <= 30.50)){
			 return false;
		 }else{
			 rate = r;
			 return true;
		 }
	 }

	 public boolean setHours(int h){
		 if(!(1 <= h && h <= 60)){
			 return false;
		 }else{
			 hours = h;
			 return true;
		 }
	 }

	 public String getName(){
		 return name;
	 }

	 public double getPay(){
		 double pay;
		 if(hours <= 40 || type == 2){
			 pay = rate * hours;
		 }else{
			 pay = rate * 40 + rate * 2 * (hours-40);
		 }
		 return pay;
	 }
 }