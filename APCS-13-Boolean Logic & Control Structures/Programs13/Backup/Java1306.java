// Java1306.java
// This program displays several multiplication tables using
// a nested <for> loop structure.


public class Java1306
{
	public static void main(String args[])
	{
		System.out.println("Java1306\n");
		for (int table = 11; table <= 13; table++)
		{
			for (int k = 1; k <= 5; k++)
			{
				System.out.println(k + " * " + table + " = " + k * table);
			}
			System.out.println();
		}
	}
}


