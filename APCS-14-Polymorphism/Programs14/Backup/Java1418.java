// Java1418.java
// This program works polymorphism correctly with an "umbrella"
// superclass that uses an empty <greeting> method.


import java.util.ArrayList;


public class Java1418
{
	public static void main (String[] args)
	{
		System.out.println("JAVA1418\n");
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


class Language
{
	public void greeting()
	{
	}
}

class English extends Language
{
	public void greeting()
	{
		System.out.println("In English you say Good Day");
	}
}

class German extends Language
{
	public void greeting()
	{
		System.out.println("In German you say Guten Tag");
	}
}

class Dutch extends Language
{
	public void greeting()
	{
		System.out.println("In Dutch you say Goeden Dag");
	}
}

class French extends Language
{
	public void greeting()
	{
		System.out.println("In French you say Bonjour");
	}
}