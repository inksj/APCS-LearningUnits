// Java1309.java
// This program demonstrates compound decisions with the logical and ( && ) operator.


import java.util.Scanner;


public class Java1309
{
	public static void main (String args[])
	{
		System.out.println("Java1309\n");
		Scanner input = new Scanner(System.in);
		int education;   // years of education
		int experience;  // years of work experience

		System.out.print("Enter years of education  ===>>  ");
		education = input.nextInt();
		System.out.print("Enter years of experience ===>>  ");
		experience = input.nextInt();

		if ((education >= 16) && (experience >= 5))
			System.out.println("You are hired");
		else
			System.out.println("You are not qualified");
	}
}
