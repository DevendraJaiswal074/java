//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct

import java.util.Scanner;

public class Twice_true_false {

    public static boolean checkTwice(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            // int c_value = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Total Number of elements to insert : ");
        int size = scan.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + " = ");
            arr[i] = scan.nextInt();
        }
        System.out.println(checkTwice(arr));

    }
}