// Java0718.java
// This program reviews different ways to call a return method.


public class Java0718
{

	public static void main(String args[])
	{
		System.out.println("\nJAVA0718.JAVA\n");

		System.out.println("Sum: " + sum(200,300));

		int sum = sum(200,300);
		System.out.println("Sum: " + sum);

		int checking = 200;
		int savings  = 300;
		if (sum(checking,savings) <= 0)
			System.out.println("You are broke!");
		else
			System.out.println("Let's go shopping!");

		System.out.println();
	}


	public static int sum(int n1, int n2)
	{
		int sum = n1 + n2;
		return sum;
	}

}


