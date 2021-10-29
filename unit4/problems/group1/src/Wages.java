import java.util.Scanner;
public class Wages {
	public static double totalWages(double hours, double rate)
	{
		double wages = hours * rate;
		if (hours > 40) wages += (hours - 40) * 0.5 * rate;
		return wages;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Hours worked: ");
		double hours =  input.nextDouble();
		System.out.print("Rate: ");
		double rate = input.nextDouble();
		input.close();

		System.out.println("$"+totalWages(hours, rate));
	}
}
