// Java1901.java
// This program demonstrates recursion without an exit.
// The recursive calls will continue until the program aborts
// with an error message.


public class Java1901
{

	static int k = 0;

	public static void main(String args[])
	{
		count();
	}

	public static void count()
	{
		k++;
		System.out.print(k + "  ");
		count();
	}

}

