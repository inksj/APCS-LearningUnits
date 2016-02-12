// Java1311.java
// This program demonstrates compound decision with a do...while loop.
// The program does not work properly because of misplaced parentheses.


import java.util.Scanner;


public class Java1311
{
	public static void main (String args[])
	{
		System.out.println("Java1311\n");
		Scanner input = new Scanner(System.in);
		char gender;

		do
		{
			System.out.print("Enter your Gender [M/F] ===>>  ");
			gender = input.nextLine().charAt(0);
		}
		while ( !(gender == 'M') || gender == 'F' );

		System.out.println("Your gender is " + gender);

	}
}
