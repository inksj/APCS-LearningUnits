// GraphicsLab08st.java
// The Paint Brush Program
// Student Version


// The Student version starts with just one color (red) and all that can be drawn is one pixel at a time.



import java.applet.Applet;
import java.awt.*;
import java.util.Random;

public class GraphicsLab08st extends Applet
{
	Rectangle red;
	int numColor, numTool, xClick, yClick;

	public void init()
	{
		numColor = 1;
		numTool = 1;

		red = new Rectangle(5,5,42,42);


	}

	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillRect(5,5,42,42);




        switch (numColor)
        {
            case 1 : g.setColor(Color.red);
                     break;


        }


        switch (numTool)
        {
            case 1 : g.fillRect(xClick,yClick,2,2);
                     break;


        }
	}

	public boolean mouseDown(Event e, int x, int y)
	{
		if(red.inside(x,y))
		{
			numColor = 1;
		}

		xClick = x;
		yClick = y;
	    repaint();
		return true;
	}
}






