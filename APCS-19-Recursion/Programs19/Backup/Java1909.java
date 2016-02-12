// Java1909.java
// This program demonstrates the <gcf> method.


public class Java1909
{

	public static void main(String args[])
	{
		System.out.println("CALLING ITERATIVE GCF METHOD");
		System.out.println("GCF of 120 and 108 is  " + gcf1(120,108));
		System.out.println("\n\nCALLING RECURSIVE GCF METHOD");
		System.out.println("GCF of 360 and 200 is  " + gcf2(360,200));
		System.out.println("\n\nEXECUTION TERMINATED");
	}

	/***** ITERATIVE GCF *************************************************/
	public static int gcf1(int n1, int n2)
	{
		int temp = 0;
		int rem = 0;
		do
		{
			rem = n1 % n2;
			if (rem == 0)
				temp = n2;
			else
			{
				n1 = n2;
				n2 = rem;
			}
		}
		while (rem != 0);
		return temp;
	}

	/***** RECURSIVE GCF **************************************************/
	public static int gcf2(int n1, int n2)
	{
		int rem = n1 % n2;
		if (rem == 0)
			return n2;
		else
			return gcf2(n2,rem);
	}

}
