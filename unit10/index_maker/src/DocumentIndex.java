import java.util.ArrayList;
// ichumack23@belmontschools.net
public class DocumentIndex extends ArrayList<IndexEntry> {

	public DocumentIndex() {
		super();
	}
	public DocumentIndex(int e) {
		super(e);
	}
	public void addWord(String word, int num) {
		for (int i = 0; i< size(); i++) {
			IndexEntry temp = get(i);
			if (word == temp.getWord()) {
				temp.add(num);
			}
			else {
				add(new IndexEntry(word));

			}
		}
	}
}
