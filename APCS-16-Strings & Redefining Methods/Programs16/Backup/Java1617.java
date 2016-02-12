// Java1617.java.java
// The <toString> method of an ArrayList object displays the contents of the <ArrayList>
// object, but the non-Java class <Student> objects display memory addresses.


import java.util.ArrayList;


public class Java1617
{
	public static void main (String args[])
	{
		System.out.println("\nJava1617.java\n");
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Tom",21,3.85));
		students.add(new Student("Joe",17,3.65));
		students.add(new Student("Sue",18,2.85));
		students.add(new Student("Meg",19,3.90));
		System.out.println("students:  " + students);
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
}
