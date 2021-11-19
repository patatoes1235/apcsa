public class SumDigits {
	public static int sumDigits(int i) {
		int total = i %10;
		i/=10;
		while ( i>=1) {
			total += i%10;
			i/=10;
		}
		return total;
	}
	public static void main(String[] args) {
		System.out.println("123451: "+ sumDigits(123451));
	}
}
