// Java1817.java
// This program measures the time necessary to count integers.

import java.util.*;

public class Java1817
{

	public static void main(String args[])
	{
		System.out.println("\nJava1817.java\n");
		Scanner input = new Scanner(System.in);
		TimeTest time = new TimeTest();
		System.out.print("Enter an integer  ===>>  ");
		int count = input.nextInt();

		//////////
		time.startClock();
		counter(count);
		time.stopClock();
		//////////

		System.out.println();
		System.out.println(time);
	}

	public static void counter (int n)
	{
		for (int k = 1;  k <= n; k++);
   	}

}
