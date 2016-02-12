// Java1620.java
// This program demonstrates "redefining the <toString> method in the
// <Student> class so that it displays every field of a <Student> object.
// Note how this implementation resembles the <ArrayList> format.


import java.util.ArrayList;


public class Java1620
{
	public static void main (String args[])
	{
		System.out.println("\nJava1620.java\n");
		Student student1 = new Student("Kathy Alexander",21,3.475);
		Student student2 = new Student("Peter VanVliet",18,2.265);
		System.out.println(student1);
		System.out.println(student2);
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
		return "[" + name + ","  + age + "," + gpa + "]";
	}

}
