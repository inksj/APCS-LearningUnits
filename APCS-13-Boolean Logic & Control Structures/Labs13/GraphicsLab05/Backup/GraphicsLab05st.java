// GraphicsLab05st.java
// This is the student, starting version of the GraphicsLab05 assignment.


import java.awt.*;
import java.applet.*;
import java.util.*;


public class GraphicsLab05st extends Applet
{
	public void paint(Graphics g)
	{
		int circleCount = 40;
		Circles circles = new Circles(g,circleCount);
	}
}


class Circles
{
	private int circleCount;
	private Random rnd;
	private Color randomColor;
	private int colorRow;

	private int redCount, greenCount, blueCount;

	public Circles(Graphics g,int c)
	{
		rnd = new Random(12345);
		circleCount = c;
		redCount = 1;
		greenCount = 1;
		blueCount = 1;
		drawSquares(g);
		for (int k = 1; k <= circleCount; k++)
			drawRandomCircle(g);
	}

	public void drawSquares(Graphics g)
	{
		g.setColor(Color.red);
		g.fillRect(10,100,30,30);
		g.setColor(Color.green);
		g.fillRect(10,250,30,30);
		g.setColor(Color.blue);
		g.fillRect(10,400,30,30);
	}

	public void drawRandomCircle(Graphics g)
	{

	}

	public void getRandomColor()
	{

	}
}


