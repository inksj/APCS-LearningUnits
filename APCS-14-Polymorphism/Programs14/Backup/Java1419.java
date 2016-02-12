// Java1419.java
// This program also works polymorphism correctly with an
// interface that uses an abstract <greeting> method.


import java.util.ArrayList;


public class Java1419
{
	public static void main (String[] args)
	{
		System.out.println("JAVA1419\n\n");
		ArrayList<Language> countries = new ArrayList<Language>();
		countries.add(new English());
		countries.add(new German());
		countries.add(new Dutch());
		countries.add(new French());

		for (Language country: countries)
			country.greeting();
		System.out.println("\n\n");
	}
}


abstract interface Language
{
	public abstract void greeting();
}

class English implements Language
{
	public void greeting()
	{
		System.out.println("In English you say Good Day");
	}
}

class German implements Language
{
	public void greeting()
	{
		System.out.println("In German you say Guten Tag");
	}
}

class Dutch implements Language
{
	public void greeting()
	{
		System.out.println("In Dutch you say Goeden Dag");
	}
}

class French implements Language
{
	public void greeting()
	{
		System.out.println("In French you say Bonjour");
	}
}