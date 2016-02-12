// Java1809.java
// List case study #9
// This program sorts in ascending order using the BubbleSort.


import java.util.*;


public class Java1809
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

		List9 array = new List9(listSize,listMin,listMax);
		array.display();
		array.pause();
		array.bubbleSort();
		array.display();
		array.pause();
		System.out.println();
	}
}


class List9
{
	private int intArray[];	// stores array elements
	private int size;  		// number of elements in the array
	private int minInt;  	// smallest random integer
	private int maxInt;  	// largest random integer

	public List9(int s, int min, int max)
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

	public void bubbleSort()
	{
		int temp;
		for (int p = 1; p < size; p++)
			for (int q = 0; q < size-1; q++)
				if (intArray[q] > intArray[q+1])
				{
					temp = intArray[q];
					intArray[q] = intArray[q+1];
					intArray  [q+1] = temp;
				}
	}


}

