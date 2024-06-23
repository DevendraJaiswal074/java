// Given a string A and two indices L and R print a substring consisting of all characters in the inclusive range from L to R. You'll find the String class' substring method helpful in completing this challenge.

import java.lang.*;
import java.util.*;

public class Interviewbit_str_substring {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        
        String A = scan.next();
        int L = scan.nextInt();
        int R = scan.nextInt();
        
        System.out.print(A.substring(L,R+1));
        scan.close();
        
    }
}
