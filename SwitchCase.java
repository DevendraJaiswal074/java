import java.util.*;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = scan.nextInt();

        switch (a) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Banjour");
                break;

            default:
                System.out.println("invaild..!");
                break;
        }

        scan.close();
    }
}
