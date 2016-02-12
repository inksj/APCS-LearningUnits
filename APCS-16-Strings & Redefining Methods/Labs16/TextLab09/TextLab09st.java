// TextLab09st.java
// This is the student, starting file of the TextLab09 assignment.


import java.util.Random;


public class TextLab09st
{
	public static void main(String args[])
	{
		System.out.println("TextLab09\n\n");
		Matrix m1 = new Matrix(3,4,1234);
		Matrix m2 = new Matrix(3,4,1234);
		Matrix m3 = new Matrix(3,4,4321);
		System.out.println("Matrix m1\n");
		System.out.println(m1+"\n\n");
		System.out.println("Matrix m2\n");
		System.out.println(m2+"\n\n");
		System.out.println("Matrix m3\n");
		System.out.println(m3+"\n\n");
		if (m1.equals(m2))
			System.out.println("m1 is equal to m2\n");
		else
			System.out.println("m1 is not equal to m2\n");
		if (m1.equals(m3))
			System.out.println("m1 is equal to m3\n");
		else
			System.out.println("m1 is not equal to m3\n");
	}
}


class Matrix
{
	private int rows;
	private int cols;
	private int mat[][];

	public Matrix(int rows, int cols, int seed)
	{
		this.rows = rows;
		this.cols = cols;
		mat = new int[rows][cols];
		Random rnd = new Random(seed);
		for (int r = 0; r < rows; r ++)
			for (int c = 0; c < cols; c++)
			{
				int randomInt = rnd.nextInt(90) + 10;
				mat[r][c] = randomInt;
			}
	}
}