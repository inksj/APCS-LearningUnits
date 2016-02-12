// Java0906.java
// This program reverses the access between the classes.
// A <person> object now tries to access a subclass method.


public class Java0906
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0906\n");
		Person tom = new Person();
		System.out.println("Person's age is   " + tom.getAge());
		System.out.println("Student's grade is " + tom.getGrade());
		System.out.println();
	}
}


class Person
{
	private int age;

	public int getAge()
	{
		return age;
	}
}


class Student extends Person
{
	private int grade;

	public int getGrade()
	{
		return grade;
	}
}



