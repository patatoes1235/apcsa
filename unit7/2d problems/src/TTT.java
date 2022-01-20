import java.util.Scanner;

public class TTT {
	private static char[][] board;
	private static Scanner input = new Scanner(System.in);

	/* Initialize the TTT board. */
	public static void init_matrix(){
		board = new char[][] {{'0', '1', '2'}, {'3', '4', '5'}, {'6', '7', '8'}};
	}

	private static int[] translate(int input) {
		return new int[] {input/3, input % 3};
	}

	/* Get player X's move. */
	public static void get_playerX_move(){
		System.out.print("Player X, select where you want to move (integer 0 - 8): ");
		int[] loc = translate(input.nextInt());
		System.out.println();
		while (board[loc[0]][loc[1]] == 'X' || board[loc[0]][loc[1]] == 'O') {
			System.out.print("Position taken, please select another position: ");
			loc = translate(input.nextInt());
			System.out.println();
		}
		board[loc[0]][loc[1]] = 'X';
	}
	/* Get player O's move. */
	public static void get_playerO_move(){
		System.out.print("Player O, select where you want to move (integer 0 - 8): ");
		int[] loc = translate(input.nextInt());
		System.out.println();
		while (board[loc[0]][loc[1]] == 'X' || board[loc[0]][loc[1]] == 'O') {
			System.out.print("Position taken, please select another position: ");
			loc = translate(input.nextInt());
			System.out.println();
		}
		board[loc[0]][loc[1]] = 'O';
	}

	public static void disp_board() {
		for (int i = 0; i<3; i++) {
			for (int j = 0; j< 3; j++) {
				System.out.print(board[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static char check() {

	}
	public static void main(String[] args) {
		init_matrix();
		disp_board();
	}

}
