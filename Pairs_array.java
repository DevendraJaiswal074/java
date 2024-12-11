/*Printing the pair of Array 
(2,4) (2,6) (2,8) (2,10) 
(4,6) (4,8) (4,10) 
(6,8) (6,10) 
(8,10) 
*/

class Pairs_array {
    public static void main(String[] args) {
        int array[] = { 2,4,6,8,10};

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length-1; j++) {
                System.out.printf("(%d,%d) ",array[i],array[j+1]);
            }
            System.out.println();
        }
    }
}