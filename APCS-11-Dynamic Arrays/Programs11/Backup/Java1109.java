// Java1109.java
// This program compiles and there is still no output.  Output is not the
// issue.  Understanding the correct syntax involved does matter.
// In this case lines 21 and 22 cast to the <Person> class, which makes
// Java happy.  Without casting the data types is unknown.


import java.util.ArrayList;


public class Java1109
{
	public static void main(String args[])
	{
		System.out.println();
		System.out.println("Java1109.java\n");

		ArrayList people = new ArrayList();
		people.add(new Person("Joe",21));
		people.add(new Person("Sue",20));

      	Person student1 = (Person) people.get(0);
      	Person student2 = (Person) people.get(1);
		System.out.println();
	}
}


class Person
{
	private String name;
	private int age;

	public Person (String n, int a)
	{
		name = n;
		age = a;
	}
}
