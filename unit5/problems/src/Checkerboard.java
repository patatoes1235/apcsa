public class Checkerboard {
	public static void printCheckerboard(int i) {
		int k;
		for(k=0; k<i-1; k+=2) {
			for (int j = 0; j < 3; j++) {
				System.out.print("#o");
			}
			System.out.println("#");
			for (int j = 0; j < 3; j++) {
				System.out.print("o#");
			}
			System.out.println("o");
		}
		if (k< i) {
			System.out.println("#o#o#o#");
		}
	}
	public static void main(String[] args) {
		printCheckerboard(6);
		System.out.println("\n");
		printCheckerboard(7);
	}

}
