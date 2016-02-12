// Java1619.java
// This program is almost identical to the previous program.
// This time the <toString> method is not called by any <Student>
// object.  Yet the result is the same because <println> uses the
// string representation of <toString> for its output.


import java.util.ArrayList;


public class Java1619
{
	public static void main (String args[])
	{
		System.out.println("\nJava1619.java\n");
		Student student1 = new Student("Kathy Alexander",21,3.75);
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
		return name;
	}

}
