import java.util.Scanner;

public class TTT {
	private static char[][] board;
	private static final Scanner input = new Scanner(System.in);

	/* Initialize the TTT board. */
	public static void init(){
		board = new char[][] {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
	}

	private static int[] translate(int input) {
		return new int[] {(input-1)/3, (input-1) % 3};
	}

	/* Get player's move. */
	public static int[] getMove(char p){
		System.out.print("Player " + p + ", select where you want to move (integer 1 - 9): ");
		int[] loc = translate(input.nextInt());
		System.out.println();
		while (board[loc[0]][loc[1]] == 'x' || board[loc[0]][loc[1]] == 'o') {
			System.out.print("Position taken, please select another position: ");
			loc = translate(input.nextInt());
			System.out.println();
		}
		board[loc[0]][loc[1]] = p;
		return loc;
	}
	public static void disp_board() {
		for (int i = 0; i<3; i++) {
			for (int j = 0; j< 3; j++) {
				System.out.print(board[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static char check(final int[] loc) {
		char p = board[loc[0]][loc[1]];

		//checks vertically and horizontally at loc to determine whether loc created win
		if ((board[loc[0]][(loc[1] + 1) % 3] == p && board[loc[0]][(loc[1] + 2 ) % 3] == p) ||
				(board[(loc[0] + 1) % 3][loc[1]] == p && board[(loc[0] + 2) % 3][loc[1]] == p)
		) return p;

		//checks if loc created win on diags
		if (loc[0] == loc[1] &&
				board[(loc[0] + 1 ) % 3][(loc[1] + 1) % 3] == p && board[(loc[0] + 2) % 3][(loc[1] + 2) % 3] == p
		) return p;
		if (loc[0] % 2 == loc[1] % 2 && loc[0] % 2 !=0 &&
				board[(loc[0] + 1 ) % 3][(loc[1] + 2) % 3] == p && board[(loc[0] + 2) % 3][(loc[1] + 1) % 3] == p
		) return p;

		return ' ';
	}
	public static void play() {
		for (int i = 0; i< 2; i++) {
			disp_board();
			getMove('x');
			disp_board();
			getMove('o');
		}
		for (int i = 0; i<8; i++) {
			disp_board();
			if (check(getMove('x')) =='x') {
				disp_board();
				System.out.println("X Wins!");
				return;
			}
			disp_board();
			if (check(getMove('o')) == 'o') {
				disp_board();
				System.out.println("O Wins! ");
				return;
			}
		}
		disp_board();
		if (check(getMove('x')) =='x') {
			disp_board();
			System.out.println("X Wins!");
		}
		else {
			disp_board();
			System.out.println("Its a tie!");
		}

	}

	public static void main(String[] args) {
		init();
		play();
	}
}
