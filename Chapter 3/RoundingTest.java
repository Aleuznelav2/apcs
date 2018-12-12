public class RoundingTest{
	public static void main(String[] args){
		double x = 5.5, y = 5.4, z = 5.6;
		int iCastedValue;

		iCastedValue = (int)(x+0.5);
		System.out.println(x + " rounds to " + iCastedValue);

		iCastedValue = (int)(y+0.5);
		System.out.println(y + " rounds to " + iCastedValue);

		iCastedValue = (int)(z+0.5);
		System.out.println(z + " rounds to " + iCastedValue);

		System.out.println();

		System.out.println("Precedence - casting in the desired position");
		double xx;
		System.out.println(xx = (double)5/4);
		System.out.println(xx = (double)(5/4));
	}
}