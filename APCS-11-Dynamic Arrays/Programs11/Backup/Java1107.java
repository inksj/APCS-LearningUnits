// Java1107.java
// This program demonstrates that <int> values stored into an <ArrayList> object
// must first be converted to <Integer> objects.


import java.util.ArrayList;
import java.util.Random;


public class Java1107
{
	public static void main(String args[])
	{
		System.out.println();
		System.out.println("Java1107.java\n");
			Random rand = new Random(12345);
		ArrayList numbers = new ArrayList();

		for (int k = 1; k <= 48; k++)
		{
			int rndInt = (rand.nextInt(900) + 100);
			numbers.add(new Integer(rndInt));
		}

		int sum = 0;
		for (int k = 0; k < numbers.size(); k++)
		{
			Integer temp = (Integer) numbers.get(k);   // remove (Integer)
			sum += temp.intValue();
		}
		System.out.println("Sum: " + sum);
		System.out.println();
	}
}

