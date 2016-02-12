// Java0630.java
// This program demonstrates an interesting problem with the <Scanner> class.
// It appears that order matters.  Enter a string first, followed by a number, and
// everything is fine.  In reverse order there is no opportunity to enter a name.                                              


import java.util.Scanner;

public class Java0630
{
	public static void main (String args[]) 							
	{  
 		System.out.println("\nJAVA0630.JAVA\n");
 		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Student 1 Name  ===>>  ");									
		String name1 = input.nextLine();											
		System.out.print("Enter Student 1 Age   ===>>  ");									
		int age1 = input.nextInt();
		
		System.out.print("Enter Student 2 Age   ===>>  ");									
		int age2 = input.nextInt();
		System.out.print("Enter Student 2 Name  ===>>  ");									
		String name2 = input.nextLine();	
		
		System.out.println("\n\n");
		System.out.println("Student 1 Name:  " + name1);
		System.out.println("Student 1 Age:   " + age1);
		System.out.println("Student 2 Name:  " + name2);
		System.out.println("Student 2 Age:   " + age2);	
		System.out.println();
	}
}

