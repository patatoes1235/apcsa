import java.util.ArrayList;

public class Smallest {
	public static void removeSmallest(ArrayList<Integer> list) {
		int sIndex = 0;
		for (int i =1; i< list.size(); i++) {
			if (list.get(i).compareTo(list.get(i-1)) < 0) {
				sIndex = i;
			}
		}
		list.remove(sIndex);
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i< 6; i++) {
			list.add((int)(Math.random()* 50));
		}
		System.out.println(list);
		removeSmallest(list);
		System.out.println(list);
	}
}
