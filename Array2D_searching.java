//Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.

import java.util.*;

public class Array2D_searching {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter The Number of Rows: ");  // no. of row
        int rows = scan.nextInt();

        System.out.print("Enter The Number of Colums: ");  //  no. of colums
        int cols = scan.nextInt();

        System.out.print("Enter the search value: ");    // x  value
        int search = scan.nextInt();

        int[][] Array = new int[rows][cols];   // declare the array

        for (int i = 0; i < rows; i++) {       // outer loop for rows
            for (int j = 0; j < cols; j++) {       // inner loop for colums
                Array[i][j] = scan.nextInt();      // take value from user
            }
        }
       
        // printing the search value result
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (search == Array[i][j]) {
                    System.out.printf("Element '%d' Found at Index[%d][%d]\n", search, i, j);
                }
            }
        }
        System.out.println();
        System.out.printf("Matrix of %d X %d\n",rows,cols);
        
        // printing the whole elements of matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(Array[i][j]+" ");
            }
            System.out.println();
        }
        scan.close();
    }

}
