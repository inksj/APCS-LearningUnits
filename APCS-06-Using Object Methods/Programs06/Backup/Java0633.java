// Java0633.java
// This program introduces the <Integer> class.
// An <Integer> object is an "object" which can store an
// <int> value.
// The <Integer> class is used in this program as it was required
// In the Java versions before Java 5.0.
// This is also the manner in which AP Exam questions will appear.



import java.util.Scanner;

public class Java0633
{
	public static void main (String args[])
	{
 		System.out.println("\nJAVA0633.JAVA\n");

		Integer intObject1 = new Integer(100);
		Integer intObject2 = new Integer(200);
		Double doubleObject1 = new Double(1.1);
		Double doubleObject2 = new Double(2.2);

		System.out.println("intObject1: " + intObject1.intValue());
		System.out.println("intObject2: " + intObject2.intValue());
		System.out.println("doubleObject1: " + doubleObject1.doubleValue());
		System.out.println("doubleObject2: " + doubleObject2.doubleValue());
		System.out.println();
	}
}

