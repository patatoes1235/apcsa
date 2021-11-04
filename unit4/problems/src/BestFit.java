public class BestFit {
	public static int bestFit(int size1, int size2, int space) {
		if (size1+ size2 <= space) return 3;
		if (size1 > space && size2 > space) return 0;
		int i=2;
		if (size1 > size2) i--;
		return i;
	}
	public static void main(String[] args) {
		System.out.println("size1: " + bestFit(3, 2, 4));
		System.out.println("size2: " + bestFit(2, 3, 4));
		System.out.println("both: " + bestFit(1, 2, 3));
		System.out.println("both: " + bestFit(2, 2, 6));
		System.out.println("neither: " + bestFit(3, 3, 2));
	}
}