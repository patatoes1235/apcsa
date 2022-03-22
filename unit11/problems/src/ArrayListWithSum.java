import java.util.ArrayList;
public class ArrayListWithSum  extends ArrayList<Integer> implements ListWithSum{
    public int sum() {
        int sum =0;
        for (int i =0; i< size(); i++) {
            sum += get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        for (int j =0; j<3; j++) {
            ArrayListWithSum test = new ArrayListWithSum();
            for (int i = 10; i < 15; i++) {
                test.add((int) (i * Math.random()));
            }
            System.out.println(test);
            System.out.println(test.sum());
        }
    }
}
