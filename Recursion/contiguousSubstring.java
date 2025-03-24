//recursion, we need to count all contiguous substrings that start and end with the same character. Instead of using nested loops, we will break the problem into smaller subproblems recursively.Sample Input 1: S = "abcab"Sample Output 1: 7There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, bOutoftheabovesubstrings,thereare7substrings:a,abca,b,bcab,c,aandb.So,only7contiguous substrings start and end with the same character

package Recursion;

public class contiguousSubstring {
    // Recursive function to count substrings
    public static int countSubstrings(String s, int i, int j) {
        // Base Case: If i exceeds the string length, return 0
        if (i == s.length()) {
            return 0;
        }
        // If j exceeds the string length, restart from the next i
        if (j == s.length()) {
            return countSubstrings(s, i + 1, i + 1);
        }

        int count = (s.charAt(i) == s.charAt(j)) ? 1 : 0; // Count valid substring

        // Recursive call for the next substring
        return count + countSubstrings(s, i, j + 1);
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("abcd", 0, 0));
    }
}
