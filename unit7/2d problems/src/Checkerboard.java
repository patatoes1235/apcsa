import java.util.Arrays;

public class Checkerboard {
	public static void fillCheckerboard(char[][] board) {
		for (int i =0; i < board.length; i+=2) {
			for (int j = 0; j< board[i].length; j+=2) {
				board[i][j] = 'X';
			}
			for (int j = 1; j< board[i].length; j+=2) board[i][j] = 'O';
		}
		for (int i =1; i< board.length; i+=2) {
			for (int j = 0; j< board[i].length; j+=2) {
				board[i][j] = 'O';
			}
			for (int j = 1; j< board[i].length; j+=2) board[i][j] = 'X';
		}
	}
	public static void main(String[] args) {
		char[][] board = new char[5][3];
		fillCheckerboard(board);
		for (char[] col : board) System.out.println(Arrays.toString(col));
		char[][] board2 = new char[6][4];
		fillCheckerboard(board2);
		for (char[] col : board2) System.out.println(Arrays.toString(col));
	}
}
