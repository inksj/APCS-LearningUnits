// Java1404.java
// This program displays the output of four different classes
// with the same <greeting> method.
// This program uses neither inheritance nor polymorphism.


import java.util.ArrayList;


public class Java1404
{
	public static void main (String[] args)
	{
		System.out.println("JAVA1404\n\n");
		English g1 = new English();
		German g2 = new German();
		Dutch g3 = new Dutch();
		French g4 = new French();
		g1.greeting();
		g2.greeting();
		g3.greeting();
		g4.greeting();
		System.out.println("\n\n");
	}
}

class English
{
	public void greeting()
	{
		System.out.println("In English you say Good Day");
	}
}

class German
{
	public void greeting()
	{
		System.out.println("In German you say Guten Tag");
	}
}

class Dutch
{
	public void greeting()
	{
		System.out.println("In Dutch you say Goeden Dag");
	}
}

class French
{
	public void greeting()
	{
		System.out.println("In French you say Bonjour");
	}
}