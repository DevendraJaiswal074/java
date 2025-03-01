// bubble short in ASC order

import java.util.*;
public class BubbleShort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter emements size: ");
        int size = scan.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
        System.out.print("Enter emement: ");
            array[i] = scan.nextInt();
        }

        for (int i = 0; i < array.length-1; i++) {  //n-1
            for (int j = 0; j < array.length-i-1; j++) {  
                if (array[j] > array[j+1]) {     //assign the value as ASDing order
                    int temp = array[j];  // swap the number 
                    array[j] = array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");
        }
        scan.close();
    }
}