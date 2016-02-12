// Java0905.java
// This program demonstrates fundamental inheritance with <extends>.
// There are no constructors yet, which results in Java handling the
// construction and assigning default values to the attributes.


public class Java0905
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0905\n");
		Student tom = new Student();
		System.out.println("Person's age is    " + tom.getAge());
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


class Student //extends Person
{
	private int grade;

	public int getGrade()
	{
		return grade;
	}
}



