import java.util.Arrays;
public class Searching {
	public static void main(String[] args) {
		int[] unsorted = new int[20];
		int[] sorted = new int[20];
		for (int i =0; i< 20; i++) {
			unsorted[i] = getNewInt(unsorted);
			sorted[i]= 2*i;
		}
		System.out.println(Arrays.toString(unsorted));
		System.out.println(Arrays.toString(linearSearch(unsorted, unsorted[6])));


	}
	public static int getNewInt(int[] a) {
		int i = (int)(Math.random()*100);
		for (int j : a) {
			if (j ==i) getNewInt(a);
		}
		return i;
	}

	/**
	 * Searches int[] a for an integer n linearly
	 * @return array: [comparisons made, index of element (-1 if none)
	 */
	public static int[] linearSearch(int[] a, int n) {
		for (int i =0; i<a.length; i++) {
			if (a[i] == n) return new int[] {i+1, i};
		}
		return new int[] {a.length, -1};
	}

	/**
	 * Searches int[] a for an integer n with binary search
	 * @return array: [comparisons made, index of element (-1 if none)
	 */
	public static int[] binarySearch(int[] a, int n) {
		int i =0;
		while (a.length > 2) {
			i++;
			if (a[a.length / 2] == n) {
				return new int[] {i, a.length / 2};
			}
			else if (a[a.length / 2] < n) {

			}
			else if (a[a.length/2] > n) {

			}
		}
		return new int[]{a.length, -1};
	}
}
