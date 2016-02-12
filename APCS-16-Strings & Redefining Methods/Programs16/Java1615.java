// Java1615.java
// In this program the user-defined <Student> class uses the <toString>
// method inherited from the <Object> class.  The <Object> class <toString>
// method returns an actual string representation of the object value,
// which is a memory address.


public class Java1615
{
	public static void main (String args[])
	{
		System.out.println("\nJava1615.java\n");
		Student student1 = new Student("Tom",21,3.85);
		Student student2 = new Student("Joe",17,3.65);
		Student student3 = new Student("Sue",18,2.85);
		Student student4 = new Student("Meg",19,3.90);
		System.out.println("student1:  " + student1);
		System.out.println("student2:  " + student2);
		System.out.println("student3:  " + student3);
		System.out.println("student4:  " + student4);
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
