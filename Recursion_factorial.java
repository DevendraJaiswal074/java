// print factorial of n number 

import java.util.*;

public class Recursion_factorial {

    public static int print_factorial(int user) {
        if (user == 1 || user == 0) {
            return 1;         // if factorial = 0 then print 1 because 0 value is 1.
        }
        int fact1= print_factorial(user-1);
        int fact2 = user*fact1;
        return fact2;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 'N' value: ");
        int user = scan.nextInt(); 
        int sum = print_factorial(user);
        System.out.println(sum);
        scan.close();
    }
}