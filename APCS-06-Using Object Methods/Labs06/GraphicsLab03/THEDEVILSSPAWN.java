// GraphicsLab03st.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*; 
																

public class GraphicsLab03st extends Applet
{
	
	public void paint(Graphics g) 	
	{
		// Draw Grid
		g.drawRect(0,0,780,580);
		g.drawLine(400,0,400,580);
		g.drawLine(0,300,780,300);
		
		Random rnd = new Random(1234);
		
		


				
		
		// Draw Random Squares

Random rndInt = new Random(12345);
		for (int k = 1; k <= 1000; k++)
		{
			int x = rndInt.nextInt(385);
			int y = rndInt.nextInt(275);
			int red = rndInt.nextInt(120);
			int green = rndInt.nextInt(120);
			int blue = rndInt.nextInt(120);
			g.setColor(new Color(red,green,blue));
			g.fillRect(x,y,15,15);
		}
		// Draw Random Lines

		for (int k = 1; k <= 1000; k++)
		{
			int x1 = rndInt.nextInt(350);
			int y1 = rndInt.nextInt(300);
			int x2 = rndInt.nextInt(370);
			int y2 = rndInt.nextInt(300);
			g.drawLine(x1+400,y1,x2+400,y2);
		}


		
		// Draw Random Circles
for (int k = 1; k <= 1000; k++)
		{
			int x = rndInt.nextInt(385);
			int y = rndInt.nextInt(275);
			int red = rndInt.nextInt(256);
			int green = rndInt.nextInt(256);
			int blue = rndInt.nextInt(256);
			g.setColor(new Color(red,green,blue));
				g.fillOval(325,25,200,200);;
		}



		
		// Draw 3-D Box
	
	
	
	
	
	}
		
}



    
 