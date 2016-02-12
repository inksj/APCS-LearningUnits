// Java1113.java
// Once generics are used, Java becomes very picky.  If you want to create
// an <ArrayList> object to store <Double> values, such as is shown below,
// then only <Double> values must be added.
// The attempt to add one <Double> and two <Integer> objects results in two errors.


import java.util.ArrayList;


public class Java1113
{
	public static void main(String args[])
	{
		System.out.println();
		System.out.println("Java1113.java\n");

		ArrayList<Double> list = new ArrayList<Double>();
		list.add(new Double(3.14159));
		list.add(new Integer(200));
		list.add(new Integer(300));
		System.out.println(list);
		System.out.println();
	}
}

