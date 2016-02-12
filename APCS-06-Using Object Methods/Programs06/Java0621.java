// Java0621.java
// This program shows all the shades of Red, Green and Blue using the
// <setColor> method with new RGB parameter values.


import java.awt.*;
import java.applet.*;


public class Java0621 extends Applet
{
	public void paint(Graphics g)
	{
		for (int red = 0; red <= 255; red++)
		{
			g.setColor(new Color(red,0,0));
			g.drawLine(red,0,red,600);
		}
		for (int green = 0; green <= 255; green++)
		{
			g.setColor(new Color(0,green,0));
			g.drawLine(green+255,0,green+255,600);
		}
		for (int blue = 0; blue <= 255;blue++)
		{
			g.setColor(new Color(0,0,blue));
			g.drawLine(blue+510,0,blue+510,600);
		}
	}
}

