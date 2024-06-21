// This exercise is to test your understanding of Java Strings. A sample String declaration:

// String myString = "Hello World!"
// The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

//output := 
//9
// No
// Hello Java

// import java.io.*;
import java.util.*;

public class HackerRank_string {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String c = A+B;
        System.out.println(c.length());
        if (A.compareTo(B) < 1) {
            System.out.println("No");
        } 
        System.out.println( A.substring(0,1).toUpperCase()+A.substring(1,A.length())+" "+B.substring(0,1).toUpperCase()+B.substring(1,B.length()));

        sc.close();
    }
}







