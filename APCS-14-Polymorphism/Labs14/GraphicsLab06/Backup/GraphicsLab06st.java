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
