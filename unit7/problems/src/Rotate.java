import java.util.Arrays;

public class Rotate {
	public static void rotateLeft(int[] a) {
		int temp = a[0];
		for (int i =1; i< a.length; i++) {
            a[i-1] = a[i];
		}
        a[a.length-1] = temp;
	}
    public static void rotateRight(int[] a) {
        int temp = a[a.length-1];
        for (int i =a.length-1; i>0; i--) {
            a[i] = a[i-1];
        }
        a[0] = temp;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        rotateLeft(a);
        System.out.println(Arrays.toString(a));
        rotateRight(a);
        System.out.println(Arrays.toString(a));
    }
}