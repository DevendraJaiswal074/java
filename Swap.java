//Swap two number using third variables.

import java.util.*;

public class Swap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number:");
        int a = scan.nextInt();
        System.out.print("Enter number:");
        int b = scan.nextInt();
        System.out.println("BEFORE Swap values 'a'=" + a + "'b'=" + b);
        int c = 0;

        c = a;
        a = b;
        b = c;
        System.out.println("AFTER Swap values 'a'=" + a + "'b'=" + b);

        scan.close();

    }
}
