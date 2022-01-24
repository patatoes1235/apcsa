import java.util.Arrays;
import java.util.Scanner;

public class Game {
	private static Map map;
	public static void printMaze(Map map) {
		final String[][] temp = map.getMyMaze();
		for (int i =0; i<temp.length; i++) {
			for (int j = 0; j< temp[i].length; j++) {
				System.out.print(temp[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		map = new Map(new int[] {5,5});
		for (int i = 0; i < 5; i++) map.spawnTreasure(false);
		map.spawnTreasure(true);
		System.out.println("Collect all the treasures(T) and move to the bottom right corner to win. Type your directions to continue. ");

		while (map.getTreasureCounter() < 5) {
			printMaze(map);
			System.out.print("Direction? ");
			map.movePlayer(input.nextLine().trim());
		}
		System.out.println("Treasures all collected! Move to the bottom right corner to exit.");
		while (!Arrays.equals(map.getLoc(), new int[]{4,4})) {
			printMaze(map);
			System.out.print("Direction? ");
			map.movePlayer(input.nextLine().trim());
		}
		printMaze(map);
		System.out.println("YAYYY YOU WINNN :DDD");
	}
}
