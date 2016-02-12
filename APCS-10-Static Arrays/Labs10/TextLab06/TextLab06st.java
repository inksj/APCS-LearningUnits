// TextLab06st.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the TextLab06 assignment.


import java.text.DecimalFormat;
import java.util.Scanner;


public class TextLab06st
{
	public static void main(String args[]) //main method,contols execution or program(index_)
	{
		// This main method needs additions for the 100 point version.80 pt Current
	//
		Scanner input = new Scanner(System.in);
		System.out.println("\nTextLab06\n");
		System.out.print("Enter the primes upper bound  ===>>  ");
		final int MAX = input.nextInt();
	
		boolean primes[] = new boolean[MAX];//intializing the primes array and the size array is what is being inputted for max
		computePrimes(primes);
		displayPrimes(primes);
	}

	public static void computePrimes(boolean primes[])//contructor that is feed information through boolean primes[]
	{
		System.out.println("\nCOMPUTING PRIME NUMBERS");
		for (int t=2; t< primes.length; t++)
			{
				primes[t]=true;
				
			}
		for ( int q = 2;  q < primes.length; q++ )	//outer loop
				
		{
			for(int p = 2*q; p < primes.length; p+=q)	//inner loop
			
				primes[p]= false;
			
		}
	}

	public static void displayPrimes(boolean primes[])
	{
			DecimalFormat threeDigits = new DecimalFormat("000");
		System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
		System.out.println();
		for ( int k = 1; k< primes.length;k++)
		
			if (primes[k])
			System.out.println(threeDigits.format(k)+" ");
	

	}
}




