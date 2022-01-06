import java.util.Arrays;

public class fibonacci {
	public static int[] fibonacci(int length) {
		int[] fib = new int[length];
		if (length >=2) {
			fib[1] = 1;
			for (int i = 2; i < length; i++) {
				fib[i] = fib[i - 1] + fib[i - 2];
			}
		}
		return fib;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(fibonacci(5)));
	}
}
