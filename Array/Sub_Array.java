package Array;
/*
 * print sub array 
  2 
2 4 
2 4 6 
2 4 6 8 
2 4 6 8 10 

4 
4 6 
4 6 8
4 6 8 10

6
6 8
6 8 10

8
8 10

10
 */

public class Sub_Array {
    public static void main(String[] args) {

        int array[] = {2,4,6,8,10};
        
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    
                    System.out.printf("%d ",array[j2]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
