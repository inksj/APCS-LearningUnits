// GraphicsLab02st.java
// This is the student, starting version of the GraphicsLab02 assignment.


import java.awt.*;
import java.applet.*;


public class GraphicsLab02st extends Applet
{
	public void paint(Graphics g)
	{
		int width = 980;
		int height = 630;
		int x1 = 10;
		int y1 = 640;
		int x2 = 990;
		int y2 = 640;
	
		g.drawRect(10,10,width,height);
		//Lower Right Side Loop
		for ( int a = 0; a<= 70; a+=1)
		{g.setColor(Color.blue);
			g.drawLine(x1,y1,x2,y2);
			x1+=14;
			y2-=9;	
		}
		
		 x1 = 10;
		 y1 = 640;
		 x2 = 990;
		 y2 = 640;
	//Lower Left Side Loop
		for (int a = 0; a<=70; a+=1 )
		{	g.setColor(Color.green);
			g.drawLine(x1,y1,x2,y2);
			x2-=14;
			y1-=9;	
		}
		
		 x1 = 10;
		 y1 = 10;
		 x2 = 990;
		 y2 = 10;
	//Upper Right Side Loop	 	
		 	for (int a = 0; a<=70; a+=1 )
		{	g.setColor(Color.red);
			g.drawLine(x1,y1,x2,y2);
			x1+=14;
			y2+=9;	
		}
		 x1 = 10;
		 y1 = 10;
		 x2 = 990;
		 y2 = 10;
	//Upper Left Side Loop 	
		 	for (int a = 0; a<=70; a+=1 )
		{	g.setColor(Color.orange);
			g.drawLine(x1,y1,x2,y2);
		x2-=14;
		y1+=9;

	}
		 

}
}

