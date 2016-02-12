// Java0514.java
// This <String> example shows a more complex use of the <switch> structure,
// which can handle multiple matches for the same output.


import java.util.Scanner;


public class Java0514
{
	public static void main (String args[])
	{
		System.out.println("\nJAVA0514.JAVA\n");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first name of someone in Leon Schram's family.  ===>>  ");
		String firstName = input.nextLine();
		System.out.println();
		switch (firstName)
		{
			case "Isolde"  : System.out.println("This is Mr. Schram's wife."); break;
			case "John"    :
			case "Greg"    : System.out.println("This is one of Mr. Schram's sons."); break;
			case "Maria"   :
			case "Heidi"   : System.out.println("This is one of Mr. Schram's daughters."); break;
			case "Mike"    :
			case "David"   : System.out.println("This is one of Mr. Schram's sons-in-law."); break;
			case "Diana"   : System.out.println("This is Mr. Schram's daughter-in-law."); break;
			case "Jessica" :
			case "Haley"   :
			case "Mari"    :
			case "Brenda"  : System.out.println("This is one of Mr. Schram's granddaughters."); break;
			case "Anthony" :
			case "Alec"    :
			case "Maddox"  :
			case "Jaxon"   :
			case "Braxton" : System.out.println("This is one of Mr. Schram's grandsons."); break;
			case "Astrid" :
			case "Ingrid"  : System.out.println("This is one of Mr. Schram's sisters."); break;
			case "Remy"    : System.out.println("This is Mr. Schram's brother."); break;
			case "Darlene" :
			case "Kassi"   :
			case "Holli"   : System.out.println("This is one of Mr. Schram's nieces."); break;
			case "Gene"    :
			case "Sean"    :
			case "Blake"   : System.out.println("This is one of Mr. Schram's nephews."); break;
			default        : System.out.println("This is not someone in Mr. Schram's immediate family.");
			System.out.println("Make sure you spell the name correctly and only capitalize the first letter.");
		}
		System.out.println();
	}
}



