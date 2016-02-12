// Java1202.java
// This program uses multi-level composition.


public class Java1202
{
	public static void main(String args[])
	{
		System.out.println("\nJAVA1202\n");
		Car car = new Car("Ford",6,350,"Red");
		System.out.println();
		car.getData();
		System.out.println();
	}
}


class Wheel
{
	private int wheelCount;

	public Wheel(int wc)
	{
		System.out.println("Wheel Constructor Called");
		wheelCount = wc;
	}

	public int getWheelCount()
	{
		return wheelCount;
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

class Paint
{
	private String paintColor;

	public Paint(String pc)
	{
		System.out.println("Paint Constructor Called");
		paintColor = pc;
	}

	public String getPaintColor()
	{
		return paintColor;
	}
}


class Car
{
	private String type;
	private Wheel wheel;
	private Engine engine;
	private Paint paint;

	public Car(String t, int wc, int hp, String pc)
	{
		System.out.println("Car Constructor Called");
		type = t;
		wheel = new Wheel(wc);
		engine = new Engine(hp);
		paint = new Paint(pc);
	}

	public void getData()
	{
		System.out.println("Car Type:    " + type);
		System.out.println("Wheel Count: " + wheel.getWheelCount());
		System.out.println("Horse Power: " + engine.getHorsePower());
		System.out.println("Paint Color: " + paint.getPaintColor());
	}
}

