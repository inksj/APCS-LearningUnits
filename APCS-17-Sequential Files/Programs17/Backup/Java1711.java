// Java1711.java
// This program reviews some of the methods used by the <Scanner> class.


import java.util.Scanner;


public class Java1711
{
	public static void main (String args[])
	{
		System.out.println("\nJava1711.java\n");
		Scanner input = new Scanner(System.in);

		String name;
		int age;
		double gpa;

		System.out.print("Enter Name  ===>>  ");
		name = input.nextLine();

		System.out.print("Enter Age   ===>>  ");
		age = input.nextInt();

		System.out.print("Enter GPA   ===>>  ");
		gpa = input.nextDouble();

		System.out.println();
		System.out.println("Name: " + name);
		System.out.println("Age:  " + age);
		System.out.println("GPA:  " + gpa);
		System.out.println();
	}
}
