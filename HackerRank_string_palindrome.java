// A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

import java.io.*;
import java.util.*;

public class HackerRank_string_palindrome
 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String reverse_data ="";
        for(int i=A.length()-1;i>=0;i--)
        {
            reverse_data = reverse_data+A.charAt(i);
        }
        if(reverse_data.equals(A)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
        sc.close();
    }
}



