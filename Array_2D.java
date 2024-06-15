// Write a program to take input from user prints the value

import java.util.*;
public class Array_2D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows");   // input for total number of rows
        int rows = scan.nextInt();

        System.out.print("Enter number of Colums");  // input for total number of colums
        int col = scan.nextInt();

        int[][] Array = new int[rows][col];      // declare of 2D_array

        for (int i = 0; i < rows; i++) {     // outer loop for row
            for (int j = 0; j < col; j++) {   // inner loop for col
                Array[i][j] = scan.nextInt();   // takes the values in 2D_array
            }
        }
        System.out.printf("Matrix of %d X %d\n",rows,col);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(Array[i][j]+" ");
            }
            System.out.println();
        }

        scan.close();
    }
    
}
