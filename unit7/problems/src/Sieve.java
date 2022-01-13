import java.util.Arrays;

public class Sieve {
	public static void main(String[] args) {
		boolean[] isPrime = new boolean[1000];
		isPrime[2] = true;
		for (int i =3; i < isPrime.length; i+=2) isPrime[i] = true;
		for (int i = 3; i< isPrime.length/2; i+=2) {
			if (isPrime[i]) {
				for (int j = 2; j*i < 1000; j++) {
					isPrime[j*i] = false;
				}
			}
		}

		System.out.printf("%4d", 2);
		for (int i =3, j = 1; i < isPrime.length; i +=2) {
			if (isPrime[i]) {
				System.out.printf("%4d", i);
				j++;
				if (j%5 ==0) System.out.println();
			}
		}
	}
}
