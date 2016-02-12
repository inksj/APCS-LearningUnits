// Java1210.java
// Train case study, Stage #4
// This program adds the <Caboose> class,
// using inheritance, since a caboose "is-a" traincar.


import java.awt.*;
import java.applet.*;


public class Java1210 extends Applet
{
	public void paint(Graphics g)
	{
		Caboose cab = new Caboose(Color.red,580,250);
		cab.drawTrainCar(g);
	}
}


class TrainCar
{
	protected Color carColor;
	protected int xPos;
	protected int yPos;

	public TrainCar(Color cC, int xP, int yP)
	{
		carColor = cC;
		xPos = xP;
		yPos = yP;
	}

	public void drawTrainCar(Graphics g)
	{
		g.setColor(carColor);
		g.fillRect(xPos,yPos,150,100);
		g.setColor(Color.black);
		g.fillOval(xPos+5,yPos+75,50,50);
		g.fillOval(xPos+95,yPos+75,50,50);
	}
}


class Caboose extends TrainCar
{
	public Caboose(Color cc, int xP, int yP)
	{
		super(cc,xP,yP);
	}

	public void drawTrainCar(Graphics g)
	{
		super.drawTrainCar(g);
		drawWindows(g);
		drawTop(g);
	}

	private void drawWindows(Graphics g)
	{
	    g.setColor(Color.white);
	    g.fillRect(xPos+30,yPos+30,30,30);
	    g.fillRect(xPos+90,yPos+30,30,30);
	}

	private void drawTop(Graphics g)
	{
	    g.setColor(Color.red);
	    g.fillRect(xPos+30,yPos-30,90,30);
	    g.setColor(Color.black);
	    g.fillRect(xPos+25,yPos-30,100,5);
	}
}

