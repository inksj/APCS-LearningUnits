// Java0620.java
// This program shows how you can create your own display colors by
// creating color objects with different (Red, Green, Blue) values.
// RGB values are in the [0..255] range.


import java.awt.*;
import java.applet.*;


public class Java0620 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(new Color(255,0,255));
		g.fillRect(0,0,800,200);

		g.setColor(new Color(0,255,255));
		g.fillRect(0,200,800,200);

		g.setColor(new Color(100,100,100));
		g.fillRect(0,400,800,200);
	}
}

