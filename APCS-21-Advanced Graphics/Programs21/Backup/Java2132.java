// Java2132.java
// This program revisits the earlier Java1320.java program using the <update> method.
// It shows that <update> can cause an unwanted side effect.


import java.applet.Applet;
import java.awt.*;


public class Java2132 extends Applet
{

	int startX,startY,endX,endY;

	public void paint(Graphics g)
	{
		g.drawLine(startX,startY,endX,endY);
	}

	public boolean mouseDown(Event e, int x, int y)
	{
		startX = x;
		startY = y;
		return true;
	}

	public boolean mouseDrag(Event e, int x, int y)
	{
		endX = x;
		endY = y;
		repaint();
		return true;
	}

	public void update(Graphics g)
	{
		paint(g);
	}

}






