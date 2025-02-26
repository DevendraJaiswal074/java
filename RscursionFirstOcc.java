//find out the first occurence of a number in an array using recursion

public class RscursionFirstOcc {

    public static int FirstOccurence(int arr[], int i, int key) {
        if (i == arr.length) {  // condition for end of array
            return -1;
        }
        if (arr[i] == key) { // if key is found then return the index
            return i;
        }
        return FirstOccurence(arr, i + 1, key); // if key is not found then call the function again with i+1
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 5 };
        int result = FirstOccurence(arr,0, 5);
        System.out.println(result);
    }
}
