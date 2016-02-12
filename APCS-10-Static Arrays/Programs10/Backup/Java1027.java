// Java1027.java
// This second example of using a <swap> method does swap the
// requested array elements.


public class Java1027
{
	public static void main (String args[])
	{
		System.out.println("\nJava1027.java\n");
		int[] list = {11,22,33,44,55,66,77,88,99};
		System.out.println("Before swap  " + list[3] + "  " + list[6]);
		swap(list,3,6);
		System.out.println("After swap   " + list[3] + "  " + list[6]);

	}

	public static void swap(int[] x, int p, int q)
	{
		int temp = x[p];
		x[p] = x[q];
		x[q] = temp;
	}
}

