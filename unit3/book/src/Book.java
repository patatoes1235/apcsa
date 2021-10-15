public class Book {
	private int numPages;
	private int currentPage;

	public Book(int pages) {
		numPages = pages;
		currentPage =1;
	}

	public int getCurrentPage() {
		return currentPage;
	}
	public int getNumPages() {
		return numPages;
	}
	public void nextPage() {
		if (currentPage < numPages) currentPage++;
	}
}