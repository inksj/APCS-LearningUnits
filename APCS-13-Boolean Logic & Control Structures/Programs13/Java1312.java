// Java1312.java
// This program demonstrates correct use of negative compound
// decision structure using DeMorgan's Law.


import java.util.Scanner;


public class Java1312
{
	public static void main (String args[])
	{
		System.out.println("Java1312\n");
		Scanner input = new Scanner(System.in);
		char gender;

		do
		{
			System.out.print("Enter your Gender [M/F] ===>>  ");
			gender = input.nextLine().charAt(0);
		}
		while (gender != 'M' && gender != 'F');

		System.out.println("Your gender is " + gender);

	}
}
