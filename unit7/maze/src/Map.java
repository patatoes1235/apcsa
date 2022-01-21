public class Map {
	private String[][] myMaze;
	private static int heroRow, heroCol;
	public Map(int[] size) {
		heroCol = 0;
		heroRow = 0;
		myMaze = new String[size[0]][size[1]];
		for (int i = 0; i < myMaze.length; i++) {
			for (int j = 0; j < myMaze[i].length; j++) {
				myMaze[i][j] = "O";
			}
		}
		myMaze[0][0] = "X";
	}

	public int[] spawnTreasure() {
		int[] loc = new int[] {(int)(Math.random()*myMaze.length), (int)(Math.random()*myMaze[0].length)};
		setMazeAtIndex(loc, "T");
	}
	public void setMazeAtIndex(int[] loc, String value) {
		myMaze[loc[0]][loc[1]] = value;
	}

	public String[][] getMyMaze() {
		return myMaze;
	}

	public void movePlayer(String dir) {
		if (dir.toLowerCase().equals("up") && heroRow !=0 && myMaze[heroRow-1][heroCol].equals("O")) {
			myMaze[heroRow][heroCol] = "O";
			heroRow--;
			myMaze[heroRow][heroCol] = "X";
		}
		else if (dir.toLowerCase().equals("down") && heroRow != myMaze.length-1 && myMaze[heroRow+1][heroCol].equals("O")) {
			myMaze[heroRow][heroCol] = "O";
			heroRow++;
			myMaze[heroRow][heroCol] = "X";
		}
		else if (dir.toLowerCase().equals("left") && heroCol !=0 && myMaze[heroRow][heroCol-1].equals("O")) {
			myMaze[heroRow][heroCol] = "O";
			heroCol--;
			myMaze[heroRow][heroCol] = "X";
		}
		else if (dir.toLowerCase().equals("right") && heroCol != myMaze[myMaze.length-1].length-1 && myMaze[heroRow][heroCol+1].equals("O")) {
			myMaze[heroRow][heroCol] = "O";
			heroCol++;
			myMaze[heroRow][heroCol] = "X";
		}
		else {
			System.out.println("You can't go that way.");
		}
	}
}
