package Recursion;

/* Given a number n, print all factorial numbers smaller than or equal to n. 
Examples : 

Input: n = 100
Output: 1 2 6 24


Input: n = 1500
Output: 1 2 6 24 120 720 */

public class factorialNum {

    public static void printFac(int i, int fac, int n) {
        i++;
        if (fac > n) {
            return;
        }

        System.out.print(fac + " ");

        printFac(i, fac * i, n);
    }

    public static void main(String[] args) {
        int n = 6;
        printFac(1,1,n);
    }
}