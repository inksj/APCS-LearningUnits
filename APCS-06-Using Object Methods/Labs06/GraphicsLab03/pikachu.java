
import java.awt.*;
import java.applet.*;
import java.util.*; 
																

public class pikachu extends Applet
{
	
	public void paint(Graphics g) 	
	{
		// Draw Grid
		g.drawRect(0,0,780,580);
		g.drawLine(400,0,400,580);
		g.drawLine(0,300,780,300);
		
		Random rndInt = new Random(1234);
			
		
		// Draw Random Squares

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
			int x3 = rndInt.nextInt(385);
		int y3 = rndInt.nextInt(275);
		int red = rndInt.nextInt(255);
		int green = rndInt.nextInt(255);
		int blue = rndInt.nextInt(255);
		g.setColor(new Color(red,green,blue));
		g.drawOval(x3,y3+200,20,20);


		}
	}
}
	
	
	
	
	
	
	