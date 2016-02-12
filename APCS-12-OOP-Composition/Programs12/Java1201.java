// Java1201.java
// This program uses an <Engine> object in a "has-a" composition relationship.


public class Java1201
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA1201\n");
		Car car = new Car("Ford",350);
		System.out.println();
		car.showData();
		System.out.println();
	}
}


class Engine
{
	private int horsePower;

	public Engine(int hp)
	{
		System.out.println("Engine Constructor Called");
		horsePower = hp;
	}

	public int getHorsePower()
	{
		return horsePower;
	}
}


class Car
{
	private String type;
	private Engine engine;

	public Car(String t, int hp)
	{
		System.out.println("Car Constructor Called");
		type = t;
		engine = new Engine(hp);
	}

	public void showData()
	{
		System.out.println("Car Type:    " + type);
		System.out.println("Horse Power: " + engine.getHorsePower());
	}
}

