// Java0820.java
// Using different variable names is one solution to the
// problem caused by program Java0819.java.


public class Java0820
{
	public static void main(String args[])
	{
		Widget w = new Widget(100);
		System.out.println("Object w has " + w.getWidgets() + " widgets");
	}
}


class Widget
{
	private int numWidgets;

	public Widget(int nW)
	{
		numWidgets = nW;
	}

	public int getWidgets()
	{
		return numWidgets;
	}
}

