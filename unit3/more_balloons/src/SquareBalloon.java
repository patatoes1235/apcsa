/**
 * Represents a balloon in the BalloonDraw program.
 * Author: Willy Bolly
 * Ver 1.0 Created 12/31/17
 */

import java.awt.*;

public class SquareBalloon extends Balloon {
	/**
	 * Constructs a balloon with the center at (0, 0),
	 * radius 50, and blue color
	 */
	public SquareBalloon()
	{
		super();
	}

	/**
	 * Constructs a balloon with a given center, radius and color
	 * @param x x-coordinate of the center
	 * @param y y-coordinate of the center
	 * @param r radius of the balloon
	 * @param c color of the balloon
	 */
	public SquareBalloon(int x, int y, int r, Color c)
	{
		super(x,y,r,c);
	}

	public double distance(int x, int y)
	{
		double dx = Math.abs(x - getX());
		double dy = Math.abs(y - getY());
		return Math.max(dx, dy);
	}

	public void draw(Graphics g, boolean makeItFilled)
	{
		int xCenter = getX();
		int yCenter = getY();
		int radius = getRadius();

		g.setColor(getColor());
		if (makeItFilled)
			g.fillRect(xCenter - radius,
					yCenter - radius, 2*radius, 2*radius);
		else
			g.drawRect(xCenter - radius,
					yCenter - radius, 2*radius, 2*radius);
	}
}