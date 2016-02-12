// Java1313.java
// This program accepts upper-case as well as lower-case.
// Gender input for [M/F] by using multiple conditional statements.


import java.util.Scanner;


public class Java1313
{
	public static void main (String args[])
	{
		System.out.println("Java1313\n");
		Scanner input = new Scanner(System.in);
		char gender;
		boolean correct;
		do
		{
			System.out.print("Enter your Gender [M/F] ===>>  ");
			gender = input.nextLine().charAt(0);

			correct = (gender == 'M' || gender == 'F' || gender == 'm' || gender == 'f');

			if (!correct)
				System.out.println("Incorrect input;  please re-enter");
		}
		while (!correct);
		System.out.println();
		System.out.println("Your gender is " + gender);
	}
}

