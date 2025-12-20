
public class Reverse_Array {

    public static void reverse(int array[]) {  // function to swap number
        int start = 0;
        int last = array.length - 1;

        while (start < last) {              // Loop to swap the number
            int temp = array[start];
            array[start] = array[last];
            array[last] = temp;
            start++;
            last--;
        }
    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 10 };

        System.out.println("Array Before Swap");             // display orginal value
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Array[%d][%d] \n", i, array[i]);
        }
        System.out.println();                // space 

        reverse(array);
        System.out.println("Array After Swap");               // print after the reverse order
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Array[%d][%d] \n", i, array[i]);
        }
        
    }
}