// Java1203.java
// Jack O'lantern Case Study, Stage #1
// This program draws a pumpkin.
// There is neither inheritance nor composition present.


import java.awt.*;
import java.applet.*;


public class Java1203 extends Applet
{
	public void paint(Graphics g)
	{
		Pumpkin p = new Pumpkin(g);
	}
}


class Pumpkin
{
	public Pumpkin(Graphics g)
	{
		drawPumpkin(g);
	}

	public void drawPumpkin(Graphics g)
	{
		g.setColor(Color.orange);
		g.fillOval(100,100,600,450);
		g.setColor(new Color(50,200,50));
		g.fillRect(390,30,20,80);
	}
}

