// Chapter 5 Question 27

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rainbow extends JPanel
{
	private final Color skyColor = Color.CYAN;

	public Rainbow()
	{
		setBackground(skyColor);
	}

	// Draws the rainbow.
	public void paintComponent(Graphics g)
	{
		System.out.println("paintComponentCalled");
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();
		int xCenter = width / 2;
		int yCenter = 3 * height / 4;
		int largeRadius = width/4;
		g.setColor(Color.RED);

		// Draw the large semicircle:
		g.fillArc(xCenter - largeRadius/2, yCenter -largeRadius/2, largeRadius, largeRadius, 0, 180);

		// Declare and initialize the radii of the small and medium
		// semicircles and draw them:
		int smallRadius = height /4;
		int medRadius = (int)Math.sqrt(smallRadius * largeRadius);

		g.setColor(Color.GREEN);
		g.fillArc(xCenter- medRadius/2, yCenter - medRadius/2, medRadius, medRadius, 0, 180);
		g.setColor(Color.MAGENTA);
		g.fillArc(xCenter-smallRadius/2, yCenter-smallRadius/2, smallRadius, smallRadius, 0, 180);
		// Calculate the radius of the innermost (sky-color) semicircle
		// so that the width of the middle (green) ring is the
		// arithmetic mean of the widths of the red and magenta rings:
		int skyRadius = largeRadius - 3*medRadius + 3*smallRadius;
		System.out.println(skyRadius);

		// Draw the sky-color semicircle:
		g.setColor(skyColor);
		g.fillArc(xCenter-skyRadius/2, yCenter-skyRadius/2, skyRadius, skyRadius, 0, 180);
	}

	public static void main(String[] args)
	{
		JFrame w = new JFrame("Rainbow");
		w.setBounds(300, 300, 300, 200);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = w.getContentPane();
		c.add(new Rainbow());
		w.setVisible(true);
	}
}