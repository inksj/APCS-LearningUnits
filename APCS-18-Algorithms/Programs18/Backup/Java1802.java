// Java1802.java
// List case study #2
// This stage adds a third constructor, which instantiates an array object with
// a specified set of random numbers.  Old methods, like the first two constructors,
// which are not tested are removed for better program brevity and clarity.


import java.util.Random;


public class Java1802
{
	public static void main(String args[])
	{
		List2 array1 = new List2(15,0,100);
		array1.display();
		List2 array2 = new List2(15,100,999);
		array2.display();
		List2 array3 = new List2(15,0,1);
		array3.display();
		List2 array4 = new List2(15,500,505);
		array4.display();
		System.out.println();
	}
}


class List2
{
	private int intArray[];	// stores array elements
	private int size;  		// number of elements in the array
	private int minInt;  	// smallest random integer
	private int maxInt;  	// largest random integer

	public List2(int s, int min, int max)
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

}

