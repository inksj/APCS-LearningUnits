// Java0912.java
// This program demonstrates inheritance at three levels.


public class Java0912
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA0912\n");
		Cat tiger = new Cat("Tiger",500,5);
		System.out.println();
		System.out.println("Animal type:   " + tiger.getType());
		System.out.println("Animal weight: " + tiger.getWeight());
		System.out.println("Animal age:    " + tiger.getAge());
		System.out.println();
	}
}


class Animal
{
	protected int age;

	public Animal(int a)
	{
		System.out.println("Animal Constructor Called");
		age = a;
	}

	public int getAge()
	{
		return age;
	}
}


class Mammal extends Animal
{
	protected int weight;

	public Mammal(int w, int a)
	{
		super(a);
		weight = w;
		System.out.println("Mammal Constructor Called");
	}

	public int getWeight()
	{
		return weight;
	}
}

class Cat extends Mammal
{
	protected String type;

	public Cat(String t, int w, int a)
	{
		super(w,a);
		type = t;
		System.out.println("Cat Constructor Called");
	}

	public String getType()
	{
		return type;
	}
}



