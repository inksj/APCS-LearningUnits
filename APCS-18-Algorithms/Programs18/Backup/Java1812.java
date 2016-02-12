// Java1812.java
// List case study #12
// This stage replaces the Bubble Sort with the Selection Sort.


import java.util.*;


public class Java1812
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

		List12 array = new List12(listSize,listMin,listMax);
		array.display();
		array.pause();
		array.selectionSort();
		array.display();
		array.pause();
		System.out.println();
	}
}


class List12
{
	private int intArray[];	// stores array elements
	private int size;  		// number of elements in the array
	private int minInt;  	// smallest random integer
	private int maxInt;  	// largest random integer

	public List12(int s, int min, int max)
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


	private void swap(int x, int y)
	{
		int temp = intArray[x];
		intArray[x] = intArray[y];
		intArray[y] = temp;
	}

	public void selectionSort()
	{
		int p,q;
		int smallest;
		for (p = 0; p < size-1; p++)
		{
			smallest = p;
			for (q = p+1; q < size; q++)
				if (intArray[q] < intArray[smallest])
			smallest = q;
			if (intArray[p] != intArray[smallest])
				swap(p,smallest);
		}
	}

}

