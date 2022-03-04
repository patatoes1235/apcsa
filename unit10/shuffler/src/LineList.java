import java.util.ArrayList;

public class LineList {
    ArrayList<String> strings;

    public LineList() {
        strings = new ArrayList<String>();
    }
    public int size() {
        return strings.size();
    }
    public String get(int k) {
        return strings.get(k);
    }
    public void add(String line) {
        strings.add(line);
    }
    public String remove(int k) {
        return strings.remove(k);
    }
    public void move(int index, int newIndex) {
        String item = strings.remove(index);
        strings.add(newIndex, item);
    }
    public void shuffle() {
        for (int i = strings.size(); i >=2; i--) {
            int index = (int)(Math.random() * i);
            String temp = strings.set(i-1, strings.get(index));
            strings.set(index, temp);
        }
    }
}
