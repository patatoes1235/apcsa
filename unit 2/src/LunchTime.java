import java.util.Scanner;

public class LunchTime {
	static int minutesUntilLunch(int hrs, int min) {
		return (13-hrs)*60 - min;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Time: ");
		String s = input.nextLine();
		int i = s.indexOf(":");
		int currentHrs = Integer.parseInt(s.substring(0, i));
		int currentMin = Integer.parseInt(s.substring(i+1));

		input.close();
		System.out.println("Time until lunch: " + minutesUntilLunch(currentHrs, currentMin) + " minutes");
	}
}
