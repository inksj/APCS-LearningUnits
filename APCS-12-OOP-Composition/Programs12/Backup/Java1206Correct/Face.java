// Face.java
// The <Face> class is used in Java1206.java.


import java.awt.*;


public class Face
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