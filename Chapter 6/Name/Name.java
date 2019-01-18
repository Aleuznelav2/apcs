/*
 * Sam Valenzuela
 * 11-28-18
 * NameTester.java
 *
 */
import java.util.Calendar;
import java.util.Date;

public class Name{
	public String getMessage(String fn, String ln){
		String first, last, time, full;
		int a;

		first = fn;
		last = ln;

		Calendar cal = Calendar.getInstance(); 		//create calendar object
		cal.setTime(new Date()); 					//set calendar to today
		int hour = cal.get(Calendar.HOUR_OF_DAY); 	//get the current hour of day

		if(hour < 12 && hour >= 0)   time = "Good morning, " ;
		else if(hour < 18 && hour >= 12) time = "Good afternoon, ";
		else time = "Good night, ";

		full = time + first + last;

		return full;
	}
}