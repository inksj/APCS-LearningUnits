// Java1603.java
// This program demonstrates how to access specified characters of
// a string with the <substring(SI,EI)> method, where SI is the StartIndex and
// EI is one greater than the EndIndex.


public class Java1603
{
	public static void main (String args[])
	{
		System.out.println("\nJava1603.java\n");
		String s = "Racecar";

		System.out.println(s.substring(0,4));
		System.out.println(s.substring(1,4));
		System.out.println(s.substring(2,4));
		System.out.println(s.substring(2,6));
		System.out.println(s.substring(3,6));
		System.out.println(s.substring(4,7));
		System.out.println();
	}
}

