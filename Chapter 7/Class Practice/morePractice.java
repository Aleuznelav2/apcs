/*
Write exactly the output for the questions found in the print or println
*/

public class morePractice{
   public static void main (String[] args){

int A=7, B=8, C=3; boolean testme;

	testme = !((A == B) || ((B>C)  && (C<B)));
	System.out.println("q1 " + testme);
	//true


	boolean X, Y, Z, answer;

	X = true;	Y = false;	Z = false;
	answer = (X || Y) && (X || Z);
	System.out.println("q2 " + answer);
	//true

	int whatever = 4444;
	double guess;

	if (whatever > 1000)
	guess = 8.8;
	else if (whatever > 4000)
	guess = 4.4;
	else if (whatever > 5000)
	guess = 3.3;
	else
	guess = 0;

	System.out.println("q3 " + guess);
	//8.8

	System.out.println("q4 ");

	for (int i = 1; i <=10; i++){
		for (int j = 1; j <=i; j++){
			System.out.print(j + "");
		/*
		1
		12
		123
		1234
		12345
		123456
		1234567
		12345678
		123456789
		12345687910
		*/
		}
	System.out.println("");
	}

System.out.println("");



///Use the following to answer 5 & 6
String str = "The seniors are cold and wanted to stay home";

System.out.println("q5");
System.out.println(str.indexOf(' ')); //3

System.out.println("q6");
System.out.println(str.substring(35)); //stay home

//Write a code segment to find the index of the first instance of the sub string "seniors" in the string str

System.out.println(str.indexOf("seniors"));

}}