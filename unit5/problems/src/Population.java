import java.util.Scanner;

public class Population {
	private static int year = 2014;
	private static double gRate = 1.005;
	//population in millions
	private static double pop = 123.8;
	public static int fPop(double fPop)
	{
		double cPop =pop;
		int cYear = year;
		while (fPop > cPop) {
			cPop *= gRate;
			cYear++;
		}
		return cYear;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a population (millions): ");
		double population = input.nextDouble();
		System.out.println("The population will reach " + population  + " in " + fPop(population));
		System.out.println("The population will reach " + population  + " in " + fPop(population));
	}
}
