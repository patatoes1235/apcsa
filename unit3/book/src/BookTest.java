public class BookTest {
	public static void main(String[] args) {
		Book book = new Book(3);
		for (int i=0; i<3; i++) {
			book.nextPage();
			System.out.println(book.getCurrentPage());
		}
	}
}