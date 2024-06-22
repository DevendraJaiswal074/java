//Check if an array is sorted(stricly increase)

import java.util.*;
public class Recursion_boolean_sort {
    public static boolean isSorted(int array[],int index) {
        if (index == array.length-1) {
            return true;
        }
        if (array[index] <= array[index+1]) {
            return false;
        }
        return isSorted(array, index+1);
    }
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Enter array value: ");
        // int[] array = new int[10];

        int[] array={1,2,3,4};
        System.out.println(isSorted(array, 0));
        // scan.close();
    }
}
