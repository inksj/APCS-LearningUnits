// Java1405.java
// This program displays the output of five different classes
// with the same <display> method using polymorphism.


import java.util.ArrayList;


public class Java1405
{
	public static void main (String[] args)
	{
		System.out.println("JAVA1405\n\n");
		ArrayList<Language> countries = new ArrayList<Language>();
		countries.add(new Language());
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
		System.out.println("All languages have a greeting");
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