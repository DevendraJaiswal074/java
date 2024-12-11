public class PrefixSumArray {

    public static void SumArray(int arr[]){
        int currentV = 0;
        int maxV = -1;

        int prefixArray[] = new int[arr.length];
        prefixArray[0] = arr[0];
        for (int i = 1; i < prefixArray.length; i++) {
            prefixArray[i] = prefixArray[i-1]+arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                
                if (i == 0) {
                    currentV = prefixArray[j];
                }
                else{
                    currentV = prefixArray[j]-prefixArray[i-1];
                }

                if (maxV < currentV) {
                    maxV = currentV;
                }
            }
        }
        System.out.println("Max Value of Array is : "+maxV);
    }
    public static void main(String[] args) {
        int arr[] = {2,8,-4,-2,6,-9,-3};
        SumArray(arr);
    }
}
