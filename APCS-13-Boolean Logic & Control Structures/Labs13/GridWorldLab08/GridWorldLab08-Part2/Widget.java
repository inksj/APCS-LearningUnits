/*
 * Author Leon Schram 06-22-10
 * Widget.java
 * The Widget class stores the total number of windgets in any Widget object.  
 * There is one constructor, one get method and one set method.
 * This file is part of the folder/project named GridWorldLab08-Part2.
 */
public class Widget
{
	
	// numWidgets attribute stores the total number of widgets.
	private int numWidgets;
		
	/*
	 * Widget one-parameter constructor, which constructs an object and
	 * initializes the numWidget attribute.
	 */	
	public Widget(int w)
	{
		numWidgets = w;
	}

	// getWidgets returns the number of widgets stored.	
	public int getWidgets()
	{
		return numWidgets;
	}

	// setWidgets assigns a new value to the number of widgets stored.		
	public void setWidgets(int w)
	{
		numWidgets = w;
	}	
}
