// Java1611.java
// This program intentional extends the two classes with
// Object as the superclass.  This is done automatically.

import java.util.ArrayList;

public class Java1611 extends Object
{
	public static void main (String args[])
	{
		System.out.println("\nJava1611.java\n");
		Qwerty q = new Qwerty();
	}
}

class Qwerty extends Object
{
	public Qwerty()
	{
		System.out.println("Constructing Qwerty Object");
	}
}
