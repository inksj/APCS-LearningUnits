// Java1511.java
// In this program the second student is initialized to null.
// Since the object is initialized, the program compiles.
// When the program tries to display the name of an object
// which is null, the program has a NullPointerException.

public class Java1511
{
	public static void main(String[] args)
	{
		Student stu1 = new Student("Tom",17,3.99);
		Student stu2 = null;

		System.out.println(stu1.getName());
		System.out.println(stu2.getName());
	}
}

class Student
{
	private String name;
	private int age;
	private double gpa;

	public Student (String n, int a, double g)
	{
		name = n;
		age  = a;
		gpa  = g;
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	public double getGPA()
	{
		return gpa;
	}
}




