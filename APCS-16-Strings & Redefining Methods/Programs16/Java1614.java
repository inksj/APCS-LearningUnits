// Java1614.java
// This program demonstrates how Java <int> and <double> arrays are
// displayed when only the object identifier is printed.


public class Java1614
{
	public static void main (String args[])
	{
		System.out.println("\nJava1614\n");
		int intList[] = {11,22,33,44,55,66,77,88,99};
		System.out.println("intList:  " + intList);
		double dblList[] = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
		System.out.println("dblList:  " + dblList);
		String strList[] = {"Tom","Joe","Sue","Meg"};
		System.out.println("strList:  " + strList);
		System.out.println();
	}
}
