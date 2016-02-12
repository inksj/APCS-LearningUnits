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
int x,y; 
getRandomColor(); 
g.setColor( randomColor ); 



	if ( colorRow == 0 )
	
		{ 	y = 100; 
			x = redCount * 30 + 15; 
			redCount++; 
		}
		

	 else if ( colorRow == 1 ) 
	 	{ 
			y = 250; 
			x = greenCount * 30 + 15; 
			greenCount++; 
		}
		 else
			 { 
				y = 400; 
				x = blueCount * 30 + 15; 
				blueCount++; 
			 }
	

			  
g.fillOval(x, y, 30, 30); //draw a solid circle 
} 

public void getRandomColor() 
{ 

	int red = rnd.nextInt(256); 
	int green = rnd.nextInt(256); 
	int blue = rnd.nextInt(256); 

	randomColor = new Color(red, green, blue); 

 
	if (red >= green && red >= blue) 
		{ 
			colorRow = 0;	
		} 
	else if (green >= red && green >= blue) 
		{ 
			colorRow = 1; 
		} 

	else 
		colorRow = 2; //blue dominant, 3rd row 
}
}



