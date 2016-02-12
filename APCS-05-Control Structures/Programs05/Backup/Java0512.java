// Java0512.java
// This program demonstrates multi-way selection with <switch> and <case>.
// This program adds <break> and <default>.
// The use of <break> is required for logical output.


import java.util.Scanner;


public class Java0512
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA0512.JAVA\n");
 		Scanner keyboard  = new Scanner(System.in);
		System.out.print("Enter Month Number {1-12}  ===>>  ");
		int month = keyboard.nextInt();
		System.out.println();

		switch (month)
		{
			case  1 : System.out.println("January");   break;
			case  2 : System.out.println("February");  break;
			case  3 : System.out.println("March");     break;
			case  4 : System.out.println("April");     break;
			case  5 : System.out.println("May");       break;
			case  6 : System.out.println("June");      break;
			case  7 : System.out.println("July");      break;
			case  8 : System.out.println("August");    break;
			case  9 : System.out.println("September"); break;
			case 10 : System.out.println("October");   break;
			case 11 : System.out.println("November");  break;
			case 12 : System.out.println("December");  break;
			default : System.out.println("This is not a valid month number.");
		}
		System.out.println();
	}
}
