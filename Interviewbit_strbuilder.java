// You need to complete the solve() method in the below code.

// solve() method takes three arguments:

// String S
// Integer L
// Integer R
// You need to reverse the substring starting at index L and ending at index R in String S, and finally return the final string.


import java.lang.*;
import java.util.*;

public class Interviewbit_strbuilder {
    public static void main(String[] args) {
        //Don't alter anything here.
        Scanner inp = new Scanner(System.in);
        String S = inp.nextLine();
        int L = inp.nextInt();
        inp.nextLine();
        int R = inp.nextInt();
        inp.nextLine();
        inp.close();
        
        System.out.println(solve(S,L,R));
        /**************************************/
    }
    
    //complete the function below
    
    public static String solve(String s, int L, int R)
    {
        StringBuilder str = new StringBuilder();
        String str2 = s.substring(L,R);
        
       for (int i = str2.length() - 1; i >= 0; i--) {
            str.append(str2.charAt(i));
        }
        return str.toString();
    }
}