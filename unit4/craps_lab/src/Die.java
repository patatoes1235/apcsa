public class Die {
	private int roll = -1;
	public void roll() {
		roll = (int)(Math.random() * 6) +1;
	}
	public int getNumDots() {
		return roll;
	}
}
