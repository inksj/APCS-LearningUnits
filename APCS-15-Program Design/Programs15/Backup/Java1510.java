// Java1510.java
// In this program the second student is not initialized.
// This does NOT cause a NullPointerExceptionm because the
// program does not compile.

public class Java1510
{
	public static void main(String[] args)
	{
		Student stu1 = new Student("Tom",17,3.99);
		Student stu2;

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




