// This program draws a Fibonnaci Tree.
// The value of root of the tree is specified by the attribite <number>.


import java.awt.*;
import java.applet.*;

public class FiboTree extends Applet
{
	static int number = 8;

	public void paint(Graphics g)
	{
		g.setFont(new Font("Arial",Font.BOLD,28));
		drawTree(g,10,getWidth(),number,0,50);
	}

	public static int drawTree(Graphics g, int left, int right, int n, int x1, int y1)
	{
		int x2 = (left + right) / 2;
		int y2 = y1 + 70;
		if (n < number)
		{
			g.drawLine(x1,y1,x2,y2);
			g.drawString(String.valueOf(n),x2-10,y2+10);
		}
		else
			g.drawString(String.valueOf(n),x2-10,y2);

		if (n == 0 || n == 1)
			return n;
		else
			return drawTree(g,left,x2,n-1,x2,y2) + drawTree(g,x2,right,n-2,x2,y2);
	}
}
