// Take N integers as an input and store them in an array and then print the array in reverse format.

//import java.lang.*;
import java.util.*;

public class Interviewbit_2Darray {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        Scanner scan = new Scanner(System.in);
        
        int size = scan.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextInt();
        }
        
        for(int j = size-1; j>=0 ; j--){
            System.out.println(array[j]);
        }
        scan.close();
    }
}