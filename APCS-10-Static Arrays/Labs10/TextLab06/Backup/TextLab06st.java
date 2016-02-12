// TextLab06st.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the TextLab06 assignment.


import java.text.DecimalFormat;
import java.util.Scanner;


public class TextLab06st
{
	public static void main(String args[])
	{
		// This main method needs additions for the 100 point version.
		Scanner input = new Scanner(System.in);
		System.out.println("\nTextLab06\n");
		final int MAX = 100;
		boolean primes[];
		primes = new boolean[MAX];
		computePrimes(primes);
		displayPrimes(primes);
	}

	public static void computePrimes(boolean primes[])
	{
		System.out.println("\nCOMPUTING PRIME NUMBERS");

	}

	public static void displayPrimes(boolean primes[])
	{
		System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
		System.out.println();

	}

}



