// sum of all even number using while loop and for loop.

import java.util.*;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // int sum = 0;
        // System.out.print("Enter 'N' Value:");
        // int user = scan.nextInt();
        // for (int i = 0; i <= user; i++) {
        // if (i % 2 == 0) {
        // sum = sum + i;

        // }
        // }
        // System.out.println(sum);

        System.out.print("Enter 'N' Value:");
        int user = scan.nextInt();

        int i = 0, sum = 0;
        while (i <= user) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);
        scan.close();
    }

}