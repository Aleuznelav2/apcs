/* Sam Valenzuela
* 12-12-18
* EmployeeTester.java
* Compute the weekly pay of hourly employees.
*/

import java.util.Scanner;

public class EmployeeTester{
	public static void main(String args[]){
		Scanner vUI = new Scanner(System.in);

		String sName, sNameTrimmed, sPrompt;
		int iType, iHours;
		double dRate;

		while(true){
			System.out.println("Enter employee data");
			System.out.print("  Name (or blank to quit): ");
			sName = vUI.nextLine();
			sNameTrimmed = sName.trim();
			if(sNameTrimmed.length() == 0){
			break;
		}
		Employee emp = new Employee();
		emp.setName(sName);

		while(true){
			sPrompt = "  Type (" + emp.getTypeRules() + "): ";
			System.out.print(sPrompt);
			iType = vUI.nextInt();
			if(emp.setType(iType)){
			break;
			}
		}
		while (true){
			sPrompt = "  Hourly rate (" + emp.getRateRules() + "): ";
			System.out.print(sPrompt);
			dRate = vUI.nextDouble();
			if (emp.setRate(dRate)){
			break;
			}
		}

		/*
		System.out.print("  Hours worked (" + emp.getHoursRules() + "): ");
		while (!emp.setHours(vUI.nextInt())){ //wrong data = double false = true
			System.out.print("  Hours worked (" + emp.getHoursRules() + "): ");
		}
		*/

		while(true){
			sPrompt = "  Hours worked (" + emp.getHoursRules() + "): ";
			System.out.print(sPrompt);
			iHours = vUI.nextInt();
			if(emp.setHours(iHours)){
			break;
			}
		}
		vUI.nextLine();

		System.out.println("  The weekly pay for " + emp.getName() + " is $" + emp.getPay() + "\n");
		}
	}
}
