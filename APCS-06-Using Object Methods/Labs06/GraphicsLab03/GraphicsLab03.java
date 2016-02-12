
import java.awt.*;
import java.applet.*;
import java.util.*; 
																

public class GraphicsLab03 extends Applet
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
			int red = rndInt.nextInt(256);
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
			int red = rndInt.nextInt(100);
			int green = rndInt.nextInt(100);
			int blue = rndInt.nextInt(100);
			g.setColor(new Color ( red,green,blue ));
		}

		// Draw Random Circles
for (int k = 1; k <= 1000; k++)
		{
			int x3 = rndInt.nextInt(385);
		int y3 = rndInt.nextInt(272);
		int red = rndInt.nextInt(240);
		int green = rndInt.nextInt(255);
		int blue = rndInt.nextInt(255);
		g.setColor(new Color(red,green,blue));
		g.drawOval(x3,y3+300,11,11);
		}
		// Draw 3-D Box
	{	g.setColor(Color.blue);
			int x[] = {575,675,675,575};
			int y[] = {425,425,525,525};
			g.drawPolygon(x,y,4);
			g.fillPolygon(x,y,4);
		}
		{	g.setColor(Color.yellow);
			int x1[] = {525,575,575,525};
			int y1[] = {375,425,525,475};
			g.drawPolygon(x1,y1,4);
			g.fillPolygon(x1,y1,4);
		}
		{	g.setColor(Color.green);	
			int x2[] = {525,625,625,575};
			int y2[] = {375,375,425,425};
			g.drawPolygon(x2,y2,4);
			g.fillPolygon(x2,y2,4);
		}	
		{	g.setColor(Color.red);	
			int x3[] = {625,625,675};
			int y3[] = {375,425,425};
			g.drawPolygon(x3,y3,3);
			g.fillPolygon(x3,y3,3);
		}	
	

		}
	}

	
	
	
	
	
	
	