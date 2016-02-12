// Train.java
// This class is used by the <Java1407> program.


import java.awt.*;
import java.util.*;


public class Train
{
	private ArrayList<TrainCar> trainCars;
	private int tlX;
	private int tlY;

	public Train(int tlX, int tlY)
	{
		trainCars = new ArrayList<TrainCar>();
		this.tlX = tlX;
		this.tlY = tlY;
		trainCars.add(new Locomotive(Color.red,tlX,tlY));
		trainCars.add(new TrainCar(Color.green,tlX+160,tlY));
		trainCars.add(new TrainCar(Color.yellow,tlX+320,tlY));
		trainCars.add(new TrainCar(Color.magenta,tlX+480,tlY));
		trainCars.add(new Caboose(Color.blue,tlX+640,tlY));
	}

	public void drawTrain(Graphics g)
	{
		for (TrainCar tc: trainCars)
			tc.drawCar(g);
	}
}

