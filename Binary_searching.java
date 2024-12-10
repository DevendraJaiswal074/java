import java.util.Scanner;

public class Binary_searching {

    public static void search(int array[],int key){

        int start = 0;
        int end = array.length-1;

        while (start<=end) {
            
            int mid = (start+end)/2;
            if (array[mid] == key) {
                System.out.printf("Found at Index[%d]",mid);
                break;
            }
            if (array[mid]>key) {
                end = mid+1;
            }
            else{
                start = mid-1;
            }
        }
    }

    public static void main(String[] args) {
        int array[] = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.print("Key = ");
        int key = scan.nextInt();

        for (int i = 0; i < array.length; i++) { // take input from user
            System.out.printf("Array[%d]= ", i);
            array[i] = scan.nextInt();
        }

        search(array, key);
    }
}
