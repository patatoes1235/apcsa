public class RectTest {
	public static void main(String[] args) {
		Rectangle[] rects = {new Rectangle(), new Rectangle(5, 8), new Rectangle(3, 5), new Rectangle(4)};
		for (Rectangle rect : rects) {
			System.out.println("width: " + rect.getWidth() + " height: " + rect.getHeight());
			System.out.println("isSquare: " + rect.isSquare());
			rect.quadratize();
			System.out.println("isSquare after quadratizing: "+  rect.isSquare() + "\n");
		}
	}
}
