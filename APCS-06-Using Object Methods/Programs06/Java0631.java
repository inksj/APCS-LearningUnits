// Java0631.java
// This program cures the <Scanner> class problem with a "dummy" variable.
// The dummy variable removes the <crLf> character from the buffer.


import java.util.Scanner;

public class Java0631
{
	public static void main (String args[])
	{
 		System.out.println("\nJAVA0631.JAVA\n");
 		Scanner input = new Scanner(System.in);

		System.out.print("Enter Student 1 Name  ===>>  ");
		String name1 = input.nextLine();
		System.out.print("Enter Student 1 Age   ===>>  ");
		int age1 = input.nextInt();

		System.out.print("Enter Student 2 Age   ===>>  ");
		int age2 = input.nextInt();
		String dummy = input.nextLine();                    // <<<================ removes CRLF
		System.out.print("Enter Student 2 Name  ===>>  ");
		String name2 = input.nextLine();

		System.out.println("\n\n");
		System.out.println("Student 1 Name:  " + name1);
		System.out.println("Student 1 Age:   " + age1);
		System.out.println("Student 2 Name:  " + name2);
		System.out.println("Student 2 Age:   " + age2);
		System.out.println();
	}
}

