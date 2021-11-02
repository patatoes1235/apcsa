import java.util.Scanner;

public class Group3 {
    public static String toPoem(int i) {
        switch (i) {
            case 0:
                return "Bye!";
            case 1:
            case 2:
                return "Buckle your shoe";
            case 3:
            case 4:
                return "Shut the door";
            case 5:
            case 6:
                return "Pick up sticks";
            case 7:
            case 8:
                return "Lay them straight";
            case 9:
            case 10:
                return "Begin again";
        }
        return "Please enter a number between 0 and 10";
    }
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int i = -1;
        while (i!=0) {
            System.out.print("Enter the number 1-10 (or 0 to quit): ");
            i = input.nextInt();
            System.out.println(toPoem(i));
        }
        input.close();
    }
}
