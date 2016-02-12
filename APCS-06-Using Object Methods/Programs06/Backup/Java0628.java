// Java0628.java
// This program uses the <nextInt> method to enter integers from the keyboard.
// The arithmetic addition proves that the entered values are integers.


import java.util.Scanner;

public class Java0628
{
	public static void main (String args[])
	{
 		System.out.println("\nJAVA0628.JAVA\n");
 		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st Number  ===>>  ");
		int number1 = input.nextInt();
		System.out.print("Enter 2nd Number  ===>>  ");
		int number2 = input.nextInt();
		int sum = number1 + number2;
		System.out.println();
		System.out.println(number1 + " + " + number2 + " = " + sum);
		System.out.println();
	}
}
