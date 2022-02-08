public class Rectangle {
	private int width, height;
	public Rectangle(int w, int h) {
		if (w <= 0) {
			throw new IllegalArgumentException("Width must be positive");
		}
		if (h <= 0) {
			throw new IllegalArgumentException("Height must be positive");
		}
		width = w;
		height = h;
	}
	public Rectangle (int side) {
		this(side, side);
	}
}
