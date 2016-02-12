// Java0810.java
// Cube Casestudy #1
// Stage #1 presents a <Cube> class with a default constructor.
// This program does not display a cube.
// The Cube Case Study uses applets.  Run the html file to execute.


import java.awt.*;
import java.applet.*;


public class Java0810 extends Applet
{
	public void paint(Graphics g)
	{
		Cube cube = new Cube(g);
	}
}


class Cube
{
	private int tlX;	// topleft X coordinate of the Cube's position
	private int tlY;	// topleft y coordinate of the Cube's position

	public Cube(Graphics g)
	{
		tlX = 50;
		tlY = 50;
	}
}




