// Java0632.java
// This program example shows a second solution to the buffer problem.
// In this case two <Scanner> objects are constructed: One for number input and one
// for text input.  It is not necessary to clear the buffer with a "dummy" variable.


import java.util.Scanner;


public class Java0632
{
	public static void main (String args[])
	{
 		System.out.println("\nJAVA0632.JAVA\n");
 		Scanner numberInput = new Scanner(System.in);
 		Scanner textInput = new Scanner(System.in);

		System.out.print("Enter number 1  ===>>  ");
		int number1 = numberInput.nextInt();
		System.out.print("Enter name 1    ===>>  ");
		String name1 = textInput.nextLine();

		System.out.print("Enter number 2  ===>>  ");
		int number2 = numberInput.nextInt();
		System.out.print("Enter name 2    ===>>  ");
		String name2 = textInput.nextLine();

		System.out.println("\n\n");
		System.out.println("Number 1:  " + number1);
		System.out.println("Name 1  :  " + name1);
		System.out.println("Number 2:  " + number2);
		System.out.println("Name 2  :  " + name2);
		System.out.println();
	}
}

