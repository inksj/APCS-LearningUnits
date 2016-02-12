// Java1212.java
// This program demonstrates composition by creating a class,
// which "has-an" array of objects of another class.
// In this program static arrays are used in the <School> class.


public class Java1212
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA1212\n");
		String[] names = {"Tom","Sue","Joe","Meg","Bob","Ann","Dan","Jan","Ken","Kim"};
		double[] gpas = {2.125,2.175,2.225,2.275,3.125,3.175,3.325,3.375,3.675,3.875};
		School planoWest = new School(names.length);
		planoWest.loadData(names,gpas);
		planoWest.printStudents();
		System.out.println();
	}
}



class Student
{
	private String name;
	private double gpa;

	public Student(String name, double gpa)
	{
		this.name = name;
		this.gpa = gpa;
	}

	public void printStudent()
	{
		System.out.println("Name: " + name);
		System.out.println("GPA:  " + gpa);
	}
}


class School
{
	private int count;
	private Student[] students;

	public School(int n)
	{
		count = n;
		students = new Student[count];
	}

	public void loadData(String[] names, double[] gpas)
	{
		for (int k = 0; k < count; k++)
		{
			Student temp = new Student(names[k],gpas[k]);
			students[k] = temp;
		}
	}

	public void printStudents()
	{
		for (Student s: students)
			s.printStudent();
	}
}