public class Average {
	public static double average(int[] scores) {
		double total = 0;
		for (int i : scores) {
			total +=i;
		}
		return total/scores.length;
	}
	public static void main(String[] args) {
		int[] scores = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(average(scores));
	}
}
