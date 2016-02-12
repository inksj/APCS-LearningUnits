// Java0918.java
// This program solves the problem of the program Java0916.java.
// The <Animal> superclass has a "fake" <getType> method that is
// re-defined for each subclass.


public class Java0918
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0918\n");
		Animal tiger = new Cat("Tiger");
		System.out.println(tiger.getType());

		Animal eagle = new Bird("Eagle");
		System.out.println(eagle.getType());

		Animal shark = new Fish("Shark");
		System.out.println(shark.getType());
	}
}


class Animal
{
	public Animal()
	{
		System.out.println("Animal constructor called");
	}

	public String getType()
	{
		return "";
	}

}


class Cat extends Animal
{
	protected String catType;

	public Cat(String ct)
	{
		catType = ct;
	}

	public String getType()
	{
		return catType;
	}
}

class Bird extends Animal
{
	protected String birdType;

	public Bird(String bt)
	{
		birdType = bt;
	}

	public String getType()
	{
		return birdType;
	}
}

class Fish extends Animal
{
	protected String fishType;

	public Fish(String ft)
	{
		fishType = ft;
	}

	public String getType()
	{
		return fishType;
	}
}