// Java1307.java
// This program displays several multiplication tables using
// nested pre-condition <while> loop structures.


public class Java1307
{
	public static void main(String args[])
	{
		System.out.println("Java1307\n");
		int k = 1;
		int table = 11;
		while (table <= 13)
		{
			while (k <= 5)
			{
				System.out.println(k + " * " + table + " = " + k * table);
				k++;
			}
			System.out.println();
			k = 1;
			table++;
		}
	}
}


