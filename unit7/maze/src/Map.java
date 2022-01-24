import java.util.Arrays;

public class Map {
	private String[][] myMaze;
	private static int heroRow, heroCol, treasureCounter;
	private int[] hiddenTreasure = new int[2];
	public Map(int[] size) {
		heroCol = 0;
		heroRow = 0;
		treasureCounter = 0;
		myMaze = new String[size[0]][size[1]];
		for (int i = 0; i < myMaze.length; i++) {
			for (int j = 0; j < myMaze[i].length; j++) {
				myMaze[i][j] = "O";
			}
		}
		myMaze[0][0] = "X";
	}

	public static int getTreasureCounter() {
		return treasureCounter;
	}

	public int[] spawnTreasure(boolean hidden) {
		int[] loc = new int[] {(int)(Math.random()*myMaze.length), (int)(Math.random()*myMaze[0].length)};
		if (!myMaze[loc[0]][loc[1]].equals("O")) spawnTreasure(hidden);
		else {
			if (hidden) hiddenTreasure = loc;
			else setMazeAtIndex(loc, "T");
		}
		return loc;
	}
	public void setMazeAtIndex(int[] loc, String value) {
		myMaze[loc[0]][loc[1]] = value;
	}
	public int[] getLoc() {
		return new int[] {heroRow, heroCol};
	}

	public String[][] getMyMaze() {
		return myMaze;
	}

	public boolean pickUpTreasure() {
		if (myMaze[heroRow][heroCol].equals("T")) {
			myMaze[heroRow][heroCol] = "X";
			treasureCounter++;
			return true;
		}
		return false;
	}

	public void movePlayer(String dir) {
		if (dir.toLowerCase().equals("up") && heroRow !=0 && (myMaze[heroRow-1][heroCol].equals("O")||myMaze[heroRow-1][heroCol].equals("T"))) {
			myMaze[heroRow][heroCol] = "O";
			heroRow--;
			pickUpTreasure();
			myMaze[heroRow][heroCol] = "X";
			if (Arrays.equals(getLoc(), hiddenTreasure)) System.out.println("YOU FOUND THE HIDDEN TREASURE!! +1000 bonus points!!!");
		}
		else if (dir.toLowerCase().equals("down") && heroRow != myMaze.length-1 && (myMaze[heroRow+1][heroCol].equals("O")||myMaze[heroRow+1][heroCol].equals("T"))) {
			myMaze[heroRow][heroCol] = "O";
			heroRow++;
			pickUpTreasure();
			myMaze[heroRow][heroCol] = "X";
			if (Arrays.equals(getLoc(), hiddenTreasure)) System.out.println("YOU FOUND THE HIDDEN TREASURE!! +1000 bonus points!!!");
		}
		else if (dir.toLowerCase().equals("left") && heroCol !=0 && (myMaze[heroRow][heroCol-1].equals("O")||myMaze[heroRow][heroCol-1].equals("T"))) {
			myMaze[heroRow][heroCol] = "O";
			heroCol--;
			pickUpTreasure();
			myMaze[heroRow][heroCol] = "X";
			if (Arrays.equals(getLoc(), hiddenTreasure)) System.out.println("YOU FOUND THE HIDDEN TREASURE!! +1000 bonus points!!!");
		}
		else if (dir.toLowerCase().equals("right") && heroCol != myMaze[myMaze.length-1].length-1 && (myMaze[heroRow][heroCol+1].equals("O")||myMaze[heroRow][heroCol+1].equals("T"))) {
			myMaze[heroRow][heroCol] = "O";
			heroCol++;
			pickUpTreasure();
			myMaze[heroRow][heroCol] = "X";
			if (Arrays.equals(getLoc(), hiddenTreasure)) System.out.println("YOU FOUND THE HIDDEN TREASURE!! +1000 bonus points!!!");
		}
		else {
			System.out.println("You can't go that way.");
		}
	}
}
