// Java1211.java
// Train case study, Stage #5
// This program concludes by adding the <Train> class
// A train has train cars.  The first train car is the locomotive.
// The last train car is the Caboose.
// This program now combines inheritance with composition.


import java.awt.*;
import java.applet.*;


public class Java1211 extends Applet
{
	public void paint(Graphics g)
	{
		Train t = new Train(55,250);
		t.drawTrain(g);
	}
}


class Train
{
	private Locomotive loc;
	private TrainCar tc1;
	private TrainCar tc2;
	private TrainCar tc3;
	private Caboose cab;
	private int tlX;
	private int tlY;

	public Train(int tlX, int tlY)
	{
		this.tlX = tlX;
		this.tlY = tlY;
		loc = new Locomotive(Color.red,tlX,tlY);
		tc1 = new TrainCar(Color.green,tlX+160,tlY);
		tc2 = new TrainCar(Color.yellow,tlX+320,tlY);
		tc3 = new TrainCar(Color.magenta,tlX+480,tlY);
		cab = new Caboose(Color.blue,tlX+640,tlY);
	}

	public void drawTrain(Graphics g)
	{
		loc.drawCar(g);
		tc1.drawCar(g);
		tc2.drawCar(g);
		tc3.drawCar(g);
		cab.drawCar(g);
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

	public void drawCar(Graphics g)
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

	public void drawCar(Graphics g)
	{
		super.drawCar(g);
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


class Caboose extends TrainCar
{
	public Caboose(Color cc, int xP, int yP)
	{
		super(cc,xP,yP);
	}

	public void drawCar(Graphics g)
	{
		super.drawCar(g);
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
	    g.setColor(carColor);
	    g.fillRect(xPos+30,yPos-30,90,30);
	    g.setColor(Color.black);
	    g.fillRect(xPos+25,yPos-30,100,5);
	}
}

