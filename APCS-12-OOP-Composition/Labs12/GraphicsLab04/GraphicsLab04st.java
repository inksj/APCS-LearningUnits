// GraphicsLab04st.java

// The GraphicsLab04 graded assignment is open ended.
// There is no provided student version for starting, nor are there
// any files with solutions for the different point versions.

// Check the Lab assignment document for additional details.

import java.awt.*;
import java.applet.*;

public class GraphicsLab04st extends Applet
{

public void paint(Graphics g) 

{ 

Texas texas = new Texas(g); 

}

} 



class Texas

{

private Red red; 

public Texas(Graphics g) 

{ 

drawTexas(g);

red = new Red(g); 

} 

public void drawTexas(Graphics g)//Draws the black background

{ 

			g.setColor(Color.black);
			int x[] = {25,25,75,75,150,150,125,125,325,325,300,300,375,375,425,425,25};
			int y[] = {100,225,225,300,300,450,450,550,550,450,450,300,300,225,225,100,100};
			g.drawPolygon(x,y,17);
			g.fillPolygon(x,y,17);

}

}

class Red

{

public Red(Graphics g) 

{

drawRed(g); 

} 

public void drawRed(Graphics g) 

{

g.setColor(Color.black);
	g.fillRect(100,425,250,150);
// Draw Red

Polygon Red = new Polygon(); 

	g.setColor(Color.red);
			int x[] = {50,50,100,100,175,175,150,150,300,300,275,275,350,350,400,400,50};
			int y[] = {125,200,200,275,275,475,475,525,525,475,475,275,275,200,200,125,125};
			g.drawPolygon(x,y,17);
			g.fillPolygon(x,y,17);
			g.fillRect(125,450,200,100);
// Draw bLACK INSIDES
g.setColor(Color.black);
			g.fillRect(100,175,75,50);
			g.fillRect(276,175,75,50);
			g.fillRect(275,275,25,175);
	
	Polygon InsideBlack = new Polygon();	
g.setColor(Color.black);
			int x4[] = {50,100,225,175,50};
			int y4[] = {200,150,150,200,200};
			g.drawPolygon(x4,y4,5);
			g.fillPolygon(x4,y4,5);
				
			
			
	Polygon InsideBlack2 = new Polygon();
			
		g.setColor(Color.black);
			int x3[] = {225,225,350,350,375,225};
			int y3[] = {150,225,225,175,150,150};
			g.drawPolygon(x3,y3,6);
			g.fillPolygon(x3,y3,6);
			
				Polygon InsideBlack3 = new Polygon();
			
		g.setColor(Color.black);
			int x5[] = {375,400,400,375,375};
			int y5[] = {150,125,200,200,150};
			g.drawPolygon(x5,y5,5);
			g.fillPolygon(x5,y5,5);
			
			Polygon InsideBlack4 = new Polygon();
		g.setColor(Color.black);
			int x6[] = {100,125,225,200,100};
			int y6[] = {275,250,250,275,275};
			g.drawPolygon(x6,y6,5);
			g.fillPolygon(x6,y6,5);
			
					Polygon InsideBlack5 = new Polygon();
		g.setColor(Color.black);
			int x7[] = {225,350,325,275,275,250,225,225};
			int y7[] = {250,250,275,275,475,475,500,250};
						g.drawPolygon(x7,y7,8);
			g.fillPolygon(x7,y7,8);
			
			
	Polygon InsideBlack6 = new Polygon();
		g.setColor(Color.black);
			int x8[] = {150,175,275,300,300,150,};
			int y8[] = {525,500,500,475,525,525};
						g.drawPolygon(x8,y8,6);
			g.fillPolygon(x8,y8,6);
			
			
				Polygon InsideBlack7 = new Polygon();
		g.setColor(Color.black);
			int x9[] = {125,150,300,300,325,325,125};
			int y9[] = {550,525,525,475,450,550,550};
						g.drawPolygon(x9,y9,7);
			g.fillPolygon(x9,y9,7);
			

//Draw White Lines
	g.setColor(Color.white);
			int x1[] = {50,50,100,100,175,175,150,150,300,300,275,275,350,350,400,400,50};
			int y1[] = {125,200,200,275,275,475,475,525,525,475,475,275,275,200,200,125,125};
			g.drawPolygon(x1,y1,17);
			g.drawLine(125,450,175,450);
				g.drawLine(275,450,325,450);
			g.drawLine(125,450,125,550);
			g.drawLine(125,550,325,550);	
			g.drawLine(325,550,325,450);		
			g.drawRect(100,175,75,50);
			g.drawRect(275,175,75,50);
			g.drawLine(175,275,200,275);
			g.drawLine(200,275,200,475);
			g.drawLine(200,475,175,475);
			g.drawLine(250,275,275,275);
			g.drawLine(250,275,250,475);
			g.drawLine(250,475,275,475);
			g.drawLine(175,225,275,225);

	
			
}

}

class Tech extends Texas

{ 

private Red r;

public Tech(Graphics g)

{ 

super(g);

r = new Red(g);

}

}

