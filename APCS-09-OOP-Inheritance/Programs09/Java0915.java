// Java0915.java
// This program demonstrates that it is possible to use the super class identifier
// <Animal> to declare each sub class object.



public class Java0915
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0915\n");
		Animal tiger = new Cat("Tiger");
		Animal eagle = new Bird("Eagle");
		Animal shark = new Fish("Shark");
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
		System.out.println("Cat constructor called");
		catType = ct;
	}
}

class Bird extends Animal
{
	protected String birdType;

	public Bird(String bt)
	{
		System.out.println("Bird constructor called");
		birdType = bt;
	}
}

class Fish extends Animal
{
	protected String fishType;

	public Fish(String ft)
	{
		System.out.println("Fish constructor called");
		fishType = ft;
	}
}