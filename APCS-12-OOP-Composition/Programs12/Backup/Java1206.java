// Java1206.java
// Jack O'lantern Case Study, Stage #4
// This program demonstrates both inheritance and composition.


import java.awt.*;
import java.applet.*;


public class Java1206 extends Applet
{
	public void paint(Graphics g)
	{
		JackOLantern jack = new JackOLantern(g);
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


class Face
{
	public Face(Graphics g)
	{
		drawFace(g);
	}

	public void drawFace(Graphics g)
	{
		// Draw eyes
		g.setColor(Color.black);
		g.fillOval(200,200,100,100);
		g.fillOval(500,200,100,100);

		// Draw nose
		Polygon nose = new Polygon();
		nose.addPoint(350,340);
		nose.addPoint(450,340);
		nose.addPoint(400,270);
		g.fillPolygon(nose);

		// Draw mouth
		Polygon mouth = new Polygon();
		mouth.addPoint(300,400);
		mouth.addPoint(200,350);
		mouth.addPoint(250,450);
		mouth.addPoint(400,500);
		mouth.addPoint(550,450);
		mouth.addPoint(600,350);
		mouth.addPoint(500,400);
		g.fillPolygon(mouth);
	}
}


class JackOLantern extends Pumpkin
{
	private Face f;

	public JackOLantern(Graphics g)
	{
		super(g);
		f = new Face(g);
	}
}