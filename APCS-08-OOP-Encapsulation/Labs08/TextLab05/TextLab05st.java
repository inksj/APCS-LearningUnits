// TextLab05st.java
// The Rational Class Program II
// This is the student, starting version of the Text Lab 05 assignment.
// There are 5 return methods in the Rational class that have temporary return statements
// which allow the program to compile.  Students will need to change these statements.


import java.util.Scanner;


public class TextLab05st
{
	static int num1, den1;   // numerator and denominator of the 1st rational number
	static int num2, den2;   // numerator and denominator of the 2nd rational number

	public static void main (String args[])
	{
		enterData();

		Rational r1 = new Rational(num1,den1);
		Rational r2 = new Rational(num2,den2);
		Rational r3 = new Rational();

		r3.multiply(r1,r2);
		System.out.println("\n\n" + r1.getOriginal() + " * " + r2.getOriginal() + "  =  " + r3.getRational());
		r3.divide(r1,r2);
		System.out.println("\n" + r1.getOriginal() + " / " + r2.getOriginal() + "  =  " + r3.getRational());

//	100 Point Version Only
		r3.add(r1,r2);
		System.out.println("\n" + r1.getOriginal() + " + " + r2.getOriginal() + "  =  " + r3.getRational());
		r3.subtract(r1,r2);
		System.out.println("\n" + r1.getOriginal() + " - " + r2.getOriginal() + "  =  " + r3.getRational());
		System.out.println();
	}

	public static void enterData()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the 1st numerator ----> ");
		num1 = input.nextInt();
		System.out.print("\nEnter the 1st denominator --> ");
		den1 = input.nextInt();
		System.out.print("\nEnter the 2nd numerator ----> ");
		num2 = input.nextInt();
		System.out.print("\nEnter the 2nd denominator --> ");
		den2 = input.nextInt();
	}
}


class Rational
{

	private int firstNum;	// entered numerator
	private int firstDen;	// entered denominator
	private int num;		// reduced numerator
	private int den;		// reduced denominator

	public Rational()
	{
		firstDen = den;
		firstNum = num;

	}

	public Rational(int n, int d)
	{
		 firstDen = den = d;
		firstNum = num = n;
		reduce();
		
		
	
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

	public int getNum()
	{
		return num;
	}

	public int getDen()
	{
		return den;
	}

	public double getDecimal()
	{
		return (double)num/den;
	}

	public String getRational()
	{
		return num + "/" + den;
	}

	public String getOriginal()
	{
		return firstNum + "/" + firstDen;
	}

	public void reduce()
	{ int red = getGCF(num,den);
	num /= red; 
	den /= red;
	}

	public void multiply(Rational r1, Rational r2)
	{  int m = r1.getNum() * r2.getNum();
	int m2 = r1.getDen() * r2.getDen();
	num = m;
	den = m2; 
	}

	public void divide(Rational r1, Rational r2)
	{	
		int d = r1.getNum() * r2.getDen();  
		int d2 = r1.getDen() * r2.getNum();   
	 num =  d;
	 den = d2;
		

	}

	public void add(Rational r1, Rational r2)
	{  
		int a = (r1.getNum()* r2.getDen()) + (r2.getNum()* r1.getDen());  
		int a2 = r1.getDen() * r2.getDen();   
 		num =  a;
 		den = a2;
		
									



	}

	public void subtract(Rational r1, Rational r2)
	{

		int s = (r1.getNum()* r2.getDen()) - (r2.getNum()* r1.getDen()); 
		int s2 = r1.getDen() * r2.getDen();   
 		num =  s;
 		den = s2;
		

	}

}


