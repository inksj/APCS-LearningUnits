// JackOLantern.java
// The <JackOLantern> class is used in Java1206.java.
// This class uses both inheritance and composition.


import java.awt.*;
import java.applet.*;


public class JackOLantern extends Pumpkin
{
	private Face f;

	public JackOLantern(Graphics g)
	{
		super(g);
		f = new Face(g);
	}
}

