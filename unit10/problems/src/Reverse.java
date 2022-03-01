import java.util.ArrayList;
public class Reverse {
	public static ArrayList<String> reverse(ArrayList<String> list) {
		ArrayList<String> newList = new ArrayList<String>();
		for (int i =list.size() -1; i>=0; i--) {
			newList.add(list.get(i));
		}
		return newList;
	}
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		for (int i =0; i< 10; i++) {
			list.add(i + "");
		}
		System.out.println(reverse(list));
	}
}
