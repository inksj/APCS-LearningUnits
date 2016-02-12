// Java0908.java
// This program changes private member data to "protected" data.
// The <Student> class can now access data from the <Person> class.


public class Java0908
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0908\n");
		Student tom = new Student();
		tom.showData();
		System.out.println();
	}
}


class Person
{
	protected int age;

	public Person()
	{
		age = 17;
	}
}


class Student extends Person
{
	protected int grade;

	public Student()
	{
		grade = 12;
	}

	public void showData()
	{
		System.out.println("Student's Grade is " + grade);
		System.out.println("Student's Age is " + age);
	}
}


