// Given an integer n as an input print the numbers from 1 to n in separate lines.

 

// import java.lang.*;
import java.util.*;

public class interviewbit_loop {
    public static void main(String[] args) {
        /***Don't change the code here***/
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.close();
        /***********************************/
        
        
        /***Your code goes here***/
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}