package Pattern;
/* 

https://www.naukri.com/code360/problems/rotated-triangle_6573688?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Rotated Triangle.

Example:
Input: ‘N’ = 3

Output: 

*
**
***
**
*

*/

public class Pattern_Rotated_triangle {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n+1; i++) {
            for (int k = 1; k <= ( i - 1); k++) {
                System.out.print("*");
            }
            for (int j = i; j < n+1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        // lower loop
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < (n - i) - 1; k++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
