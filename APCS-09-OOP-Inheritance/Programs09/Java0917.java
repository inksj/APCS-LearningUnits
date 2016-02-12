// Java0917.java
// This program does compile, because Each object is a <Cat>,
// <Bird> or <Fish>, which does have a <getType> method.


public class Java0917
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0917\n");
		Cat tiger = new Cat("Tiger");
		System.out.println(tiger.getType());

		Bird eagle = new Bird("Eagle");
		System.out.println(eagle.getType());

		Fish shark = new Fish("Shark");
		System.out.println(shark.getType());
	}
}


class Cat
{
	protected String catType;

	public Cat(String ct)
	{
		System.out.println("Cat constructor called");
		catType = ct;
	}

	public String getType()
	{
		return catType;
	}
}

class Bird
{
	protected String birdType;

	public Bird(String bt)
	{
		System.out.println("Bird constructor called");
		birdType = bt;
	}

	public String getType()
	{
		return birdType;
	}
}

class Fish
{
	protected String fishType;

	public Fish(String ft)
	{
		System.out.println("Fish constructor called");
		fishType = ft;
	}

	public String getType()
	{
		return fishType;
	}
}