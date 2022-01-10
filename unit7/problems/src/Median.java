public class Median {
	public static boolean isMedian(double[] sample, double m) {
		int below = 0, above = 0;
		for (double i : sample) {
			if (i< m) below++;
			else if (i>m) above++;
		}
		return below == above;
	}
}
