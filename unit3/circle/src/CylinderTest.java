import java.util.Scanner;

public class CylinderTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the radius: ");
		double r = input.nextDouble();
		System.out.print("Enter the height: ");
		double h = input.nextDouble();
		input.close();

		Cylinder c = new Cylinder(r, h);
		System.out.println("Volume: " + c.getVolume());
	}
}
