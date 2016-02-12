// Java1207.java
// Train case study, Stage #1
// The first stage starts with the <TrainCar> class.


import java.awt.*;
import java.applet.*;


public class Java1207 extends Applet
{
	public void paint(Graphics g)
	{
		TrainCar tc = new TrainCar();
		tc.drawTrainCar(g);
	}
}


class TrainCar
{
	private Color carColor;

	public TrainCar()
	{
		carColor = Color.blue;
	}

	public void drawTrainCar(Graphics g)
	{
		g.setColor(carColor);
		g.fillRect(325,250,150,100);
		g.setColor(Color.black);
		g.fillOval(330,325,50,50);
		g.fillOval(420,325,50,50);
	}
}
