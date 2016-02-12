// Java1111.java
// This program shows another benefit of using generics.
// There are two <ArrayList> objects and both are constructed
// to store <Integer> values.  After three values are entered
// in the <numbers1> object, those values are then assigned
// to <numbers2>, which works without problems.


import java.util.ArrayList;


public class Java1111
{
	public static void main(String args[])
	{
		System.out.println();
		System.out.println("Java1111.java\n");

		ArrayList<Integer> numbers1 = new ArrayList<Integer>();
		numbers1.add(new Integer(100));
		numbers1.add(new Integer(200));
		numbers1.add(new Integer(300));
		System.out.println(numbers1);

		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
		numbers2.add(numbers1.get(0));
		numbers2.add(numbers1.get(1));
		numbers2.add(numbers1.get(2));
		System.out.println(numbers2);

		System.out.println();
	}
}

