

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
	private int num,firstNum;//state variable/attribute
	private int den,firstDen;//state variable/attribute

public Rational (int n, int d) //constructor 
	{
		
		firstNum =  num = n;
		firstDen = den = d;
		reduce();
			
	} 

//	getNum
public int getNum()
	{ 
		return num;
	}

//	getDen
public int getDen()
{
	return den;
}
//	getDecimal
public double getDecimal()
	{
	
	return (double)num/den;
	}
//	getRational
public String getRational()
{	
return num + "/" + den;
}

//	getOriginal
public String getOrginal()
{
	return firstNum + "/" + firstDen;
}


//	reduce
public void reduce()
{  int red = getGCF(num,den);
num /= red;
den /= red;
 
}

	public void displayData()
	{
		System.out.println();
		System.out.println(getOrginal() + " equals " + getDecimal() );
		System.out.println();
		System.out.println("and reduce to " + getRational());
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








