import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApproxSinX x = new ApproxSinX(0);
        Scanner input = new Scanner(System.in);
        int i = -1;
        while (i != 0) {
            System.out.print("This program calculates the nth degree polynomial that will approximate sin(x) near x=0. \nEnter a positive integer n or 0 to quit. n=");
            i = input.nextInt();
            x.setDegree(i);
            input.nextLine();
            System.out.println(x);
        }
        input.close();
    }
}
