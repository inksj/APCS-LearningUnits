// Java1604.java
// This program compares the two <substring> methods.


public class Java1604
{
	public static void main (String args[])
	{
		System.out.println("\nJava1604.java\n");
		String s = "Racecar";
		int n = s.length();
		for  (int k = 0; k < n; k++)
			System.out.println(s.substring(k));
		System.out.println();
		for  (int k = 0; k < n; k++)
			System.out.println(s.substring(k,n));
		System.out.println();
	}
}
