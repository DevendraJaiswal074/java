// You need to define two functions in the code below:

// First function should be named add and it must accept two integer arguments and it must return sum of both the integer arguments.

// Second function should be named multiply and it must accept two integer arguments and it must return multiplication of both the integer arguments.

// The given code take two integers as input and print their sum and multiplication on separate lines.

package hackerrank;

import java.util.Scanner;

public class interviewbit_method {
        public static void main(String[] args) {
        
        /*Dont't touch the code in this block*/
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        inp.nextLine();
        int b = inp.nextInt();
        inp.nextLine();
        inp.close();
        System.out.println(add(a,b));
        System.out.println(multiply(a,b));
        /*******************************************/
    }
    
    //Your code goes here
    public static int add(int a, int b){
         return a+b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
}