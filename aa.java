import java.util.Scanner;

public class aa {
    // Recursive function to count substrings
    // public static int countSubstrings(String s, int i, int j) {
    //     // Base Case: If i exceeds the string length, return 0
    //     if (i == s.length()) {
    //         return 0;
    //     }
    //     // If j exceeds the string length, restart from the next i
    //     if (j == s.length()) {
    //         return countSubstrings(s, i + 1, i + 1);
    //     }

    //     int count = (s.charAt(i) == s.charAt(j)) ? 1 : 0;   // Count valid substring
        
    //     // Recursive call for the next substring
    //     return count + countSubstrings(s, i, j + 1);
    // }

    public static void main(String[] args) {
        // System.out.println(countSubstrings("abcd", 0, 0));

        String a = "dev";

        System.out.println(a.charAt(2));
    }
}
