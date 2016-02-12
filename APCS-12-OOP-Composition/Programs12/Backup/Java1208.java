// Java1208.java
// Train case study, Stage #2
// This program improves the <TrainCar> class by constructing
// new objects with a specified color and a specified location.


import java.awt.*;
import java.applet.*;


public class Java1208 extends Applet
{
	public void paint(Graphics g)
	{
		TrainCar tc1 = new TrainCar(Color.blue,70,250);
		TrainCar tc2 = new TrainCar(Color.green,240,250);
		TrainCar tc3 = new TrainCar(Color.yellow,410,250);
		TrainCar tc4 = new TrainCar(Color.magenta,580,250);
		tc1.drawTrainCar(g);
		tc2.drawTrainCar(g);
		tc3.drawTrainCar(g);
		tc4.drawTrainCar(g);
	}
}


class TrainCar
{
	private Color carColor;
	private int xPos;
	private int yPos;

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

