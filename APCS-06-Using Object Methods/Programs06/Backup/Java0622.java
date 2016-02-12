// Java0622.java
// This program draws three squares with user-defined <Color> objects.


import java.awt.*;
import java.applet.*;


public class Java0622 extends Applet
{
	public void paint(Graphics g)
	{
		Color myRed = new Color(255,0,64);
		Color myGreen = new Color(16,255,16);
		Color myBlue = new Color(64,64,255);
		Color myBrown = new Color(150,100,15);


		g.setColor(myRed);
		g.fillRect(20,100,100,100);
		g.setColor(myGreen);
		g.fillRect(140,100,100,100);
		g.setColor(myBlue);
		g.fillRect(260,100,100,100);
		g.setColor(myBrown);
		g.fillRect(380,100,100,100);

	}
}

