// Take 2D matrix A of size N X M as an input and print M integers denoting the column-wise sum of each of the M columns.

/*
 First line contains two space-separated integers N and M.

Each of the next N lines contains M space-separated integers denoting the matrix elements.


Output Format

Print M space-separated integers where each denoting the column-wisw sum of A.


Example Input

Input 1:

 3 4
 3 2 1 3
 1 2 3 4
 4 3 1 2

Example Output

Output 1:

 8 7 5 9

Example Explanation

Explanation 1:

 Sum of elements of first column : 3 + 1 + 4 = 8
 Sum of elements of second column : 2 + 2 + 3 = 7
 Sum of elements of third column : 1 + 3 + 1 = 5
 Sum of elements of fourth column : 3 + 4 + 2 = 9
 */

import java.util.*;

public class Interviewbit_matrix {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner = new Scanner(System.in);

        // Reading the number of rows (N) and columns (M)
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        // Reading the matrix elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        // Array to store column-wise sums
        int[] columnSum = new int[m];

        // Calculating column-wise sums
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                columnSum[j] += matrix[i][j];
            }
        }

        // Printing column-wise sums
        for (int j = 0; j < m; j++) {
            System.out.print(columnSum[j] + " ");
        }
    }
}
