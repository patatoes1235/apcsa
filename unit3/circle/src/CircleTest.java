import java.util.Scanner;
public class CircleTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the radius: ");
		double r = input.nextDouble();
		input.close();

		Circle c = new Circle(r);
		System.out.println("Area: " + c.getArea());
	}
}
