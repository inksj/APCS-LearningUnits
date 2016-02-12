// Java0524.java
// This program shows how a control structure can be used with graphics.
// This program draws diagonal lines, because x1, y1, y2, y2, all four change.


import java.awt.*;
import java.applet.*;


public class Java0524 extends Applet
{
	public void paint(Graphics g)
	{
		int x1 = 50;
		int x2 = 200;
		int y1 = 50;
		int y2 = 300;
		for (int k = 1; k < 50; k++)
		{
			g.drawLine(x1,y1,x2,y2);
			x1 += 10;
			x2 += 10;
			y1 += 5;
			y2 += 5;
		}
	}
}

