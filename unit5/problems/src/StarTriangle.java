public class StarTriangle {
	public static void printStarTriangle(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i; j < (n - 1); j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2*i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
		public static void main(String[] args) {
			printStarTriangle(7);
		}
	}
