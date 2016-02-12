// Java0811.java
// Cube Casestudy #2
// Stage #2 adds a <draw> method to display one cube object.


import java.awt.*;
import java.applet.*;


public class Java0811 extends Applet
{
	public void paint(Graphics g)
	{
		Cube cube = new Cube(g);
		cube.draw(g);
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

	public void draw(Graphics g)
	{
		int tlX2 = tlX + 12;
		int tlY2 = tlY + 12;
		g.setColor(Color.black);
		g.drawRect(tlX,tlY,50,50);
		g.drawRect(tlX2,tlY2,50,50);
		g.drawLine(tlX,tlY,tlX2,tlY2);
		g.drawLine(tlX+50,tlY,tlX2+50,tlY2);
		g.drawLine(tlX,tlY+50,tlX2,tlY2+50);
		g.drawLine(tlX+50,tlY+50,tlX2+50,tlY2+50);
	}
}




