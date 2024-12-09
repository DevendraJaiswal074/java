import java.util.Scanner;

public class palindrome2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int user = scan.nextInt();

        int value = user;
        int final_value = 0;

        while (user > 0) {

            int rem = user % 10;
            final_value = final_value * 10 + rem;
            user = user / 10;
        }

        if (final_value == value) {
            System.out.println("Its a palindrome Number");
        } else {
            System.out.println("not a palindrome number");
        }
    }
}
