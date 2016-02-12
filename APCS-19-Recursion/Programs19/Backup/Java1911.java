// Java1911.java
// This program demonstrates the <linear> method, which performs
// a Linear Search of a sorted array.


public class Java1911
{

	public static void main(String args[])
	{
		int list[] = new int[100];
		assign(list);
		display(list);

		System.out.println("\n\nCALLING ITERATIVE LINEAR SEARCH METHOD");
		System.out.println("Number 425 is located at index " + linear1(list,425));
		System.out.println("Number 211 is located at index " + linear1(list,211));
		System.out.println("\n\nCALLING RECURSIVE LINEAR SEARCH METHOD");
		System.out.println("Number 375 is located at index " + linear2(list,375,0));
		System.out.println("Number 533 is located at index " + linear2(list,533,0));
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


	/***** ITERATIVE LINEAR SEARCH *********************************************/
	public static int linear1(int list[], int key)
	{
		boolean found = false;
		int k = 0;
		while (k < list.length && !found)
		{
			if (list[k] == key)
				found = true;
			else
				k++;
		}
		if (found)
			return k;
		else
			return -1;
	}

	/***** RECURSIVE LINEAR SEARCH *********************************************/
	public static int linear2(int list[], int key, int k)
	{
		if (k == list.length)
			return -1;
		else
			if (list[k] == key)
				return k;
			else
				return linear2(list,key,k+1);
	}

}

