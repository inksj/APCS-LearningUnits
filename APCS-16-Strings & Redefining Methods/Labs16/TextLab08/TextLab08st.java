// TextLab08st.java
// This is the student, starting file for the TextLab08 assignment.


import java.util.Scanner;


public class TextLab08st
{
	public static void main(String args[])
	{
		System.out.println("TextLab08\n\n");
		FullName fn = new FullName();
		System.out.println("\nFirst Name First: " + fn.firstNameFirst());
		System.out.println("\nLast  Name First: " + fn.lastNameFirst());
		System.out.println();
	}
}

class FullName
{
	String name;

	public FullName()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your full name, first name first.  -->  ");
		name = input.nextLine();
		
	}

	public String firstNameFirst()
	{
		return name;
	}

	public String lastNameFirst()
	{
	
		/*
		 *  80 point precondition: The entered name consists of a First Name and a Last Name seprated by a single space.
		 *
		 * 100 point precondition: The entered name consists of a First Name, Last Name and any number of Middle Names.
		 *                         NOTE: "any number" means it is possible not to have no Middle Name at all.
		 *                         You can assume the user is not entering any extra spaces.
		 */






	}
}

