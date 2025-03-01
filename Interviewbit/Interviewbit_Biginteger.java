package Interviewbit;
// Take two numeric strings as input denoting two large integers and print their sum using BigIntegers.

// Example Input:

//  34
//  20
// Example Output:

//  54

import java.util.*;
import java.math.BigInteger;
public class Interviewbit_Biginteger {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        BigInteger num1 = scan.nextBigInteger();
        BigInteger num2 = scan.nextBigInteger();      
        BigInteger sum = num1.add(num2);
       
        System.out.println(sum);

        scan.close();
    
        
    }
}