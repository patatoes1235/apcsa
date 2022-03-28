public class Stars {
	public static void printStars(int n) {
		if (n == 0) {
			System.out.println();
			return;
		}
		System.out.print("*");
		printStars(n-1);
	}
	public static void reversePrintTriangles(int i) {
		if (i ==0) {
			System.out.println();
			return;
		}
		printStars(i);
		reversePrintTriangles(i-1);
	}
	public static void printTriangles(int i){


	}
	public static void main(String[] args) {
		reversePrintTriangles(5);
	}
}
