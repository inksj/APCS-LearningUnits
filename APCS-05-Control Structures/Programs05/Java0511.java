// Java0511.java
// This program demonstrates multi-way selection with <switch> and <case>.
// This program compiles, but displays illogical output.


import java.util.Scanner;


public class Java0511
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA0511.JAVA\n");
 		Scanner keyboard  = new Scanner(System.in);
		System.out.print("Enter Month Number  ===>>  ");
		int month = keyboard.nextInt();
		System.out.println();

		switch (month)
		{
			case  1 : System.out.println("January");
			case  2 : System.out.println("February");
			case  3 : System.out.println("March");
			case  4 : System.out.println("April");
			case  5 : System.out.println("May");
			case  6 : System.out.println("June");
			case  7 : System.out.println("July");
			case  8 : System.out.println("August");
			case  9 : System.out.println("September");
			case 10 : System.out.println("October");
			case 11 : System.out.println("November");
			case 12 : System.out.println("December");
		}
		System.out.println();
	}
}

