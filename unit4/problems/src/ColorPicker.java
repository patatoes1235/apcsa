import java.awt.*;

public class ColorPicker {
	public static Color bestMatch( int r, int g, int b) {

		if(r>g) {
			if (b>r) return Color.BLUE;
			if (b == r) return Color.MAGENTA;
			return Color.RED;
		}
		else if (g>r) {
			if (b>g) return Color.BLUE;
			if (b==g) return Color.CYAN;
			return Color.GREEN;
		}
		else if (b>r) {
			return Color.BLUE;
		}
		else if (r==g && g ==b) {
			return Color.GRAY;
		}
		return Color.YELLOW;
	}

	public static void main(String[] args) {
		System.out.println("red: " + bestMatch(1, 0, 0));
		System.out.println("Green: " + bestMatch(0, 1, 0));
		System.out.println("Blue: " + bestMatch(0, 0,1));
		System.out.println("Cyan: " + bestMatch(0, 1, 1));
		System.out.println("Yellow" + bestMatch(1, 1, 0));
		System.out.println("Magenta" + bestMatch(1, 0, 1));
	}
}
