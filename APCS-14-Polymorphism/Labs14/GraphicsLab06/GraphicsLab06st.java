// GraphicsLab06st.java
// The Polymorphic Graphics Shapes Program
// Student, starting Version


import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;


public class GraphicsLab06st
{
	public static void main(String args[])
	{
		Windows win = new Windows();
		win.setSize(800,600);
		win.addWindowListener(new WindowAdapter() {public void
		windowClosing(WindowEvent e) {System.exit(0);}});
		win.show();
	}
}


class Windows extends Frame
{

	public void paint(Graphics g)
	{
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Square());
		shapes.add(new Triangle());
		shapes.add(new Octagon());
		shapes.add(new Circle());

		drawGrid(g);

		for(Shape shape: shapes)
		{
			shape.drawShape(g);
			shape.displayName(g);
			shape.displayNumSides(g);
		}
	}

	public void drawGrid(Graphics g)
	{
		g.drawLine(0,300,800,300);
		g.drawLine(400,0,400,600);
	}
}

abstract interface Shape
{
	public abstract void drawShape( Graphics g);
		public abstract void displayName( Graphics g);
			public abstract void displayNumSides( Graphics g);
}

abstract class AbstractShape implements Shape
{	 protected int numSides;
	protected String shapeName;
	protected int titleX, titleY, messageX, messageY;

	  
	  
	  
	  public void displayName(Graphics g)
	  {
	  	g.drawString(shapeName,titleX,titleY);
	  	}
	  
	  
	 public void displayNumSides(Graphics g)
	 	{ 
	 	   g.drawString("A " + shapeName + " has " + numSides + " sides.", messageX,messageY);
		 }
}
	 	
	 class Square extends AbstractShape
	 	{ 
	 		public Square()
	 			
	 		{  numSides = 4;
         	    shapeName = "Square";
        		titleX =50 ;
        		titleY = 40;
        		messageX = 100;
       			messageY = 250;
	 		}
        			public void drawShape(Graphics g)
        				{
        				g.fillRect(100,50,150,150);
        				}
        				
        	
	 	}
	 	
	 		
	 
	 
	 	class Octagon extends AbstractShape
	 	{		
	 		public Octagon()
	 		{
	 			numSides = 8;
         	    shapeName = "Octagon";
        		titleX = 100;
        		titleY = 325;
        		messageX = 200;
       			messageY = 550;
	 			
	 		}
	 			public void drawShape(Graphics g)
	 			{
	 				  Polygon Oct = new Polygon();
         				 Oct.addPoint(150,350);
       				   	 Oct.addPoint(100,400);
         				 Oct.addPoint(100,450);
         				 Oct.addPoint(150,500);
          
         				 Oct.addPoint(200,500);
         				 Oct.addPoint(250,450);
         				 Oct.addPoint(250,400);
          		         Oct.addPoint(200,350);
          
        				  g.fillPolygon(Oct);
	 				
	 			}
	 			
	 	}		
	 			class Circle extends AbstractShape
	 				{
	 					public Circle()
	 						
	 						{	numSides = 0;
         						shapeName = "Circle";
         						titleX=475;
         						titleY=350;
         						messageX = 500;
         						messageY = 550;
	 						}
	 						
	 					public void drawShape(Graphics g)
	 					{
	 						g.fillOval(500,350,150,150);
	 						}
	 				
	 				}
	 				
	 			
	 				class Triangle extends AbstractShape 						
	 						{
	 							   public Triangle()
   									 {
        							 numSides = 3;
         							shapeName = "Triangle";
         							titleX=475;
         							titleY=50;
        							 messageX = 500;
         							messageY = 250;
   						 			 }
         
  								  public void drawShape(Graphics g)
  							  {
      			  					 Polygon tri = new Polygon();
       							     tri.addPoint(600,50);
         							 tri.addPoint(500,200);
        						     tri.addPoint(700,200);
        							  g.fillPolygon(tri);

  							  }
	 						}
	