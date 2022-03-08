import java.util.ArrayList;
import java.util.Locale;

// ichumack23@belmontschools.net
public class DocumentIndex extends ArrayList<IndexEntry> {

	public DocumentIndex() {
		super();
	}
	public DocumentIndex(int e) {
		super(e);
	}
	public void addWord(String word, int num) {
		if (size() ==0) {
			add(new IndexEntry(word));
			get(0).add(num);
			return;
		}
		for (int i = 0; i< size(); i++) {
			IndexEntry temp = get(i);
			System.out.println(temp);
			System.out.println(word);
			System.out.println(temp.getWord().compareTo(word.toUpperCase()));
			if (word.equalsIgnoreCase(temp.getWord())) {
				temp.add(num);
				return;
			} else if (temp.getWord().compareTo(word.toUpperCase()) > 0) {
				//System.out.println("ELSE STATEMENT CALLED");
				add(i, new IndexEntry(word));
				get(i).add(num);
				return;
			}
		}
//		add(new IndexEntry(word));
//		get(size() - 1).add(num);
	}
	public void addAllWords (String str, int num) {
		String[] wordList = str.split("\\W+");
		for (String word : wordList) {
			if (!(word.equals("") || word.equals(" "))) {
				addWord(word, num);
			}
		}
	}
}
