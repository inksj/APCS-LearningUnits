// Java1803.java
// List case study #3
// This program adds the <pause> method, which freezes output display until
// the <Enter> key is pressed.  This new method allows output viewing on the
// monitor when the display becomes too large.


import java.util.*;


public class Java1803
{
	public static void main(String args[])
	{
		List3 array1 = new List3(60,100,200);
		array1.display();
		array1.pause();

		List3 array2 = new List3(100,100,999);
		array2.display();
		array2.pause();

		List3 array3 = new List3(200,10,19);
		array3.display();
		array3.pause();

		List3 array4 = new List3(40,500,505);
		array4.display();
		array4.pause();
		System.out.println();
	}
}


class List3
{
	private int intArray[];	// stores array elements
	private int size;  		// number of elements in the array
	private int minInt;  	// smallest random integer
	private int maxInt;  	// largest random integer

	public List3(int s, int min, int max)
	{
		Random rndInt = new Random(12345);
		minInt = min;
		maxInt = max;
		size = s;
		System.out.println("\nCONSTRUCTING LIST WITH VALUES in [" + minInt + ".." + maxInt + "] range");
		intArray = new int[size];
		int range = maxInt - minInt + 1;
		for (int k = 0; k < size; k++)
			intArray[k] = rndInt.nextInt(range) + minInt;
	}

	public void display()
	{
		System.out.println("\nDISPLAYING ARRAY ELEMENTS");
		for (int k = 0; k < size; k++)
			System.out.print(intArray[k] + "  ");
		System.out.println();
	}

	public void pause()
	{
		Scanner input = new Scanner(System.in);
		String dummy;
		System.out.print("\nPress <Enter> to continue  ===>>  ");
		dummy = input.nextLine();
	}

}

