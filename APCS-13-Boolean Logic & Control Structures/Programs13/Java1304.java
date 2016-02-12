// Java1304.java
// This program displays an admission message based on an entered
// SAT score.  It also determines financial need with a nested
// <if...else> control structure.


import java.util.Scanner;

public class Java1304
{
	public static void main (String args[])
	{
		System.out.println("Java1304\n");
		Scanner input = new Scanner(System.in);
		int sat;
		double income;

		System.out.print("Enter your SAT score ===>>  ");
		sat = input.nextInt();
		if (sat >= 1100)
		{
			System.out.println("You are admitted");
			System.out.print("Enter your family income ===>>  ");
			income = input.nextDouble();
			if (income <= 20000)
				System.out.println("You will receive financial aid");
			else
				System.out.println("You will not receive financial aid");
		}
		else
		{
			System.out.println("You are not admitted");
		}
	}
}

