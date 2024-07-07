/*

https://www.naukri.com/code360/problems/reverse-star-triangle_6573685?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION

 Problem statement
Send feedback
Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the Reverse N-Star Triangle.

Example:
Input: ‘N’ = 3

Output: 

*****
 ***
  *

 */

public class Pattern_TriangleReverse {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < 2 * (n - i) - 1; k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
