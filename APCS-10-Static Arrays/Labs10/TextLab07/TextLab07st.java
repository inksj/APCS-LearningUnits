// TextLab07st.java
// The "Odd Magic Square" Program
// This is the student, starting version of the TextLab07 assignment.


import java.util.Scanner;
import java.text.DecimalFormat;

public class TextLab07st
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

        System.out.print("Enter the odd# size of the Magic Square -->  ");
        int size = input.nextInt();
        MagicSquare magic = new MagicSquare(size);

        magic.computeMagicSquare();
        magic.displayMagicSquare();
//		magic.checkRows();           // for 100 & 110 Point Version Only
//		magic.checkColumns();		 // for 100 & 110 Point Version Only
 //		magic.checkDiagonals();	 	 // for 100 & 110 Point Version Only
 		System.out.println();
	}
}

class MagicSquare
{
	private int size;
	private int magic[][];
	private DecimalFormat output;

	public MagicSquare(int s)
	{
		size = s;
		magic = new int[size][size];
		output = new DecimalFormat("000");
	}

	public void computeMagicSquare()
	{

for( int row=0; row < size; row++)
	for ( int col = 0; col < size; col++ )
		magic[row][col]=0;
	int m = 1; 
	magic[0][(magic.size - 1)/2]= m;
	for( int num = 2; num <= size*size; num++)
		if ( row > 0 && col < size-1)
		{row--;
		col++;
		if (magic[row][col]==0 )
		{magic[row][col] = num;
		}
		else
		{ row+=2;
		col--;
			if (row < size-1; col < size-1  )
			{
					row--;
					col++;
				if (col = size-1; row )
			}
			
			}	
		}
	
	}
	public void displayMagicSquare()
	{
		System.out.println();
		System.out.println(size + "x" + size + " Magic Square");
		System.out.println("==================");
		System.out.println();





	}

	public void checkRows()
	{
		System.out.println();
		System.out.println("Checking Rows");
		System.out.println("=============");
		System.out.println();


	}

	public void checkColumns()
	{
		System.out.println();
		System.out.println("Checking Columns");
		System.out.println("================");
		System.out.println();


	}

	public void checkDiagonals()
	{
		System.out.println();
		System.out.println("Checking Diagonals");
		System.out.println("==================");
		System.out.println();


	}
}
