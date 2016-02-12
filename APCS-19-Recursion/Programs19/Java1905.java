// Java1905.java
// This program compares the difference between "post-recursive"
// calls and "pre-recursive" calls.


public class Java1905
{

	public static void main(String args[])
	{
		System.out.println("CALLING POST-RECURSIVE COUNT METHOD");
		count1(100,200);
		System.out.println("\n\nCALLING PRE-RECURSIVE COUNT METHOD");
		count2(100,200);
		System.out.println("\n\nEXECUTION TERMINATED");
	}

	/***** POST-RECURSIVE COUNT **************************************************/
	public static void count1(int a, int b)
	{
		if (a <= b)
		{
			System.out.print(a + "  ");
			count1(a+1,b);
		}
	}

	/***** PRE-RECURSIVE COUNT **************************************************/
	public static void count2(int a, int b)
	{
		if (a <= b)
		{
			count2(a+1,b);
			System.out.print(a + "  ");
		}
	}

}

