// Java0513.java
// This program demonstrates <switch> used with the <String> data type.
// This requires the uses of the Java 7.0 or later.
// It also shows that multiple program statements can be placed
// between the <case> and <break> commands.
// This is the one time {braces} are NOT used to control multiple statements.


import java.util.Scanner;


public class Java0513
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA0513.JAVA\n");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a day abbreviation, like (Sun, Mon, Tue, etc.) ===>>  ");
		String day = input.nextLine();
		System.out.println();
		switch (day)
		{
			case "Sun" :
				System.out.println("Sunday");
				System.out.println("No School");
				break;
			case "Mon" :
				System.out.println("Monday");
				System.out.println("School Day");
				break;
			case "Tue" :
				System.out.println("Tuesday");
				System.out.println("School Day");
				break;
			case "Wed" :
				System.out.println("Wednesday");
				System.out.println("School Day");
				break;
			case "Thu" :
				System.out.println("Thursday");
				System.out.println("School Day");
				break;
			case "Fri" :
				System.out.println("Friday");
				System.out.println("School Day");
				break;
			case "Sat" :
				System.out.println("Saturday");
				System.out.println("No School");
				break;
			default : System.out.println("This is not a day of the week.");
		}
		System.out.println();
	}
}



