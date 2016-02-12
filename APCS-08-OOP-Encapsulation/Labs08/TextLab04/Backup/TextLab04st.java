// TextLab04st.java
// The Rational Class Program I
// This is the student, starting version of the TextLab04 assignment.


import java.util.Scanner;


public class TextLab04st
{
	static int num, den;   // numerator and denominator of the rational number

	public static void main (String args[])
	{
		enterData();

		Rational r = new Rational(num,den);

		r.displayData();
	}

	public static void enterData()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the numerator ----> ");
		num = input.nextInt();
		System.out.print("\nEnter the denominator --> ");
		den = input.nextInt();
	}
}



class Rational
{

//	Rational

//	getNum

//	getDen

//	getDecimal

//	getRational

//	getOriginal

//	reduce

	public void displayData()
	{
		System.out.println();
		System.out.println(getNum() + "/" + getDen() + " equals " + getDecimal());
		System.out.println();
	}

	private int getGCF(int n1,int n2)
	{
		int rem = 0;
		int gcf = 0;
		do
		{
			rem = n1 % n2;
			if (rem == 0)
				gcf = n2;
			else
			{
				n1 = n2;
				n2 = rem;
			}
		}
		while (rem != 0);
		return gcf;
	}
}








