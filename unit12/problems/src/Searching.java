import java.util.Arrays;
import java.util.Scanner;

public class Searching {
	public static void main(String[] args) {
		int[] unsorted = new int[20];
		int[] sorted = new int[20];
		for (int i =0; i< 20; i++) {
			unsorted[i] = getNewInt(unsorted);
			sorted[i]= i * 10 + (int)(Math.random() * 10);
		}
		Scanner input = new Scanner(System.in);

		System.out.println("Arrays: ");
		System.out.println("Unsorted: " + Arrays.toString(unsorted));
		System.out.println("Sorted: " + Arrays.toString(sorted));
		while (true) {
			System.out.print("\nEnter the search algorithm to be used (l or b): ");
			int[] results;
			if (input.nextLine().trim().equalsIgnoreCase("l")) {
				System.out.print("Enter the number you want to find: ");
				results = linearSearch(unsorted, input.nextInt());
			} else {
				System.out.print("Enter the number you want to find: ");
				results = binarySearch(sorted, input.nextInt());
			}
			input.nextLine();
			System.out.println("Iterations: " + results[0] + " Index: " + results[1]);
		}
	}


	public static int getNewInt(int[] a) {
		int i = (int)(Math.random()*100);
		for (int j : a) {
			if (j ==i) i = getNewInt(a);
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
		int i = 1;
		int left = 0;
		int right = a.length -1;
		while (left <= right) {
			int mid = (left + right) /2;
			i++;
			if (a[mid] == n) {
				return new int[] {i, mid};
			}
			else if (a[mid] < n) {
				left = mid+1;
			}
			else if (a[mid] > n) {
				right = mid -1;
			}
		}
		return new int[]{i, -1};
	}
}
