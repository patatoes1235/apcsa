/**
 * Represents a balloon in the BalloonDraw program.
 * Author: Willy Bolly
 * Ver 1.0 Created 12/31/17
 */

import java.awt.*;

public class OvalBalloon extends Balloon {

	public OvalBalloon()
	{
		super();
	}

	public double distance(int x, int y)
	{
		double dx = 2*(x - getX());
		double dy = y - getY();
		return Math.sqrt(dx*dx + dy*dy);
	}


	public OvalBalloon(int x, int y, int r, Color c)
	{
		super(x,y,r,c);
	}

	public void draw(Graphics g, boolean makeItFilled)
	{
		int xCenter = getX();
		int yCenter = getY();
		int radius = getRadius();

		g.setColor(getColor());
		if (makeItFilled)
			g.fillOval(xCenter - radius,
					yCenter - 2*radius, 2*radius, 4*radius);
		else
			g.drawOval(xCenter - radius,
					yCenter - 2*radius, 2*radius, 4*radius);
	}
}