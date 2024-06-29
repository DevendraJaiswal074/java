// Given an integer array A you need to find the total number of unique elements in that array A.


// Problem Constraints

// 1 <= |A| <= 105

// 1 <= A[i] <= 109

 

// Input Format

// The first-line contain a single integer N denoting the size of the array A.

// Next N lines each contain a single integer denoting the array A elements.


// Output Format

// Print a single integer denoting the total number of unique elements in that array A.

import java.lang.*;
import java.util.*;

public class Interviewbit_hashset {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int N = scanner.nextInt();

        // Initialize a HashSet to store unique elements
        HashSet<Integer> uniqueElements = new HashSet<>();

        // Read the elements of the array
        for (int i = 0; i < N; i++) {
            int element = scanner.nextInt();
            uniqueElements.add(element);
        }

        // Close the scanner
        scanner.close();

        // The size of the HashSet represents the number of unique elements
        System.out.println(uniqueElements.size());
    }
}