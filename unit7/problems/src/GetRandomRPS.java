public class GetRandomRPS {
	public static void main(String[] args) {
		for (int i =0; i< 10; i++) System.out.println(getRandomRps());
	}
	public static char getRandomRps() {
		char[] rps = {'r', 'r', 'r','p', 'p', 'p', 'p', 'p', 's', 's', 's', 's', 's','s'};
		return rps[(int)(Math.random()*14)];
	}
}
