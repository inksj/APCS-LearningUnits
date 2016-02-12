// Java1507.java
// This program causes a "ClassCastException"
// when a Fish object is cast as a Cat.

public class Java1507
{
	public static void main(String args[])
	{
		Animal tiger = new Cat("Tiger");
		System.out.println(((Cat)tiger).getType());

		Animal eagle = new Bird("Eagle");
		System.out.println(((Bird)eagle).getType());

		Animal shark = new Fish ("Shark");
		System.out.println(((Cat) shark).getType());
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
