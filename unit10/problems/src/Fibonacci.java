import java.math.BigInteger;
import java.util.ArrayList;

public class Fibonacci {
	public static ArrayList<BigInteger> fibonacci(int length) {
		ArrayList<BigInteger> fib = new ArrayList<BigInteger>(length);
		for (int i = 0; i<length && i < 2; i++) {
			fib.add(BigInteger.valueOf(i));
		}
		for (int i = 2; i < length; i++) {
			fib.add(fib.get(fib.size()-1).add(fib.get(fib.size()-2)));
			//fib[i] = fib[i - 1] + fib[i - 2];
		}
		return fib;
	}
	public static void main(String[] args) {
		System.out.println(fibonacci(1));
		System.out.println(fibonacci(10));
		System.out.println(fibonacci(101));
	}
}
