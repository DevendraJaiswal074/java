import java.util.Scanner;

public class Recursion_fibonacci_series {
    public static void Print_Fibonacci(int a,int b,int user) {
        if (user == 0) {
            return;
        }
        int c = a+b;
        System.out.println(c);
        /*when c are print then change the value of a and b variable
            now a = 1 and b = 1
            c = 1+1
            so, on..........
         */
        Print_Fibonacci(b, c, user-1); // decrese the value of user by 1 because one value are print
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 'N' value: ");
        int user = scan.nextInt(); 
        int a = 0 ,b =1;
        System.out.println(a);
        System.out.println(b);

        // a = 0 b = 1 the two value are print already so N minus by 2
        Print_Fibonacci(a,b,user-2);
        scan.close();
    }
}