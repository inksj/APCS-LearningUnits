// Java1407.java
// This program uses "polymorphism" to display the train.


import java.awt.*;
import java.applet.*;


public class Java1407 extends Applet
{
	public void paint(Graphics g)
	{
		Train t = new Train(55,250);
		t.drawTrain(g);
	}
}

