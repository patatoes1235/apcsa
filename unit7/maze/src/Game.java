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
		for (int i = 0; i < 5; i++) map.spawnTreasure();
		int treasure = 5;
		while (true) {
			printMaze(map);
			System.out.print("Direction? ");
			map.movePlayer(input.nextLine());
		}
	}
}
