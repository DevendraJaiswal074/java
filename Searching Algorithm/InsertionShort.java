// This Java program reads an array of integers from the user and sorts it using the insertion sort algorithm, then prints the sorted array. The sorting process involves iterating through the array and inserting each element into its correct position among the previously sorted elements.

import java.util.*;
public class InsertionShort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter elements size: ");
        int size = scan.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
        System.out.print("Enter element: ");
            array[i] = scan.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            int j = i-1;
            while (j>= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = current;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");
        }
        scan.close();
    }
}