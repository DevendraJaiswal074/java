// Write a  Calculator class with a single method: int power(int,int). The power method takes two integers, n and p, as parameters and returns the integer result of np. If either n or p is negative, then the method must throw an exception with the message: n and p should be non-negative.

// Note: Do not use an access modifier (e.g.: public) in the declaration for your  Calculator class.

import java.util.*;
import java.io.*;

class Calculator {
    public int power(int n,int p) throws Exception{
        if(n<0 || p<0){
            throw new Exception("n and p should be non-negative");
        }
        else{
            return (int)Math.pow(n,p);
        }
    }
}
class Hackerrank_17day{
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }

}