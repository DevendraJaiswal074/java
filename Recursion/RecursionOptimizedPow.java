package Recursion;
// Recursive function to calculate power of a number
// This is a optimized version of the above code
public class RecursionOptimizedPow {
    public static int powers(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfpower = powers(x, n/2); //recursive call
        int halfpowerSquare = halfpower * halfpower; //square of halfpower

        //odd power
        if(n % 2 == 1){
            return x * halfpowerSquare;
        }
        return halfpowerSquare;
    }
    public static void main(String[] args) {
        System.out.println(powers(2, 10));
    }
}
