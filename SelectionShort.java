// Selection Short

import java.util.*;
public class SelectionShort {
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
            int short_value = i;
            for (int j = i+1; j < array.length; j++) {   //i+1
                if (array[short_value] > array[j]) { 
                    short_value = j;
                }
            }
            int temp = array[short_value];  // swap the number 
            array[short_value] = array[i];
            array[i]=temp;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");
        }
        scan.close();
    }
}

