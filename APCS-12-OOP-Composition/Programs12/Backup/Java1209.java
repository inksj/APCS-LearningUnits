// Java1209.java
// Train case study, Stage #3
// This program adds the <Locomotive> class,
// using inheritance, since a locomotive is-a traincar.


import java.awt.*;
import java.applet.*;


public class Java1209 extends Applet
{
	public void paint(Graphics g)
	{
		Locomotive loc = new Locomotive(Color.blue,70,250);
		loc.drawTrainCar(g);
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


class Locomotive extends TrainCar
{
	public Locomotive(Color cc, int xP, int yP)
	{
		super(cc,xP,yP);
	}

	public void drawTrainCar(Graphics g)
	{
		super.drawTrainCar(g);
		drawScoop(g);
		drawFunnel(g);
	}

	private void drawScoop(Graphics g)
	{
		Polygon scoop = new Polygon();
		scoop.addPoint(xPos,yPos+50);
		scoop.addPoint(xPos,yPos+100);
		scoop.addPoint(xPos-50,yPos+100);
	    g.setColor(Color.black);
	    g.fillPolygon(scoop);
	}

	private void drawFunnel(Graphics g)
	{
		Polygon funnel = new Polygon();
		funnel.addPoint(xPos+20,yPos);
		funnel.addPoint(xPos+20,yPos-30);
		funnel.addPoint(xPos,yPos-50);
		funnel.addPoint(xPos,yPos-60);
		funnel.addPoint(xPos+60,yPos-60);
		funnel.addPoint(xPos+60,yPos-50);
		funnel.addPoint(xPos+40,yPos-30);
		funnel.addPoint(xPos+40,yPos);
	    g.setColor(Color.black);
	    g.fillPolygon(funnel);
	}
}

