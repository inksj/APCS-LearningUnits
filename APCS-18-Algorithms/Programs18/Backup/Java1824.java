// Java1824.java
// This program demonstrates the exact calculation counts of five different
// methods based on the entered value of n.


import java.util.*;


public class Java1824
{
	public static void main(String args[])
	{
		System.out.println("\nJava1824.java\n");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of n  ===>>  ");
		int n = input.nextInt();
		System.out.println("\n\n");
		method1(n);
		method2(n);
		method3(n);
		method4(n);
		method5(n);
		System.out.println("\n\n");
	}


	public static void method1(int n)
	{
		int count = 0;
		for (int k = 1; k <= n; k++)
			count++;
		System.out.println("Method 1:  " + count);
		System.out.println();
	}

	public static void method2(int n)
	{
		int count = 0;
		for (int k = 1; k <= n/2; k++)
			count++;
		System.out.println("Method 2:  " + count);
		System.out.println();
	}

	public static void method3(int n)
	{
		int count = 0;
		for (int p = 1; p <= n; p++)
			for (int q = 1; q <= n; q++)
				count++;
		System.out.println("Method 3:  " + count);
		System.out.println();
	}

	public static void method4(int n)
	{
		int count = 0;
		for (int p = 1; p < n; p++)
			for (int q = 1; q < n; q++)
				count++;
		System.out.println("Method 4:  " + count);
		System.out.println();
	}

	public static void method5(int n)
	{
		int count = 0;
		for (int p = 0; p < n; p++)
			for (int q = 1; q <= n-p; q++)
				count++;
		System.out.println("Method 5:  " + count);
		System.out.println();
	}
}









