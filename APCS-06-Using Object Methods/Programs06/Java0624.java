// Java0624.java
// This program demonstrates that the sequence of adding points is
// significant.  The same coordinates of the previous program are used
// in the different sequence.  The display is very different.


import java.awt.*;
import java.applet.*;


public class Java0624 extends Applet
{
	public void paint(Graphics g)
	{
		Polygon penta = new Polygon();
		penta.addPoint(300,350);
		penta.addPoint(400,70);
		penta.addPoint(250,200);
		penta.addPoint(550,200);
		penta.addPoint(500,350);
		g.drawPolygon(penta);
	}
}

