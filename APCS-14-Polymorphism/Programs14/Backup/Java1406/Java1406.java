// Java1406.java
// This program was the final stage of the <Train> case study.
// It demonstrates the use of inheritance and composition.
// Every class is placed in its own file.


import java.awt.*;
import java.applet.*;


public class Java1406 extends Applet
{
	public void paint(Graphics g)
	{
		Train t = new Train(55,250);
		t.drawTrain(g);
	}
}


