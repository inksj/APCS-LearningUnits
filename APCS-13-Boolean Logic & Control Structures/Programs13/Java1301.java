// Java1301.java
// This program demonstrates that conditional statements have
// true or false Boolean values and can display such values.


public class Java1301
{
	public static void main(String args[])
{
		int x = 5;
		int k = 0;
		int y = 0;
		while (x < 7)
		{
			y = 1;
			while (y < 9)
			{
				y++;
				k = x + y;
			}
			x += y;
		}
		System.out.println("k = " + k);
	}
}
	/*	System.out.println("\nJAVA1301.JAVA\n");
		int x =10;
		System.out.println(x == 10);
		System.out.println(x == 5);
		System.out.println();*/
	
