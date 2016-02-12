// Java0916.java
// This program adds <getType> methods for each one of the three <Animal> sub classes.
// The program does not compile, because <getType> is not an <Animal> method.


public class Java0916
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0916\n");
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