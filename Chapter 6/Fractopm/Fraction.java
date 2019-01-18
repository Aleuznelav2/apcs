/* Sam Valenzuela
 * 12-5-18
 * Fraction.java
 * Hold a numerator and denominator
 */

 public class Fraction{
	 private int num, den;

	 public Fraction(){
		 num = 0;
		 den = 0;
	 }

	 public Fraction(int n, int d){
		 num = n;
		 den = d;
	 }

	 public void setNum(int n){
		 num = n;
	 }

	 public void setDen(int d){
		 den = d;
	 }

	 public String toString(){
		 String str;
		 str = /*"\n" +*/ num + "/" + den;
		 return str;
 	 }

 	 public Fraction add(Fraction f){
		int n2 = f.num;
		int d2 = f.den;
		int n1 = num;
		int d1 = den;

		int iNumDone = n1 * d2 + n2 * d1;
		int iDenDone = d1 * d2;

		Fraction f1 = new Fraction(iNumDone,iDenDone);
		return f1;
	}
	public Fraction subtract(Fraction f){
		int n2 = f.num;
		int d2 = f.den;
		int n1 = num;
		int d1 = den;

		int iNumDone = n1 * d2 - n2 * d1;
		int iDenDone = d1 * d2;

		Fraction f1 = new Fraction(iNumDone,iDenDone);
		return f1;
	}

	public Fraction multiply(Fraction f){
		int n2 = f.num;
		int d2 = f.den;
		int n1 = num;
		int d1 = den;

		int iNumDone = n1 * n2;
		int iDenDone = d1 * d2;

		Fraction f1 = new Fraction(iNumDone,iDenDone);
		return f1;
	}

	public Fraction divide(Fraction f){
		int n2 = f.num;
		int d2 = f.den;
		int n1 = num;
		int d1 = den;

		int iNumDone = n1 * d2;
		int iDenDone = d1 * n2;

		Fraction f1 = new Fraction(iNumDone,iDenDone);
		return f1;
	}
 }