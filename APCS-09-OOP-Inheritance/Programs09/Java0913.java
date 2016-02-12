// Java0913.java
// In this program both the <Person> class and the <Student>
// class each have a <getData> method.


public class Java0913
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0913\n");
		Person ann = new Person();
		Student tom = new Student();
		System.out.println("Person getData:  " + ann.getData());
		System.out.println("Student getData: " + tom.getData());
		System.out.println();
	}
}


class Person
{
	protected int age;

	public Person()
	{
		age = 21;
	}

	public int getData()
	{
		return age;
	}
}


class Student extends Person
{
	protected int grade;

	public Student()
	{
		grade = 12;
	}

	public int getData()
	{
		return grade;
	}
}


