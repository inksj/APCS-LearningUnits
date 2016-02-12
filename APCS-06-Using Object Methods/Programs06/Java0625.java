// Java0625.java
// This program displays 1000 random lines.


import java.awt.*;
import java.applet.*;
import java.util.Random;


public class Java0625 extends Applet
{
	public void paint(Graphics g)
	{
		Random rndInt = new Random(12345);
		for (int k = 1; k <= 1000; k++)
		{
			int x1 = rndInt.nextInt(800);
			int y1 = rndInt.nextInt(600);
			int x2 = rndInt.nextInt(800);
			int y2 = rndInt.nextInt(600);
			g.drawLine(x1,y1,x2,y2);
		}
	}
}

