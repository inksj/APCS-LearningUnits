// Java1912.java
// This program demonstrates the <binary> method, which performs
// a Binary Search of a sorted array.


public class Java1912
{

	public static void main(String args[])
	{
		int list[] = new int[100];
		assign(list);
		display(list);

		System.out.println("\n\nCALLING ITERATIVE BINARY SEARCH METHOD");
		System.out.println("Number 425 is at index " + binary1(list,425));
		System.out.println("Number 211 is at index " + binary1(list,211));
		System.out.println("\n\nCALLING RECURSIVE BINARY SEARCH METHOD");
		System.out.println("Number 375 is at index " + binary2(list,375,0,99));
		System.out.println("Number 533 is at index " + binary2(list,533,0,99));
		System.out.println("\n\nEXECUTION TERMINATED");
	}

	public static void assign(int list[])
	{
		for (int k = 0; k < list.length; k++)
			list[k] = 100 + k * 5;
	}

	public static void display(int list[])
	{
		for (int k = 0; k < list.length; k++)
			System.out.print(list[k] + "  ");
	}


	/***** ITERATIVE BINARY SEARCH *********************************************/
	public static int binary1(int list[], int key)
	{
		int lo = 0;
		int hi = list.length-1;
		int mid = 0;
		boolean found = false;
		while (lo <= hi && !found)
		{
			mid = (lo + hi) /2;
			if (list[mid] == key)
				found = true;
			else
				if (key > list[mid])
					lo = mid + 1;
				else
					hi = mid - 1;
		}
		if (found)
			return mid;
		else
			return -1;
	}

	/***** RECURSIVE BINARY SEARCH *********************************************/
	public static int binary2(int list[], int key, int lo, int hi)
	{
		int mid = 0;
		if (lo > hi)
			return -1;
		else
		{
			mid = (lo + hi) /2;
			if (list[mid] == key)
				return mid;
			else
				if (key > list[mid])
					return binary2(list,key,mid+1,hi);
				else
					return binary2(list,key,lo,mid-1);
		}
	}

}

