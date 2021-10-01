import java.util.Scanner;
public class MathProbs {
		public static double triangleArea(double a, double b, double c) {
			double s = (a+b+c)/2;
			return Math.sqrt(s*(s - a)*(s - b)*(s - c));
		}
		public static void main(String[] args) {
			Scanner input = new Scanner (System.in);
			System.out.print("length of side a: ");
			double a = input.nextDouble();
			System.out.print("length of side b: ");
			double b = input.nextDouble();
			System.out.print("length of side c: ");
			double c = input.nextDouble();
			System.out.println("The area is "+ triangleArea(a, b, c));
		}
}
