// Java1316.java
// This program uses "short circuiting" and uses the isEven
// method to demonstrate short circuiting with logical and.


import java.util.Scanner;


public class Java1316
{

	public static void main (String args[])
	{
		System.out.println("Java1316\n");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number 1  ===>>  ");
		int n1 = input.nextInt();
		System.out.print("Enter number 2  ===>>  ");
		int n2 = input.nextInt();

		if (isEven(n1) && isEven(n2))
			System.out.println("Both numbers are even.");
		else
			System.out.println("At least one number is odd.");
	}

	public static boolean isEven(int number)
	{
		System.out.println();
		System.out.println("Calling IsEven Method");
		System.out.println();
		if (number % 2 == 0)
			return true;
		else
			return false;
	}

}


