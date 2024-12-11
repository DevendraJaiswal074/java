/*

print the max value of an sub array 

1  = 1

1 -2  = -1

1 -2 6  = 5

1 -2 6 -1  = 4

1 -2 6 -1 3  = 7

-2  = -2

-2 6  = 4

-2 6 -1  = 3

-2 6 -1 3  = 6

6  = 6

6 -1  = 5

6 -1 3  = 8

-1  = -1

-1 3  = 2

3  = 3

The Max value of Array = 8
 */

public class MaxSubArray {

    public static void MaxOfSubArray(int array[]){

        int maxValue = -1;
        int current_value = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                current_value = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    current_value = current_value+array[j2];
                    System.out.printf("%d ",array[j2]);
                }
                System.out.println(" = "+current_value+"\n");
                if (maxValue < current_value) {
                    maxValue = current_value;
                }
            }
        }
        System.out.println("The Max value of Array = "+maxValue);
    }

    public static void main(String[] args) {
        int array[] = {1,-2,6,-1,3};
        MaxOfSubArray(array);
    }
}
