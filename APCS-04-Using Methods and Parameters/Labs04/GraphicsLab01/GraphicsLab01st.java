// GraphicsLab01st.java
// The AWT Graphics Program
// This is the student, starting version of Graphics Lab 01.


import java.awt.*;
import java.applet.*;


public class GraphicsLab01st extends Applet
{

	public void paint(Graphics g)
	{
		// DRAW CUBE
	g.drawRect(50,25,50,50);
	g.drawRect(75,50,50,50);
	g.drawLine(50,25,75,50);	
	g.drawLine(50,75,75,100);
	g.drawLine(100,25,125,50);
	g.drawLine(100,75,125,100);

		// DRAW SPHERE

	g.drawOval(325,25,200,200);
	g.drawOval(325,50,200,150);
	g.drawOval(325,75,200,100);
	g.drawOval(325,100,200,50);
	g.drawOval(350,25,150,200);
	g.drawOval(375,25,100,200);
	g.drawOval(400,25,50,200);
		// DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
		g.drawOval(650,0,150,150);
		g.drawLine(650,75,725,150);
		g.drawLine(725,150,780,25);
		g.drawLine(650,75,780,25);
		g.drawOval(677,53,71,71);
	


		// DRAW APCS
	g.fillRect(75,300,100,25);
	g.fillRect(75,325,25,150);
	g.fillRect(150,325,25,150);
	g.fillRect(100,375,75,25);
	
	//p
	
	g.fillRect(200,300,25,175);
	g.fillRect(225,300,75,25);
	g.fillRect(225,375,75,25);
	g.fillRect(275,325,25,50);
	
	//c
	g.fillRect(325,300,25,175);
	g.fillRect(350,300,75,25);
	g.fillRect(350,450,75,25);

	//s
	g.fillRect(450,300,100,25);
	g.fillRect(450,300,25,100);
	g.fillRect(450,450,100,25);
	g.fillRect(475,375,75,25);
	g.fillRect(525,400,25,75);



		// DRAW PACMEN FLOWER
		g.fillArc(800,250,100,100,135,270);//top
		
		g.fillArc(730,300,100,100,220,270);//left side

		g.fillArc(800,370,100,100,310,270);
		
		g.fillArc(870,315,100,100,45,270);
		
		g.drawString("APCS is awesome!",200,550);
		 g.drawString("APCS is awesome!",200,750);

	}

}


