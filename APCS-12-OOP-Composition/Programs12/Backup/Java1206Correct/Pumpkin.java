// Pumpkin.java
// The <Pumpkin> class is used in Java1206.java.


import java.awt.*;


public class Pumpkin
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

