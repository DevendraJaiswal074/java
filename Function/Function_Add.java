package Function;
// Create a function to print the sum of two variables and takes the values from the user

import java.util.*;

public class Function_Add {
    public static int add_two_varibles(int a,int b) {
        int sum = a+b;
        System.err.println("The sum of two number are="+sum);
        return 1 ;
        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number:");
        int a = scan.nextInt();
        System.out.print("Enter Number:");
        int b = scan.nextInt();

        add_two_varibles(a, b);
        scan.close();
    }
    
}