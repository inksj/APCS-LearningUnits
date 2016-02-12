// TextLab08st.java
// This is the student starting version of the TextLab08 assignment.
// Testing <main> methods are provided for the 80-point and 100-point versions.
// This means that this version will not compile as provided.


import java.util.ArrayList;


public class TextLab08st
{
	public static void main(String args[])
	{
		System.out.println("\nTextLab08 STUDENT VERSION\n");

		Matrix m1 = new Matrix();
		m1.displayMatrix("Matrix m1 Default Display");
		System.out.println();

		Matrix m2 = new Matrix(3,5);
		m2.displayMatrix("Matrix m2 3 X 5 Display");
		System.out.println();
		int count = 100;
		for (int r = 0; r < m2.getRows(); r++)
		{
			for (int c = 0; c < m2.getCols(); c++)
			{
				m2.setValue(r,c,count);
				count++;
			}
		}
		m2.displayMatrix("Matrix m2 3 X 5 Consecutive Integers Display");
		System.out.println();

		Matrix m3 = new Matrix(3,3,100);
		m3.displayMatrix("Matrix m3 3 X 3 Initialized to 100 Display");
		System.out.println();
	}

	/****** MAIN METHOD FOR TESTING THE 100-POINT VERSION *************************************
	public static void main(String args[])
	{
		System.out.println("\nLAB13 100-POINT VERSION\n");

		Matrix m1 = new Matrix();
		m1.displayMatrix("Matrix m1 Default Display");
		System.out.println();

		Matrix m2 = new Matrix(3,5);
		int count = 10;
		for (int r = 0; r < m2.getRows(); r++)
		{
			for (int c = 0; c < m2.getCols(); c++)
			{
				m2.setValue(r,c,new Integer(count));
				count++;
			}
		}
		m2.displayMatrix("Matrix m2 3 X 5 Consecutive Integers Display");
		System.out.println();

		m2.resize(4,4);
		m2.displayMatrix("Matrix m2 After 4 X 4 Resizing Display");
		System.out.println();

		Matrix m3 = new Matrix(3,3,new Integer(100));
		m3.displayMatrix("Matrix m3 3 X 3 Initialized to 100 Display");
		System.out.println();
	}
	*******************************************************************************************/

}



class Matrix
{

	private ArrayList list;	// one-dimensional array stores matrix values
	private int listSize;	// total number of elements in the matrix
	private int numRows;	// number of rows in the matrix
	private int numCols;	// number of cols in the matrix

}