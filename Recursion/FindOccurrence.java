// For a given integer array of size N, you have to find all the occurrences (indices) of a given element (Key) and print them. Use a recursive function to solve this problem.Sample Input: arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},key = 2Sample Output: 1 5 7 8

package Recursion;

import java.util.ArrayList;

public class FindOccurrence {
    public static void findOccurrence(int key, int index, int[] arr, ArrayList<Integer> result) {
        if (index == arr.length) {
            return;
        }

        if (arr[index] == key) {
            result.add(index);
        }

        findOccurrence(key, index + 1, arr, result);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        ArrayList<Integer> result = new ArrayList<>();
        findOccurrence(2, 0, arr, result);

        for (int index : result) {
            System.out.print(index + " ");
        }
    }
}
