// Java1310.java
// This program demonstrates compound decision with a do...while loop.
// The program checks for proper data entry.
// The addition of charAt(0) allows the nextLine method to enter a single character.


import java.util.Scanner;


public class Java1310
{
	public static void main (String args[])
	{
		System.out.println("Java1310\n");
		Scanner input = new Scanner(System.in);
		char gender;

		do
		{
			System.out.print("Enter your Gender [M/F] ===>>  ");
			gender = input.nextLine().charAt(0);
		}
		while ( !(gender == 'M' || gender == 'F') );

		System.out.println("Your gender is " + gender);

	 }
}
