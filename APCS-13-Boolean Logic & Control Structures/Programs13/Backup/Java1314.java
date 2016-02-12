// Java1314.java
// This program shows the need for a practical compound condition
// used with an input protection loop.
// The program requests the user PIN, but rejects access after three tries.


import java.util.Scanner;


public class Java1314
{
	public static void main (String args[])
	{
		System.out.println("Java1314\n");
		Scanner input = new Scanner(System.in);
		int pin;
		int tries = 0;
		do
		{
			System.out.print("Enter your PIN ===>>  ");
			pin = input.nextInt();
			tries++;
		}
		while (pin != 8423 && tries < 3);

		if (pin == 8423)
			System.out.println("Your PIN is accepted");
		else
			System.out.println("You have exceeded your PIN entries");
	}
}
