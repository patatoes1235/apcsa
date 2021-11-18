public class PrimeNumbers {
	public static boolean isPrime(int n)
	{
		if (n <= 1)
			return false;

		int m = 2;

		while (m * m <= n)
		{
			if (n % m == 0)
				return false;
			m+=2;
		}

		return true;
	}
	public static void main(String[] args) {
		System.out.println("5: " + isPrime(5));
		System.out.println("6: " + isPrime(6));
		System.out.println("4: " + isPrime(4));
		System.out.println("17: " + isPrime(17));
	}

}
