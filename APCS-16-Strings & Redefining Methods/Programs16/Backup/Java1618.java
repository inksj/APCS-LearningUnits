// Java1618.java
// This program demonstrates re-defining the <toString> method
// in the <Student> class so that it displays the name field
// of a <Student> object.


import java.util.ArrayList;


public class Java1618
{
	public static void main (String args[])
	{
		System.out.println("\nJava1618.java\n");
		Student student1 = new Student("Kathy Alexander",21,3.75);
		Student student2 = new Student("Peter VanVliet",18,2.265);
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println();
	}
}


class Student
{
	private String name;
	private int age;
	private double gpa;

	public Student(String n, int a, double g)
	{
		name = n;
		age = a;
		gpa = g;
	}

	public String toString()
	{
		return name;
	}

}
