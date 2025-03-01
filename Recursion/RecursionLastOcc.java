package Recursion;
// wap to find last occurence using recursion in an array 

public class RecursionLastOcc {
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 8, 8, 4};
        int x = 8;
        int index = lastOcc(arr, 0, x);
        System.out.println(index);
    }

    static int lastOcc(int[] arr, int i, int x) {
        if (i == arr.length) { // condition for end of array
            return -1;
        }
        int index = lastOcc(arr, i + 1, x); // this will return the last occurence of x in the array
        if (index == -1) { // if x is not found in the array
            if (arr[i] == x) {
                return i;
            } else {
                return -1;
            }
        } else {
            return index; // if x is found in the array
        }
    }
    
}
