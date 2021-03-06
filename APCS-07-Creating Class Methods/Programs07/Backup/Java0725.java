// Java0725.java
// Payroll Case Study #3
// Stage 3 improves program readability by using meaningful identifiers.


import java.util.Scanner;
import java.text.*;

public class Java0725
{
	public static void main (String args[])
	{
		Scanner keyboard = new Scanner(System.in);
 		String employeeName;
 		double hoursWorked;
 		double hourlyRate;
 		int numDependants;
 		double overtimeHours;
 		double regularPay;
 		double overtimePay;
 		double taxRate;
 		double grossPay;
 		double taxDeductions;
 		double netPay;

 		DecimalFormat output = new DecimalFormat("$0.00");

 		System.out.println("\nPAYROLL CASE STUDY #3\n");
		System.out.print("Enter Name  ===>>  ");
		employeeName = keyboard.nextLine();
		System.out.print("Enter Hours Worked  ===>>  ");
		hoursWorked = keyboard.nextDouble();
		System.out.print("Enter Hourly Rate   ===>>  ");
		hourlyRate = keyboard.nextDouble();
		System.out.print("Enter Dependents    ===>>  ");
		numDependants = keyboard.nextInt();

		if (hoursWorked > 40)
		{
			 overtimeHours = hoursWorked - 40;
			 regularPay = 40 * hourlyRate;
			 overtimePay = overtimeHours * hourlyRate * 1.5;
		}
	 	else
	 	{
	 		regularPay = hoursWorked * hourlyRate;
	 		overtimePay = 0;
	 	}
	 	grossPay = regularPay + overtimePay;

		switch (numDependants)
		{
			case 0 : taxRate = 0.295; break;
			case 1 : taxRate = 0.249; break;
			case 2 : taxRate = 0.187; break;
			case 3 : taxRate = 0.155; break;
			case 4 : taxRate = 0.126; break;
			case 5 : taxRate = 0.100; break;
			default: taxRate = 0.075;
		}

		taxDeductions = grossPay * taxRate;
		netPay = grossPay - taxDeductions;

		System.out.println("\n\n");
		System.out.println("Name:	      " + employeeName);
		System.out.println("Hourly rate:  " + output.format(hourlyRate));
		System.out.println("Hours worked: " + hoursWorked);
		System.out.println("Dependants:   " + numDependants);
		System.out.println("Tax rate:     " + output.format(taxRate));
		System.out.println("Regular pay:  " + output.format(regularPay));
		System.out.println("Overtime pay: " + output.format(overtimePay));
		System.out.println("Gross pay:    " + output.format(grossPay));
		System.out.println("Deductions:   " + output.format(taxDeductions));
		System.out.println("Net pay:      " + output.format(netPay));
		System.out.println("\n\n");
	}

}

