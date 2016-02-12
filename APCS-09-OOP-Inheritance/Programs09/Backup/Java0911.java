// Java0911.java
// This program demonstrates how a subclass constructor passes
// parameter information to a superclass constructor.


public class Java0911
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0911\n");
		Student tom = new Student(12,17);
		tom.showData();
		System.out.println();
	}
}


class Person
{
	protected int age;

	public Person(int a)
	{
		System.out.println("Person Parameter Constructor");
		age = a;
	}

	public int getAge()
	{
		return age;
	}
}


class Student extends Person
{
	protected int grade;

	public Student(int g, int a)
	{
		super(a);   // this must be the first call
		grade = g;
		System.out.println("Student Parameter Constructor");
	}

	public int getGrade()
	{
		return grade;
	}

	public void showData()
	{
		System.out.println("Student's Grade is " + getGrade());
		System.out.println("Student's Age is " + getAge());
	}
}


