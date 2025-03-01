package Practice;
import java.util.*;

public class Factorial {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            int user;
            System.out.print("User value are :");
            user = scan.nextInt();

            int fact = 1; // fact use to calculate the factorial
            int i = 1;

            for (i = 1; i <= user; i++) {
                fact *= i;
                System.out.println("Factorial of " + i + " is =" + fact);

            }
            scan.close();
        }
    }
}
