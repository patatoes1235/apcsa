/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card[] cards = {
				new Card("2", "Hearts", 2),
				new Card("3", "Spades", 3),
				new Card("King", "Clubs", 13)
		};
		for (int i =0; i<3; i++) {
			System.out.println(cards[i]);
			System.out.println("Rank: " + cards[i].rank());
			System.out.println("Suit: " + cards[i].suit());
			System.out.println("Point value: " + cards[i].pointValue());
			System.out.println("Matches 3 of spades? " + cards[i].matches(cards[1]) + "\n");
		}
	}
}
