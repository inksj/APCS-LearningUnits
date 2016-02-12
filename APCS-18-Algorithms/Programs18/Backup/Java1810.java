// Java1810.java
// List case study #10
// This program introduces the private <swap> method that is used by the
// <bubbleSort> and other methods.  It also improves the bubbleSort by
// reducing the number of comparison made on each pass.


import java.util.*;


public class Java1810
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter list size      ===>>  ");
		int listSize = input.nextInt();
		System.out.print("Enter minimum value  ===>>  ");
		int listMin = input.nextInt();
		System.out.print("Enter maximum value  ===>>  ");
		int listMax = input.nextInt();

		List10 array = new List10(listSize,listMin,listMax);
		array.display();
		array.pause();
		array.bubbleSort();
		array.display();
		array.pause();
		System.out.println();
	}
}


class List10
{
	private int intArray[];	// stores array elements
	private int size;  		// number of elements in the array
	private int minInt;  	// smallest random integer
	private int maxInt;  	// largest random integer

	public List10(int s, int min, int max)
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
			System.out.print(intArray[k] + "   ");
		System.out.println();
	}

	public void pause()
	{
		Scanner input = new Scanner(System.in);
		String dummy;
		System.out.print("\nPress <Enter> to continue  ===>>  ");
		dummy = input.nextLine();
	}


	private void swap(int x, int y)
	{
		int temp = intArray[x];
		intArray[x] = intArray[y];
		intArray[y] = temp;
	}

	public void bubbleSort()
	{
		for (int p = 1; p < size; p++)
			for (int q = 0; q < size-p; q++)
				if (intArray[q] > intArray[q+1])
					swap(q,q+1);
	}

}

