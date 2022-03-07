import java.util.ArrayList;
import java.util.Locale;

public class IndexEntry {
	private String word;
	private ArrayList<Integer> numsList;

	public IndexEntry(String a) {
		word = a.toUpperCase();
		numsList = new ArrayList<Integer> ();
	}
	public void add(int num) {
		for (int i : numsList) {
			if (i == num) {
				return;
			}
		}
		numsList.add(num);
	}
	public String getWord() {
		return word;
	}
	public String toString() {
		String temp = word + " " + numsList.get(0);
		for (int i = 1; i< numsList.size(); i++) {
			temp += ", " + i;
		}
		return temp;
	}
}
