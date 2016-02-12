// Java1019.java
// This program uses the <for..each> loop to display array data.
// It also helps to illustrate that a 2D array is an array of arrays.


import java.text.DecimalFormat;        // necessary to use the <DecimalFormat> class
import java.util.Scanner;              // necessary to use the <Scanner> class


public class Java1019
{
	public static void main(String args[])
	{
		System.out.println("\nJava1018.java\n");
		DecimalFormat threeDigits = new DecimalFormat("000");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows     -->  ");
		int numRows = input.nextInt();
		System.out.print("Enter the number of columns  -->  ");
		int numCols = input.nextInt();
		System.out.println("\n");


		int k = 1;
		int matrix[][] = new int[numRows][numCols];
		for (int r = 0; r < numRows; r++)
			for (int c = 0; c < numCols; c++)
			{
				matrix[r][c] = k;
				k++;
			}
		System.out.println();

		for (int[] row: matrix)
		{
			for (int number: row)
				System.out.print(threeDigits.format(number) + "  ");
			System.out.println();
		}
		System.out.println();
	}
}


