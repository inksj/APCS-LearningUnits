// Java1813.java
// List case study #13
// This stage replaces the Selection Sort with the Insertion Sort.


import java.util.*;


public class Java1813
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

		List13 array = new List13(listSize,listMin,listMax);
		array.display();
		array.pause();
		array.insertionSort();
		array.display();
		array.pause();
		System.out.println();
	}
}


class List13
{
	private int intArray[];	// stores array elements
	private int size;  		// number of elements in the array
	private int minInt;  	// smallest random integer
	private int maxInt;  	// largest random integer

	public List13(int s, int min, int max)
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

	private int linearSearch(int searchNumber, int numElements)
	{
   		int index = 0;
   		while (index < numElements && searchNumber > intArray[index])
      		index++;
      	return index;
	}

	private void insertItem(int searchNumber, int numElements, int index)
	{
   		for (int k = numElements-1; k > index; k--)
      		intArray[k] = intArray[k-1];
   		intArray[index] = searchNumber;
	}

	public void insertionSort()
	{
   		for (int k = 0; k < size; k++)
   		{
      		int numElements = k + 1;
      		int index = linearSearch(intArray[k],numElements);
      		insertItem(intArray[k],numElements,index);
   		}
	}

}

