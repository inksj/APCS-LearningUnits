// Java1712.java
// This program shows how BufferedReader and InputStreamReader can be used for keyboard input.


import java.io.*;


public class Java1712
{
	public static void main (String args[]) throws IOException
	{
		System.out.println("\nJava1712.java\n");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String name;
		int age;
		double gpa;

		System.out.print("Enter Name  ===>>  ");
		name = input.readLine();

		System.out.print("Enter Age   ===>>  ");
		age = Integer.parseInt(input.readLine());

		System.out.print("Enter GPA   ===>>  ");
		gpa = Double.parseDouble(input.readLine());

		System.out.println();
		System.out.println("Name: " + name);
		System.out.println("Age:  " + age);
		System.out.println("GPA:  " + gpa);
		System.out.println();
	}
}
