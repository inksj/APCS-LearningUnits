// Java0909.java
// This program adds output in the constructors to the <Person> and <Student> classes.
// Note how the <Person> constructor is called, even though there does
// not appear to be a <Person> object instantiated.


public class Java0909
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0909\n");
		Student tom = new Student();
		System.out.println("tom's age is   " + tom.getAge());
		System.out.println("tom's grade is " + tom.getGrade());
		System.out.println();
	}
}


class Person
{
	private int age;

	public Person()
	{
		System.out.println("Person Constructor");
		age = 17;
	}

	public int getAge()
	{
		return age;
	}
}


class Student extends Person
{
	private int grade;

	public Student()
	{
		System.out.println("Student Constructor");
		grade = 12;
	}

	public int getGrade()
	{
		return grade;
	}
}
