// Take 2 input from user and print the sum of input.

import java.util.*;

public class Input_sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER:");
        int a = sc.nextInt();
        System.out.print("ENTER THE SECOND NUMBER:");
        int b = sc.nextInt();

        int c= a+b;

        System.out.println("sum ="+ c);

        sc.close();

    }

}
