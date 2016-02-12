// Java1906.java
// This program demonstrates how recursion can display output in reverse order.


public class Java1906
{

	public static void main(String args[])
	{
		System.out.println("\n\nCALLING PRE-RECURSIVE COUNT METHOD");
		count2(100,105);
		System.out.println("\n\nEXECUTION TERMINATED");
	}


	/***** PRE-RECURSIVE COUNT **************************************************/
	public static void count2(int a, int b)
	{
		if (a <= b)
		{
			System.out.println("Interrupting method completion; pushing " + a + " on stack.");
			count2(a+1,b);
			System.out.println("Returning to complete method; popping " + a + " from stack.");
			System.out.println("Displaying popped value " + a);
		}
	}

}

