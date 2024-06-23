// You need to complete the solve() method in the below code.

// solve() method takes three arguments:

// String S
// Integer L
// Integer R
// You need to reverse the substring starting at index L and ending at index R in String S, and finally return the final string.

import java.lang.*;
import java.util.*;

public class Interviewbit_strbuilder_reverse {
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
    
    public static String solve(String s, int L, int R) {
        char[] chars = s.toCharArray();
        int left = L;
        int right = R;
    
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    
        return new String(chars);
    }
}