// Java0626.java
// This program combines random squares with random color objects.


import java.awt.*;
import java.applet.*;
import java.util.Random;


public class Java0626 extends Applet
{
	public void paint(Graphics g)
	{
		Random rndInt = new Random(12345);
		for (int k = 1; k <= 1000; k++)
		{
			int x = rndInt.nextInt(800);
			int y = rndInt.nextInt(600);
			int red = rndInt.nextInt(256);
			int green = rndInt.nextInt(256);
			int blue = rndInt.nextInt(256);
			g.setColor(new Color(red,green,blue));
			g.fillRect(x,y,50,50);
		}
	}
}

