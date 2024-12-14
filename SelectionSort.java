public class SelectionSort {

    public static void sort(int array[]){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        int array[] = {2,4,1,5,3,8,12};
        sort(array);
    }
}
