package Practice;
// Swap two number without using third variables.

import java.util.*;

public class Swap_without_var {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number:");
        int a = scan.nextInt();
        System.out.print("Enter number:");
        int b = scan.nextInt();
        System.out.println("BEFORE Swap values 'a'=" + a + "'b'=" + b);

        a = a+b;
        b= a-b;
        a = a-b;
        System.out.println("AFTER Swap values 'a'=" + a + "'b'=" + b);

        scan.close();

    }
}
