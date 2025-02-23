import java.util.Scanner;

public class Array_largest_value {

    public static void largest_value(int array[]){
        int large_value= 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>large_value) {
                large_value = array[i];
            }
        }
        System.out.println("large value of array ="+large_value);
    }
    
    public static void main(String[] args) {
        int array[] = new int[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Array["+i+"]= ");
            array[i]= scan.nextInt();
        }

        largest_value(array);
        scan.close();
    }
}
