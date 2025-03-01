package Function;
//create a function to calculate the factorial of n - number.

import java.util.*;

public class Factorial_function {

    public static void Calculate_factorial(int user) {

        if (user<0) {
            System.out.println("Invalid");
            return;
            
        }
        int sum = 1;
        for (int i = user; i >= 1; i--) {
            sum = sum * i;
        }
        System.out.print("Factorial of "+user+" is :" + sum);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number:");
        int user = scan.nextInt();

        Calculate_factorial(user);
        scan.close();

    }

}
