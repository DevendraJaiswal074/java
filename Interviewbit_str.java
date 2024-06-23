// Given two strings of lowercase English letters, A  and B, perform the following operations:

// Sum the lengths of A and B.
// Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
// Capitalize the complete string A and B and print them on a single line, separated by a space.

import java.lang.*;
import java.util.*;

public class Interviewbit_str {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        
        System.out.println(str1.length()+str2.length());
        if(str1.compareTo(str2) > 1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println(str1.toUpperCase()+" "+str2.toUpperCase());
        scan.close();
    }
}