import java.math.BigInteger;
import java.util.ArrayList;

public class Fibonacci {
	public static ArrayList<BigInteger> fibonacci(int length) {
		ArrayList<BigInteger> fib = new ArrayList<BigInteger>(length);
		if (length >=2) {
			fib.add(new BigInteger();
			for (int i = 2; i < length; i++) {
				fib[i] = fib[i - 1] + fib[i - 2];
			}
		}
		return fib;
	}
}
