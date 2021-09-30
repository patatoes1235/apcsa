// Chapter 5 Question 18

// This program prompts the user to enter miles traveled and
// gas spent and calculates the car's gas mileage

import java.util.Scanner;

public class GasMileage
{
	public static double gasMileage(int milesCalc, double mpg)
	{
		return milesCalc/mpg;
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Miles traveled: ");
		int miles = input.nextInt();
		System.out.print("Mileage: ");
		double mpg = input.nextDouble();

		input.close();

		double gallons = gasMileage(miles, mpg);
		System.out.println("You used " + gallons + " gallons of gass");
	}
}