//Take an array as input from user. Search for a given number X and print the index at which it occure.

import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = scan.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter value: ");
            array[i] = scan.nextInt();
        }

        System.out.print("Enter the search value: ");
        int search_value = scan.nextInt();
        for (int i = 0; i < size; i++) {
            if (array[i] == search_value) {
                System.out.printf("Element Found At INDEX[%d][%d] \n",i,search_value);
            }
        }
  
        scan.close();
    }
}
