// Java0623.java
// This program draws a pentagon with the <drawPolygon> method.
// Methods <drawPolygon> and <fillPolygon> take a Polygon object as
// parameter.  The polygon object stores a set of points.  Points can
// be added to a Polygon object with the <addPoint> method.


import java.awt.*;
import java.applet.*;


public class Java0623 extends Applet
{
	public void paint(Graphics g)
	{
		Polygon penta = new Polygon();
		penta.addPoint(400,70);
		penta.addPoint(550,200);
		penta.addPoint(500,350);
		penta.addPoint(300,350);
		penta.addPoint(250,200);
		g.drawPolygon(penta);
	}
}

