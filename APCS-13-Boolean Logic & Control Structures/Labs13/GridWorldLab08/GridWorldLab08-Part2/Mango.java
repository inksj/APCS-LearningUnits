/*
 * Author Leon Schram 06-22-10
 * Mango.java
 * The Aardvark class stores the total number of mangos in any Mango object.  
 * This file is part of the folder/project named GridWorldLab08-Part2.
 * Altered by John Schram 11/11/2008.  displayCost and computeCost methods added.
 */ 
public class Mango
{
	// numMangos attribute store the total number of mangos.
	protected int numMangos;

	/*
	 * Mango one-parameter constructor, which constructs an object and
	 * initializes the numMangos attribute.
	 */	
	public Mango(int m)
	{
		numMangos = m;
	}
	
	// getMangos returns the number of mangos stored.	
	public int getMangos()
	{
		return numMangos;
	}
	
	// setMangos assigns a new value to the number of mangos stored.		
	public void setMangos(int m)
	{
		numMangos = m;
	}
	
	// displayCost will display the cost to purchase all of the mangos.		
	public void displayCost(double price)
	{
		System.out.println("There are " + getMangos() + " mangos.");
		System.out.println("At $" + price + " each, the whole lot of mangos would cost $" + computeCost(price));
	}
	
	/*
	 * computeCost will compute the cost of the whole lot of mangos.
	 * This method will NOT show up in Javadoc since computeCost is a private method.
	 */		
	private double computeCost(double price)
	{
		return price * numMangos;
	}	
}

	